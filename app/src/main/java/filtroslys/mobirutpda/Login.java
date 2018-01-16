package filtroslys.mobirutpda;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import filtroslzs.layer.entidad.*;
import filtroslzs.layer.data.*;
import filtroslys.mobirutpda.appglobal;

public class Login extends AppCompatActivity {
    Context contexto;
    appglobal app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        app = ((appglobal) getApplicationContext());
        contexto = this;
        ConfigurarIni();
        EnlazarDB();
    }

    private void ConfigurarIni() {
        String esindustrial="N";
        ZFnArchivos.configServicio(getApplicationContext());
        if(app.getEsIndustrial()!=null){
            esindustrial = app.getEsIndustrial();
        }

        esindustrial = esindustrial.trim();
        esindustrial = esindustrial.length()==0?"N":esindustrial;

        app.setEsIndustrial(esindustrial);
        if(esindustrial.equals("N")){
            app.setdbWebService("A");
        }else{
            app.setdbWebService("B");
        }
    }

    private void EnlazarDB() {
        SQLiteDatabase db;
        entDataBase entDB = app.getConexion();
        if(entDB==null){entDB = new entDataBase();}

        if(entDB.getDBaseDatos()==null){
            datCreateDB objdb = new datCreateDB(this);
            objdb.createDataBase();
            objdb.openDataBase();
            db = objdb.getManager();
            entDB.setDBaseDatos(db);
        }
        entDB.setCConexion(app.getEsIndustrial());
        app.setConexion(entDB);
        db = null;
        entDB = null;
    }

    private void CargarUsuario(){

    }


}
