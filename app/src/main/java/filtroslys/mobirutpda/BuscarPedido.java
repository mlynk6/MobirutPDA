package filtroslys.mobirutpda;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import android.view.View.OnClickListener;
import filtroslzs.layer.entidad.entCliente;
import filtroslzs.layer.entidad.entPedido;
import filtroslzs.layer.negocio.negPedido;

public class BuscarPedido extends AppCompatActivity {
    appglobal app;
    Context contexto;
    ListView lvPedido;
    TextView lblPedido,lblCliente;
    CheckBox chkEnviados;
    int nPosicion = -1;
    String sFrm="";
    ArrayList<entPedido> LstPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscar_pedido);

        contexto = this;
        app = ((appglobal) getApplicationContext());
        EnlazarControles();
    }

    public void EnlazarControles() {
        lblPedido = (TextView) findViewById(R.id.lblPedido);
        lblCliente = (TextView) findViewById(R.id.lblCliente);
        chkEnviados = (CheckBox) findViewById(R.id.ChkVerEnviados);
        lvPedido = (ListView)findViewById(R.id.lvPedido);
        LstPedido = new ArrayList<entPedido>();

        lvPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                nPosicion = position;
                Seleccionar();
            }
        });
    }

    public void Seleccionar(){
        if (LstPedido.size() > 0 && nPosicion > -1){
            /*Intent intent = new Intent().setClass(this,BuscarCliente.class);
            intent.putExtra("Formulario",sFrm);
            intent.putExtra("CodCliente",LstCliente.get(nPosicion).getCodCliente());
            setResult(Activity.RESULT_OK, intent);
            this.finish();*/
        }
    }

}
