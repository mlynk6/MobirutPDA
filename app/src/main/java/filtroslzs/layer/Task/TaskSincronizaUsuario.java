package filtroslzs.layer.Task;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Vector;
import filtroslys.mobirutpda.Login;
import filtroslys.mobirutpda.appglobal;
import filtroslys.mobirutpda.ZGConst;
import filtroslzs.layer.negocio.negUtilDB;
import filtroslzs.layer.entidad.entUtilDB;
import filtroslzs.layer.entidad.entRptaServ;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.HttpTransportSE;

public class TaskSincronizaUsuario extends AsyncTask<Void,Void,Void>{
    ProgressDialog progressDialog;
    Context context;appglobal app;
    entRptaServ eRpta = new entRptaServ();

    public TaskSincronizaUsuario(Context context, ProgressDialog progressDialog) {
        this.context = context;
        this.progressDialog = progressDialog;
        app = ((appglobal) context.getApplicationContext());
    }

    @Override
    protected void onPreExecute(){
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        progressDialog.dismiss();
        Login UiForm = (Login)context;
        UiForm.RptaCargarUsuario(eRpta);
        UiForm=null;
    }

    @Override
    protected Void doInBackground(Void... string) {
        SoapObject request = new SoapObject(app.getSoapNamespace(),app.getSoapMetodo());
        request.addProperty("tipo", "Solicita");
        request.addProperty("codven",app.getCodigoVendedor());
        request.addProperty("tconex",app.getdbWebService());
        ArrayList<String> LstData = new ArrayList<String>();

        LstData.add("ZACC_USUARIO");
        LstData.add("ZACC_MENU");
        for (int i = 0; i < LstData.size(); i++) {
            request.addProperty(getProperty("arreglo", LstData.get(i)));
        }

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.bodyOut = request;
        envelope.setOutputSoapObject(request);
        HttpTransportSE httpTransport = new HttpTransportSE(app.getSoapUrl());
        try {
            httpTransport.call(app.getSoapAccion(), envelope);
        } catch (Exception e) {
            eRpta.setRptaServ(-1);
            eRpta.setMsjErr(e.getMessage());
        } catch (OutOfMemoryError e){
            eRpta.setRptaServ(-2);
            eRpta.setMsjErr(e.getMessage());
        }

        if (eRpta.getRptaServ() == 1) {
            Vector<String> result = null;
            try {
                result = (Vector<String>) envelope.getResponse();
            } catch (Exception e) {
                eRpta.setRptaServ(-3);
                eRpta.setMsjErr(e.getMessage());
            }

            if(eRpta.getRptaServ() == 1){
                eRpta.setCantReg(result.size());
                negUtilDB objNeg = new negUtilDB(app.getConexion());
                entUtilDB objEnt = new entUtilDB();
                objEnt.setLstDel(LstData);
                objEnt.setLstResponse(result);
                try {
                    eRpta.setRptaServ(objNeg.EjecutaDatSinc(objEnt));
                    if(eRpta.getRptaServ()==0){
                        eRpta.setMsjErr(ZGConst.ErrRptaServ);
                    }
                }catch (Exception e) {
                    eRpta.setRptaServ(-4);
                    eRpta.setMsjErr(e.getMessage());
                }
                objNeg=null;
                objEnt=null;
            }
        }
        request = null;
        envelope = null;
        httpTransport = null;
        return null;
    }

    private PropertyInfo getProperty(String name, String val) {
        PropertyInfo info = new PropertyInfo();
        info.setName(name);
        info.setValue(val);
        info.type = PropertyInfo.STRING_CLASS;
        return info;
    }
}
