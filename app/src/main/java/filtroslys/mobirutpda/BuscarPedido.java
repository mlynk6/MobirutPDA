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
import filtroslzs.layer.entidad.entPedido;
import filtroslzs.layer.negocio.negPedido;

public class BuscarPedido extends AppCompatActivity {
    appglobal app;
    Context contexto;
    ListView lvPedido;
    TextView txtPedido,txtCliente;
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
        txtPedido = (TextView) findViewById(R.id.txtPedido);
        txtCliente = (TextView) findViewById(R.id.txtCliente);
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

    public void EventoBuscar(View view) {
        BuscarRegistro();
    }

    public void BuscarRegistro() {
        negPedido objNeg = new negPedido(app.getConexion());
        String sSinc = (chkEnviados.isChecked()) ? ZGConst.ValorSi : ZGConst.ValorNo;
        String sPedido = txtPedido.getText().toString().trim();
        String sCliente = txtCliente.getText().toString().trim();
        String sCodCia = String.valueOf(app.getCodCia());

        LstPedido = objNeg.ListaPedido(sPedido,sCliente,sCodCia,sSinc);
        //lvdatos.setAdapter(new BuscarPedidoadp(this, pedidos));
        objNeg = null;
        nPosicion = -1;
    }

}
