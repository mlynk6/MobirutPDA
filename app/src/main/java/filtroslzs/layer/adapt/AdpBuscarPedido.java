package filtroslzs.layer.adapt;

import java.util.ArrayList;
import filtroslys.mobirutpda.ZFnGeneral;
import filtroslzs.layer.entidad.entPedido;
import filtroslys.mobirutpda.R;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class AdpBuscarPedido extends BaseAdapter {
	private LayoutInflater li;
	private ArrayList<entPedido> LstData = new ArrayList<entPedido>();

	public AdpBuscarPedido(Context context, ArrayList<entPedido> items) {
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
		final TextView txtPedido,txtCliente,txtRazonSocial,txtFecRegistro,txtFecModifica,txtNroCotizacion;
		final entPedido EData = LstData.get(posicion);
		if (v == null) {
			v = li.inflate(R.layout.buscar_pedido_item, null);
		}

		txtPedido = (TextView) v.findViewById(R.id.lblCodigoPedido);
		txtPedido.setText(String.valueOf(EData.getCodPedido()));

		txtCliente = (TextView) v.findViewById(R.id.lblCodigoCliente);
		txtCliente.setText(String.valueOf(EData.getCodCliente()));

		txtRazonSocial = (TextView) v.findViewById(R.id.lblNombre);
		txtRazonSocial.setText(String.valueOf(EData.getRazonSocial()));

		txtFecRegistro = (TextView) v.findViewById(R.id.lblFRegistro);
		txtFecRegistro.setText(ZFnGeneral.getStringFecha(EData.getFecRegistro()));

		txtFecModifica = (TextView) v.findViewById(R.id.lblFModifica);
		txtFecModifica.setText(ZFnGeneral.getStringFecha(EData.getFecModif()));

		txtNroCotizacion = (TextView) v.findViewById(R.id.lblNCotiza);
		if (EData.getCodCotiza() == 0) {
			txtNroCotizacion.setText("SC");
		} else {
			txtNroCotizacion.setText(String.valueOf(EData.getCodCotiza()));
		}
		return v;
	}

}
