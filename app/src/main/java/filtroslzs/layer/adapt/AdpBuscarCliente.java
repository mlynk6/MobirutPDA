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

		final entCliente EData = LstData.get(posicion);
		if (v == null) {
			v = li.inflate(R.layout.buscar_cliente_item, null);
		}

		txtCodigo = (TextView) v.findViewById(R.id.lblCodigo);
		txtCodigo.setText(String.valueOf(EData.getCodCliente()));

		txtNombre = (TextView) v.findViewById(R.id.lblNombre);
		txtNombre.setText(EData.getRazSocial());

		txtDireccion = (TextView) v.findViewById(R.id.lblDireccion);
		txtDireccion.setText(EData.getDireccion());

		txtDescuento = (TextView) v.findViewById(R.id.lblDescuento);
		txtDescuento.setText(EData.getDescuento());

		txtSegmento = (TextView) v.findViewById(R.id.lblSegmento);
		if (EData.getSegmento() != null) {
			txtSegmento.setText(EData.getSegmento());
		}

		txtHtmlLst = (TextView) v.findViewById(R.id.lblHtmlLst);
		if (EData.getTextoLstHtml() != null) {
			sHtml = EData.getTextoLstHtml();
		}
		txtHtmlLst.setText(Html.fromHtml(sHtml));
		
		txtCanal = (TextView) v.findViewById(R.id.lblCanal);
		if (EData.getTipoCategoria() != null) {
			txtCanal.setText(EData.getTipoCategoria());
		}

		return v;
	}

}
