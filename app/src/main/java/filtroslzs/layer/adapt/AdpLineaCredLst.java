package filtroslzs.layer.adapt;

import java.util.ArrayList;
import filtroslzs.layer.entidad.entCreditoxCliente;
import filtroslys.mobirutpda.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdpLineaCredLst extends BaseAdapter {

	private LayoutInflater li;
	private ArrayList<entCreditoxCliente> LstData = new ArrayList<entCreditoxCliente>();

	public AdpLineaCredLst(Context context, ArrayList<entCreditoxCliente> items) {
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
		final TextView txtMonedaAprobadoOrigen, txtAprobadoOrigen, txtMonedaDisponibleOrigen, txtDisponibleOrigen;
		final TextView txtMonedaAprobadoDestino, txtAprobadoDestino, txtMonedaDisponibleDestino, txtDisponibleDestino;
		final LinearLayout layer_disponible;
		String MonedaOrigen, MonDestino;
		double AprOrig = 0, AprDest = 0, DispOrig = 0, DispDest = 0, tcambio = 0;
		final entCreditoxCliente EData = LstData.get(posicion);

		if (v == null) {
			v = li.inflate(R.layout.inform_cliente_lincre, null);
		}

		if (EData.getCodMoneda() == 1) {
			MonedaOrigen = EData.getSimboloDest();
			MonDestino = EData.getSimbolo();
			tcambio = EData.getTCambio();
			tcambio = (tcambio == 0 ? 1 : tcambio);
			AprDest = EData.getMontoAsignado();
			DispDest = EData.getMontoDisponible();
			AprOrig = AprDest / tcambio;
			DispOrig = DispDest / tcambio;
		} else {
			MonedaOrigen = EData.getSimbolo();
			MonDestino = EData.getSimboloDest();
			tcambio = EData.getTCambio();
			tcambio = (tcambio == 0 ? 1 : tcambio);
			AprOrig = EData.getMontoAsignado();
			DispOrig = EData.getMontoDisponible();
			AprDest = AprOrig * tcambio;
			DispDest = DispOrig * tcambio;
		}

		txtMonedaAprobadoOrigen = (TextView) v.findViewById(R.id.lblMonedaAprobadoOrigen);
		txtAprobadoOrigen = (TextView) v.findViewById(R.id.lblAprobadoOrigen);
		txtMonedaDisponibleOrigen = (TextView) v.findViewById(R.id.lblMonedaDisponibleOrigen);
		txtDisponibleOrigen = (TextView) v.findViewById(R.id.lblDisponibleOrigen);
		txtMonedaAprobadoDestino = (TextView) v.findViewById(R.id.lblMonedaAprobadoDestino);
		txtAprobadoDestino = (TextView) v.findViewById(R.id.lblAprobadoDestino);
		txtMonedaDisponibleDestino = (TextView) v.findViewById(R.id.lblMonedaDisponibleDestino);
		txtDisponibleDestino = (TextView) v.findViewById(R.id.lblDisponibleDestino);

		txtMonedaAprobadoOrigen.setText(MonedaOrigen);
		txtAprobadoOrigen.setText(ZFnGeneral.redondearDecimales(String.valueOf(AprOrig)));
		txtMonedaDisponibleOrigen.setText(MonedaOrigen);
		txtDisponibleOrigen.setText(ZFnGeneral.redondearDecimales(String.valueOf(DispOrig)));

		txtMonedaAprobadoDestino.setText(MonDestino);
		txtAprobadoDestino.setText(ZFnGeneral.redondearDecimales(String.valueOf(AprDest)));
		txtMonedaDisponibleDestino.setText(MonDestino);
		txtDisponibleDestino.setText(ZFnGeneral.redondearDecimales(String.valueOf(DispDest)));

		layer_disponible = (LinearLayout) v.findViewById(R.id.layer_disponible);
		layer_disponible.setVisibility(View.VISIBLE);
		if (AprOrig == 0 && DispOrig == 0)
			layer_disponible.setVisibility(View.GONE);

		return v;
	}
}
