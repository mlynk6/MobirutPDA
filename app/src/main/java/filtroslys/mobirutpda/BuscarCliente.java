package filtroslys.mobirutpda;

import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import filtroslzs.layer.entidad.entCliente;
import filtroslzs.layer.negocio.negCliente;
import filtroslzs.layer.adapt.AdpBuscarCliente;

public class BuscarCliente extends AppCompatActivity {
    appglobal app;
    Context contexto;
    ListView lvCliente;
    TextView txtCodigo,txtNombre;
    int nPosicion = -1;
    String sFrm="";
    ArrayList<entCliente> LstCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_cliente);

        contexto = this;
        app = ((appglobal) getApplicationContext());
        sFrm = getIntent().getExtras().getString("Formulario");

        EnlazarControles();
    }

    public void EnlazarControles() {
        lvCliente = (ListView) findViewById(R.id.lvCliente);
        txtCodigo = (TextView) findViewById(R.id.txtCodigo);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        LstCliente = new ArrayList<entCliente>();

        lvCliente.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                nPosicion = position;
                Seleccionar();
            }
        });
    }

    public void EventoBuscar(View view) {
        String sCodigo = txtCodigo.getText().toString().trim();
        String sNombre = txtNombre.getText().toString().trim();
        String sCia = String.valueOf(app.getCodCia());

        negCliente objNeg = new negCliente(app.getConexion());
        LstCliente = objNeg.ListaCliente(app.getCodigoVendedor(),sCia,sCodigo,sNombre);
        lvCliente.setAdapter(new AdpBuscarCliente(this,LstCliente,sFrm));

        LstCliente = null;
        objNeg = null;
        nPosicion = -1;
    }

    public void InicioRuta() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        String sCodigo = "";
        String sNombre = "";
        String sCia = String.valueOf(app.getCodCia());
        Date dFecha = new Date();
        int nDia = Integer.parseInt(dateFormat.format(dFecha));

        negCliente objNeg = new negCliente(app.getConexion());
        LstCliente = objNeg.ListaClienteRuta(app.getCodigoVendedor(),sCia,sCodigo,sNombre,nDia);
        lvCliente.setAdapter(new AdpBuscarCliente(this,LstCliente,sFrm));

        LstCliente = null;
        objNeg = null;
        nPosicion = -1;
    }

    public void EventoLimpiar(View view) {
        txtCodigo.setText(null);
        txtNombre.setText(null);
        nPosicion = -1;
        InicioRuta();
    }

    public void Seleccionar(){
        if (LstCliente.size() > 0 && nPosicion > -1){

            Intent intent = new Intent().setClass(this,BuscarCliente.class);
            intent.putExtra("Formulario",sFrm);
            intent.putExtra("CodCliente",LstCliente.get(nPosicion).getCodCliente());
            setResult(Activity.RESULT_OK, intent);
            this.finish();
        }
    }
}
