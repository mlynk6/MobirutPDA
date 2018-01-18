package filtroslzs.layer.adapt;

import java.util.ArrayList;
import filtroslys.mobirutpda.ZFnGeneral;
import filtroslzs.layer.entidad.entCtaCteCliente;
import filtroslys.mobirutpda.R;
import android.content.Context;
import android.text.Html;
import android.view.*;
import android.widget.*;

public class AdpCuentaCteLst extends BaseAdapter {

	private LayoutInflater li;
	private ArrayList<entCtaCteCliente> LstData = new ArrayList<entCtaCteCliente>();

	public AdpCuentaCteLst(Context context, ArrayList<entCtaCteCliente> items) {
		li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (items != null)LstData = items;
	}

	public int getCount() {
		return LstData.size();
	}

	public Object getItem(int posicion) {
		return LstData.get(posicion);
	}

	public long getItemId(int posicion) {
		return posicion;
	}

	public View getView(int posicion, View convertView, ViewGroup parent) {
		View v = convertView;
		final TextView txtNumDoc, txtMoneda, txtDeuda, txtFecVenc, txtDias, txtCodigoUnico, txtBanco,txtEstado;
		final LinearLayout lay_codybanco,lay_otros;
		final TextView txtPermitido,txtCiaSec,txtLineaCredito,txtObservacion,txtDocAsociado,txtTextoHtml;
		final entCtaCteCliente EData = LstData.get(posicion);
		String sEstado = "";

		if (v == null) {
			v = li.inflate(R.layout.inform_cliente_ctacte, null);
		}

		txtNumDoc = (TextView) v.findViewById(R.id.lblNumDoc);
		txtNumDoc.setText(EData.getNumDoc());

		txtMoneda = (TextView) v.findViewById(R.id.lblMoneda);
		txtMoneda.setText(EData.getCodMoneda());

		txtDeuda = (TextView) v.findViewById(R.id.lblDeuda);
		txtDeuda.setText(ZFnGeneral.redondearDecimales(String.valueOf(EData.getMontoDeudaActual())));

		txtFecVenc = (TextView) v.findViewById(R.id.lblFecha);
		txtFecVenc.setText(ZFnGeneral.getStringFecha(EData.getFecVencimiento()));

		txtDias = (TextView) v.findViewById(R.id.lblDias);
		txtDias.setText(String.valueOf(EData.getDiasVencimiento()));

		sEstado = EData.getEstado()==null?"":EData.getEstado();
		if(sEstado.length()>0){
			sEstado = "(" + sEstado + ")";
		}
		
		txtEstado = (TextView) v.findViewById(R.id.lblEstado);
		txtEstado.setText(sEstado);
		
		txtCodigoUnico = (TextView) v.findViewById(R.id.lblCodigoUnico);
		if (!(EData.getCodigoUnico() == null))
			txtCodigoUnico.setText(EData.getCodigoUnico());
		else
			txtCodigoUnico.setText("NO REGISTRA");

		txtBanco = (TextView) v.findViewById(R.id.lblBanco);
		if (!(EData.getBanco() == null))
			txtBanco.setText(EData.getBanco());

		lay_codybanco = (LinearLayout) v.findViewById(R.id.lay_codybanco);
		lay_codybanco.setVisibility(View.VISIBLE);
		if (EData.getCodigoUnico() == null && EData.getBanco() == null)
			lay_codybanco.setVisibility(View.GONE);

		txtPermitido = (TextView) v.findViewById(R.id.lblPermitido);
		txtPermitido.setText(EData.getFlagPermitir().equals("S")?"SI":"NO");
		
		txtCiaSec = (TextView) v.findViewById(R.id.lblCiaSec);
		txtCiaSec.setText("(" + EData.getDescCia() + ")");
		
		txtLineaCredito = (TextView) v.findViewById(R.id.lblLineaCredito);
		if(EData.getCodLinea()!=null){
			txtLineaCredito.setText(EData.getCodLinea());
		}
		
		txtObservacion = (TextView) v.findViewById(R.id.lblObservacion);
		if(EData.getObservacion()!=null){
			txtObservacion.setText(EData.getObservacion());
		}
		
		txtDocAsociado = (TextView) v.findViewById(R.id.lblDocAsociado);
		if(EData.getDocAsociado()!=null){
			txtDocAsociado.setText(EData.getDocAsociado());
		}
		
		txtTextoHtml = (TextView) v.findViewById(R.id.lblTextoHtml);
		if(EData.getTextoHtml()!=null){
			txtTextoHtml.setText(Html.fromHtml(EData.getTextoHtml()));
		}
		
		lay_otros = (LinearLayout) v.findViewById(R.id.lay_otros);
		lay_otros.setVisibility(View.VISIBLE);
		if (EData.getDocAsociado() == null && EData.getTextoHtml() == null)
			lay_otros.setVisibility(View.GONE);
		
		return v;
	}
}
