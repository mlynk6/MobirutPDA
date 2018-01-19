package filtroslys.mobirutpda;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import filtroslys.mobirutpda.appglobal;
import filtroslzs.layer.adapt.AdpCuentaCteLst;
import filtroslzs.layer.adapt.AdpLineaCredLst;
import filtroslzs.layer.adapt.AdpTelefonoCmb;
import filtroslzs.layer.entidad.entCliente;
import filtroslzs.layer.entidad.entCreditoxCliente;
import filtroslzs.layer.entidad.entCtaCteCliente;
import filtroslzs.layer.entidad.entTelefono;
import filtroslzs.layer.negocio.negCliente;

public class InformCliente extends AppCompatActivity {
    appglobal app;
    Context contexto;
    LinearLayout layerGarante,layerTextoRegHtml;
    TextView lblCodigo,lblNombre,lblDocFiscal,lblDireccion,lblSegmento,lblCategoria;
    TextView lblAgenteRetencion,lblGarante,lblTextoHtmlReg,lblCantLetras,lblTituloLineaCredito;
    TextView lblDocumento;
    ListView lvLinCre,lvCtaCte;
    Spinner cboTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inform_cliente);

        contexto = this;
        app = ((appglobal) getApplicationContext());
        EnlazarControles();
        CargaDatosClientes();
    }

    public void EnlazarControles() {
        lvLinCre = (ListView) findViewById(R.id.lvLineaCred);
        lvCtaCte = (ListView) findViewById(R.id.lvCtaCte);

        lblCodigo = (TextView) findViewById(R.id.lblCodigo);
        lblNombre = (TextView) findViewById(R.id.lblNombre);
        lblDocFiscal = (TextView) findViewById(R.id.lblDocFiscal);
        lblDireccion = (TextView) findViewById(R.id.lblDireccion);
        lblSegmento = (TextView) findViewById(R.id.lblSegmento);
        lblCategoria = (TextView) findViewById(R.id.lblCategoria);
        lblAgenteRetencion = (TextView) findViewById(R.id.lblAgenteRetencion);
        layerGarante = (LinearLayout) findViewById(R.id.layerGarante);
        lblGarante = (TextView) findViewById(R.id.lblGarante);
        layerTextoRegHtml = (LinearLayout) findViewById(R.id.layerTextoHtmlReg);
        lblTextoHtmlReg = (TextView) findViewById(R.id.lblTextoHtmlReg);
        cboTelefono = (Spinner) findViewById(R.id.cboTelefono);
        lblCantLetras = (TextView) findViewById(R.id.lblCantLetras);
        lblTituloLineaCredito = (TextView) findViewById(R.id.lblTituloLineaCredito);
        lblDocumento= (TextView) findViewById(R.id.lblDocumento);
    }

    public void CargaDatosClientes() {
        String sCat = "";double nDocPorc = 0;
        String sCli = String.valueOf(app.getClienteId());
        String sCia = String.valueOf(app.getCodCia());
        negCliente objNClie = new negCliente(app.getConexion());
        entCliente ECliente = new entCliente();

        if (app.getClienteId() > 0) {
            ECliente = objNClie.GetClienteForm(sCli,sCia);
        }

        if(ECliente.getCodCliente()>0){
            lblCodigo.setText(sCli);
            lblNombre.setText(ECliente.getRazSocial().trim());
            lblDireccion.setText(ECliente.getDireccion().trim());
            if (!(ECliente.getAgenteRetencion() == null)) {
                lblAgenteRetencion.setText((ECliente.getAgenteRetencion().equals("S")) ? "SI" : "NO");
            } else
                lblAgenteRetencion.setText("NO");
            lblGarante.setText("");
            lblSegmento.setText("");
            if (ECliente.getGarante() != null) {
                lblGarante.setText(ECliente.getGarante().trim());
            }
            if (ECliente.getTextoRegHtml()!= null) {
                lblTextoHtmlReg.setText(Html.fromHtml(ECliente.getTextoRegHtml()));
            }
            if (ECliente.getSegmento() != null) {
                lblSegmento.setText(ECliente.getSegmento());
            }
            if (ECliente.getTipoCategoria() != null) {
                sCat = ECliente.getTipoCategoria();
                sCat = sCat.substring(0,(sCat.length() > 3) ? 2 : sCat.length());
                sCat = sCat.toUpperCase();
                lblCategoria.setText(sCat);
            }
            nDocPorc = ECliente.getPorcentajeDoc();
            nDocPorc = ZFnGeneral.Redondear(nDocPorc, 2);
            lblDocumento.setText(String.valueOf(nDocPorc));

            layerGarante.setVisibility(View.VISIBLE);
            if (ECliente.getGarante() == null)
                layerGarante.setVisibility(View.GONE);

            layerTextoRegHtml.setVisibility(View.VISIBLE);
            if (ECliente.getTextoRegHtml() == null)
                layerTextoRegHtml.setVisibility(View.GONE);

            if (!(ECliente.getDocFiscal() == null))
                lblDocFiscal.setText(ECliente.getDocFiscal().trim());

            lblCantLetras.setText("Stock Let: " + String.valueOf(ECliente.getCanLetras()));
        }else{
            lblCodigo.setText("");
            lblNombre.setText("");
            lblDireccion.setText("");
            lblAgenteRetencion.setText("");
            lblGarante.setText("");
            lblTextoHtmlReg.setText("");
            lblSegmento.setText("");
            lblCategoria.setText("");
            lblDocFiscal.setText("");
            lblCantLetras.setText("");
            lblDocumento.setText("");
            layerGarante.setVisibility(View.GONE);
            layerTextoRegHtml.setVisibility(View.GONE);
        }

        //Linea Credito cliente
        ArrayList<entCreditoxCliente> LstLinCre = new ArrayList<entCreditoxCliente>();
        LstLinCre = objNClie.ListaLineaCredito(sCli,sCia);
        lvLinCre.setAdapter(new AdpLineaCredLst(contexto,LstLinCre));

        //Cta cte. Cliente
        ArrayList<entCtaCteCliente> LstCtaCte = new ArrayList<entCtaCteCliente>();
        LstCtaCte = objNClie.ListaCuentaCorriente(sCli);
        lvCtaCte.setAdapter(new AdpCuentaCteLst(contexto,LstCtaCte));

        ZFnResizer.setListViewResizable(lvLinCre);
        ZFnResizer.setListViewResizable(lvCtaCte);

        //Telefonos
        ArrayList<entTelefono> LstTelefono = new ArrayList<entTelefono>();
        LstTelefono = objNClie.ListaTelefonoCombo(sCli,ZGConst.TxtNinguno);
        cboTelefono.setSelection(0, false);
        cboTelefono.setAdapter(new AdpTelefonoCmb(this,LstTelefono));
        if (LstTelefono.size() > 1) {
            cboTelefono.setSelection(1);
        }
    }
}
