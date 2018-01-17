package filtroslys.mobirutpda;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import filtroslzs.layer.Task.TaskSincronizaUsuario;
import filtroslzs.layer.entidad.*;
import filtroslzs.layer.data.*;
import filtroslzs.layer.negocio.*;

public class Login extends AppCompatActivity {
    Context contexto;
    appglobal app;
    SharedPreferences preferences;
    Button btnLogin;
    EditText txtUsuario , txtClave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        app = ((appglobal) getApplicationContext());
        preferences = PreferenceManager.getDefaultSharedPreferences(Login.this);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtClave = (EditText) findViewById(R.id.txtPass);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtUsuario.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        txtClave.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        contexto = this;
        ConfigurarIni();
        EnlazarDB();
        //CargarUsuario();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sUser , sClave  ;
                sUser= txtUsuario.getText().toString().trim();
                sClave = txtClave.getText().toString().trim();
                if (TextUtils.isEmpty(sUser) || TextUtils.isEmpty(sClave)){
                    CreateCustomToast("Falta ingresar el usuario y/o contraseña.",ZGConst.icon_warning,ZGConst.layot_warning);
                    return;
                }
                else{
                    if  (app.getUsuarioMaestroID().equals(sUser) && app.getUsuarioMaestroPW().equals(sClave)){
                        CargarUsuario();
                    }
                    else {
                        entDataBase entDB = app.getConexion();
                        negZaccUser negZaccUser = new negZaccUser(entDB);
                        entZaccUser zuser= negZaccUser.AutenticaUsuario(sUser,ZFnGeneral.EncriptarPassword(sClave));
                        if (TextUtils.isEmpty(zuser.getUsuario())){
                            CreateCustomToast("Usuario o clave incorrecta",ZGConst.icon_error,ZGConst.layout_error);
                            return;
                        }
                        else {
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("CodUsuario", zuser.getUsuario());
                            editor.putString("NomUsuario",zuser.getNombre());
                            editor.putString("MailUsuario",zuser.getCorreo());
                            editor.commit();
                            Intent intent = new Intent(Login.this,InicioMenu.class);
                            startActivity(intent);

                        }

                    }
                }
            }
        });
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
        ProgressDialog progressDialog;
        progressDialog= new ProgressDialog(Login.this);
        progressDialog.setTitle("Sincronizando");
        progressDialog.setMessage("Sincronizando Usuario .. espere por favor..");
        //progressDialog.setIcon(R.drawable.icn_sync_48);
        try {
            TaskSincronizaUsuario objTask = new TaskSincronizaUsuario(contexto,progressDialog);
            objTask.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RptaCargarUsuario(entRptaServ oEnt){
        if(oEnt.getRptaServ()==1){
            Toast.makeText(contexto,"Se ha cargado corretamente informacion",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(contexto,oEnt.getMsjErr(),Toast.LENGTH_LONG).show();
        }

    }

    public void CreateCustomToast(String msj, int icon, int backgroundLayout)
    {

        LayoutInflater infator = getLayoutInflater();
        View layout = infator.inflate(R.layout.toast_custom, (ViewGroup) findViewById(R.id.toastlayout));
        TextView toastText = (TextView) layout.findViewById(R.id.txtDisplayToast);
        ImageView imgIcon = (ImageView) layout.findViewById(R.id.imgToastSucc);
        LinearLayout parentLayout = (LinearLayout) layout.findViewById(R.id.toastlayout);
        imgIcon.setImageResource(icon);
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            parentLayout.setBackgroundDrawable(getResources().getDrawable(backgroundLayout));
        } else {
            parentLayout.setBackground(getResources().getDrawable(backgroundLayout));
        }


        toastText.setText(msj);
        Toast toast = new Toast(Login.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


    }

}
