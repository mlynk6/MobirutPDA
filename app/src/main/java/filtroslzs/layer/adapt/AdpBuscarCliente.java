package filtroslzs.layer.adapt;

import filtroslys.mobirutpda.R;
import java.util.ArrayList;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import filtroslzs.layer.entidad.entCliente;

public class AdpBuscarCliente extends BaseAdapter {

	private LayoutInflater li;
	private ArrayList<entCliente> LstData = new ArrayList<entCliente>();

	public AdpBuscarCliente(Context context, ArrayList<entCliente> items, String sFrm) {
		li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (items != null) LstData = items;
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
		final TextView txtCodigo, txtNombre, txtDireccion, txtDescuento, txtSegmento, txtCanal, txtHtmlLst;
		String sHtml = "";

		final entCliente ECliente = LstData.get(posicion);
		if (v == null) {
			v = li.inflate(R.layout.buscar_cliente_item, null);
		}

		txtCodigo = (TextView) v.findViewById(R.id.lblCodigo);
		txtCodigo.setText(String.valueOf(ECliente.getCodCliente()));

		txtNombre = (TextView) v.findViewById(R.id.lblNombre);
		txtNombre.setText(ECliente.getRazSocial());

		txtDireccion = (TextView) v.findViewById(R.id.lblDireccion);
		txtDireccion.setText(ECliente.getDireccion());

		txtDescuento = (TextView) v.findViewById(R.id.lblDescuento);
		txtDescuento.setText(ECliente.getDescuento());

		txtSegmento = (TextView) v.findViewById(R.id.lblSegmento);
		if (ECliente.getSegmento() != null) {
			txtSegmento.setText(ECliente.getSegmento());
		}

		txtHtmlLst = (TextView) v.findViewById(R.id.lblHtmlLst);
		if (ECliente.getTextoLstHtml() != null) {
			sHtml = ECliente.getTextoLstHtml();
		}
		txtHtmlLst.setText(Html.fromHtml(sHtml));
		
		txtCanal = (TextView) v.findViewById(R.id.lblCanal);
		if (ECliente.getTipoCategoria() != null) {
			txtCanal.setText(ECliente.getTipoCategoria());
		}

		return v;
	}

}
