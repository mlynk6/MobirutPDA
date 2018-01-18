package filtroslzs.layer.Task;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import java.util.ArrayList;
import java.util.Vector;
import filtroslys.mobirutpda.Login;
import filtroslys.mobirutpda.ZGConst;
import filtroslys.mobirutpda.appglobal;
import filtroslzs.layer.entidad.entRptaServ;
import filtroslzs.layer.entidad.entUtilDB;
import filtroslzs.layer.negocio.negUtilDB;

public class TaskSincronizaSolicita extends AsyncTask<Void,Void,Void>{
    ProgressDialog progressDialog;
    Context context;appglobal app;
    entRptaServ eRpta = new entRptaServ();
    ArrayList<String> LstMenu;

    public TaskSincronizaSolicita(Context context, ProgressDialog progressDialog, ArrayList<String> LstMenu) {
        this.context = context;
        this.progressDialog = progressDialog;
        app = ((appglobal) context.getApplicationContext());
        this.LstMenu = LstMenu;
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

        for(int i=0;i<LstMenu.size();i++){
            switch (LstMenu.get(i)){
                case "VALIDA":
                    LstData.add("sp_validar_contraseña");
                    break;
                case "MAESTRO":
                    LstData.add("TBC_COMPAÑIA");
                    LstData.add("TBD_VENDXCIA");
                    LstData.add("TBC_VENDEDOR");
                    LstData.add("TBC_CATEGORIA");
                    LstData.add("TBC_CATEGORIAXCIA");
                    LstData.add("TBC_TIPOSISTEMAVENTA");
                    LstData.add("TBC_SISTEMAVENTA");
                    LstData.add("TBC_COMPAÑIA_REL");
                    LstData.add("TBD_VENDXCIA_REL");
                    LstData.add("TBC_SISTEMAVENTA_REL");
                    LstData.add("TBC_PARAMETROS");
                    LstData.add("TBC_MONEDA");
                    LstData.add("TBC_BANCO");
                    LstData.add("TBC_TIPONEGOCIO");
                    LstData.add("TBC_DSCTOXMONTO");
                    LstData.add("TBC_PROMMONEDA");
                    LstData.add("TBC_ESTADOPEDIDO");
                    LstData.add("TBC_OBSERVACIONESPED");
                    LstData.add("TBC_AGENCIATRANSPORTE");
                    LstData.add("MVC_MOTIVOVISITA");
                    LstData.add("TBC_MOTIVOVISITA_RPTA");
                    LstData.add("TBC_OPCIONESITEMS");
                    LstData.add("TBC_CLASIFICACIONLLAMADA");
                    LstData.add("TBC_TIPOLLAMADA");
                    LstData.add("TBC_LLAMADAS");
                    LstData.add("TBC_MOTNOCARTERA");
                    LstData.add("TBC_PARAMTABLA");
                case "CLIENTE":
                    LstData.add("TBC_CLIENTE");
                    LstData.add("TBD_DIRECCIONENVIO");
                    LstData.add("TBD_CREDITOXCLIENTE");
                    LstData.add("TBC_CTACTECLIENTE");
                    LstData.add("TBC_MONTOACUMESXCLIENTE");
                    LstData.add("TBC_CLIENTEITEMMINIMO");
                    LstData.add("TBC_TIPOCATEGORIACLIENTE");
                    LstData.add("TBC_SEGMENTOCLIENTE");
                    LstData.add("TBC_CLIENTETELEFONO");
                    LstData.add("TBC_MARATON");
                    LstData.add("TBC_CLIENTEITEMDSC");
                    LstData.add("TBC_ITEMSEGMENTOCAT");
                    LstData.add("TBC_DSCTOXCLIENTEITEM");
                    break;
                case "ADICIONAL":
                    LstData.add("TBC_CATECLIENTEXCIA");
                    LstData.add("TBC_SISTEMAVENTACIAXCLIENTE");
                    break;
                case "PRODUCTO":
                    LstData.add("TBC_PRODUCTO");
                    LstData.add("TBC_PREFIJOPRO");
                    LstData.add("TBC_SUFIJOPRO");
                    LstData.add("TBC_PROCEDENCIA");
                    LstData.add("TBC_PORDESCXCIA");
                    LstData.add("TBC_PRECIOPRODXCIA");
                    LstData.add("TBC_PRODUCTOSCOMPE");
                    LstData.add("TBC_ITEMSDATATECNICA");
                    LstData.add("TBC_PROMOCIONPROPORCION");
                    LstData.add("TBC_PROMOCIONDIASL");
                    LstData.add("TBC_PROMOCIONPARTIR");
                    LstData.add("TBC_PROMOCIONSMLITEM");
                    break;
                case "OFERTA":
                    LstData.add("TBC_OFERTAS");
                    break;
                case "PRECIONETO":
                    LstData.add("TBC_PRECIONETOPROD");
                    break;
                case "RUTEO":
                    LstData.add("TBC_CLIENTERUTA");
                    break;
                case "STOCK":
                    LstData.add("TBC_STOCK");
                    break;
                case "LISTAKIT":
                    LstData.add("TBC_KITS");
                    LstData.add("TBC_APLICACIONES");
                    break;
                case "OTROAMES":
                    LstData.add("TBC_MARCA");
                    LstData.add("TBC_MODELO");
                    break;
            }
        }

        for (int i=0;i<LstData.size();i++) {
            request.addProperty(getProperty("arreglo", LstData.get(i)));
        }

        ArrayList<String> LstInfo = new ArrayList<String>();
        LstInfo.add("MVC_PEDIDO");
        LstInfo.add("MVD_PEDIDO");
        LstInfo.add("MVD_VISITA");
        LstInfo.add("TBD_OFERTAXPEDIDO");
        LstInfo.add("MVC_COTIZACION");
        LstInfo.add("MVD_COTIZACION");
        LstInfo.add("TBD_OFERTAXCOTIZACION");
        LstInfo.add("TBC_RECLAMOGARANTIA");
        LstInfo.add("TBC_GESTIONES");
        LstInfo.add("XMOD_CLIENTE");
        LstInfo.add("XMOD_DIRECCIONENVIO");
        LstInfo.add("XMOD_TELEFONOCLIENTE");
        LstInfo.add("MVD_CUOTALETRA");

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
                objEnt.setLstInfo(LstInfo);
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
