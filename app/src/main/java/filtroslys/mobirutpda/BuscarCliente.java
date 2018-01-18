package filtroslys.mobirutpda;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class BuscarCliente extends AppCompatActivity {
    appglobal app;
    Context contexto;
    ListView lvCliente;
    TextView txtCodigo,txtNombre;
    int posicion = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_cliente);

        app = ((appglobal) getApplicationContext());
        contexto = this;
        EnlazarControles();

        lvCliente.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                posicion = position;
                Seleccionar();
            }
        });
    }

    public void EnlazarControles() {
        lvCliente = (ListView) findViewById(R.id.lvCliente);
        txtCodigo = (TextView) findViewById(R.id.txtCodigo);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
    }

    // Ejecuta el evento del boton buscar
    public void EventoBuscar(View view) {
        String sCodigo = txtCodigo.getText().toString().trim();
        String sNombre = txtNombre.getText().toString().trim();
        String sCia = String.valueOf(app.getCodCia());

        negCliente objNeg = new negCliente(app.getConexion());
        ArrayList<entCliente> LstCliente =
                objNeg.ListaCliente(app.getCodigoVendedor(),sCia,sCodigo,sNombre);
        //lvdatos.setAdapter(new BuscarClienteF1adp(this, clientes));

        LstCliente = null;
        objNeg = null;
        posicion = -1;
    }

    public void InicioRuta() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        String sCodigo = "";
        String sNombre = "";
        String sCia = String.valueOf(app.getCodCia());
        Date dFecha = new Date();
        int nDia = Integer.parseInt(dateFormat.format(dFecha));

        negCliente objNeg = new negCliente(app.getConexion());
        ArrayList<entCliente> LstCliente =
                objNeg.ListaClienteRuta(app.getCodigoVendedor(),sCia,sCodigo,sNombre,nDia);

        //lvdatos.setAdapter(new BuscarClienteF1adp(this, clientes));

        LstCliente = null;
        objNeg = null;
        posicion = -1;
    }

    // Ejecuta el evento del boton limpiar
    public void EventoLimpiar(View view) {
        txtCodigo.setText(null);
        txtNombre.setText(null);
        posicion = -1;
        InicioRuta();
    }

    public void Seleccionar(){

    }

}
