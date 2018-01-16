package filtroslzs.layer.Task;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;
import filtroslys.mobirutpda.appglobal;

public class SincronizaUsuario extends AsyncTask<Void,Void,Void>{
    ProgressDialog progressDialog;
    Context context ;
    appglobal app;

    public SincronizaUsuario(Context context,ProgressDialog progressDialog) {
        this.context = context;
        this.progressDialog = progressDialog;
        app = ((appglobal) context.getApplicationContext());
    }

    @Override
    protected void onPreExecute(){
        progressDialog.show();
    }


    @Override
    protected Void doInBackground(Void... string) {
        /*SoapObject request = new SoapObject(app.getSoapNamespace(),app.getSoapMetodo());
        request.addProperty("tipo", "Solicita");
        request.addProperty("codven",app.getCodigoVendedor());
        request.addProperty("tconex",app.getdbWebService());

        condicionpedidoneg objNCondPed = new condicionpedidoneg(app.getConexion());
        ArrayList<String> datos = new ArrayList<String>();

        datos.add("TBC_STOCK");
        respuestaservidor = 1;
        strErr = "";

        array = new String[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            array[i] = datos.get(i);
            request.addProperty(getProperty("arreglo", datos.get(i)));
        }

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        envelope.bodyOut = request;
        envelope.setOutputSoapObject(request);

        HttpTransportSE httpTransport = new HttpTransportSE(
                app.getSoapUrl());
        try {
            httpTransport.call(app.getSoapAccion(), envelope);
        } catch (Exception e) {
            respuestaservidor = -1;
            strErr = e.getMessage();
        } catch (OutOfMemoryError e){
            respuestaservidor = -2;
            strErr = e.getMessage();
        }

        if (respuestaservidor == 1) {
            Vector<String> result = null;
            try {
                result = (Vector<String>) envelope.getResponse();
            } catch (Exception e) {
                respuestaservidor = -3;
                strErr = e.getMessage();
            }

            if(respuestaservidor == 1){
                array = cambiar(array);
                objNCondPed.eliminarInformacion(array);

                queryResponse = new String[result.size() - 1];
                String valor="";
                for (int i = 1; i < result.size(); i++) {
                    valor = String.valueOf(result.get(i));
                    queryResponse[i - 1] = valor;
                }
                try {
                    respuestaservidor = objNCondPed.insertaResponse(queryResponse);
                }catch (Exception e) {
                    respuestaservidor = -4;
                    strErr = e.getMessage();
                }
            }
        }
        objNCondPed = null;
        request = null;
        envelope = null;
        httpTransport = null;
        return null;*/
        return null;
    }



    @Override
    protected void onPostExecute(Void aVoid) {
        //super.onPostExecute(result);
        /*progressDialog.dismiss();
        String mensaje="";

        if (strErr == null || strErr.equals("null")) {
            strErr = "";
        }

        if (respuestaservidor == 1) {
            Dialogos.DialogToast(contexto,"La informaci�n ha sido registrada correctamente en su equipo.",false);
            ActualizarStockPedido();
        }else if (respuestaservidor == 0)
            mensaje = "Error al insertar la informaci�n vuelve a intentar.";
        else if (respuestaservidor == -4)
            mensaje = "Error Insertando(Response) " + strErr;
        else if (respuestaservidor == -3)
            mensaje = "Error en Transporte de Infomaci�n(HTTPResponse), Cantidad reg=0 " + strErr;
        else if (respuestaservidor == -2)
            mensaje = "No hay suficiente memoria, revisar por favor(HTTPTransport) " + strErr;
        else if (respuestaservidor == -1)
            mensaje = "Error en Transporte de Infomaci�n(HTTPTransport) " + strErr;
        if(mensaje.length()>0){
            Dialogos.DialogToast(contexto,mensaje,true);
        }*/
    }


}
