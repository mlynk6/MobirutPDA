package filtroslzs.layer.adapt;

import java.util.ArrayList;
import filtroslzs.layer.entidad.entTelefono;
import filtroslys.mobirutpda.R;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class AdpTelefonoCmb extends BaseAdapter {

	private LayoutInflater li;
	private ArrayList<entTelefono> LstData = new ArrayList<entTelefono>();

	public AdpTelefonoCmb(Context context, ArrayList<entTelefono> items) {
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
		String sTipo = "",sTelef="";
		final TextView lblCodigo, lblNombre;
		final entTelefono EData = LstData.get(posicion);
		if (v == null) {
			v = li.inflate(R.layout.modelo_combo, null);
		}

		sTipo = EData.getClasificaTelefono();
		if (sTipo.equals("F")) {
			sTipo = "(FIJO)";
		} else if (sTipo.equals("C")) {
			sTipo = "(CELULAR)";
		} else if (sTipo.equals("X")) {
			sTipo = "(FAX)";
		} else if (sTipo.equals("O")) {
			sTipo = "(OTROS)";
		} else {
			sTipo = "";
		}
		sTelef = EData.getTelefono().trim() + " " + sTipo;
		lblCodigo = (TextView) v.findViewById(R.id.lblCodigo);
		lblCodigo.setText(sTelef);

		lblNombre = (TextView) v.findViewById(R.id.lblNombre);
		lblNombre.setText(sTelef);

		return v;
	}

}
