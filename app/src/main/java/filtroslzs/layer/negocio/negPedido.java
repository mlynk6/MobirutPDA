package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;

import filtroslys.mobirutpda.ZFnGeneral;
import filtroslys.mobirutpda.ZGConst;
import filtroslzs.layer.data.datPedido;
import filtroslzs.layer.entidad.entDataBase;
import filtroslzs.layer.entidad.entPedido;

public class negPedido {
    private entDataBase entDB;
    private datPedido procesomain;

    public negPedido(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datPedido(this.entDB);
    }

    public ArrayList<entPedido> ListaPedido(String Pedido,String Cliente,String CodCia,String OpcionSinc) {
        ArrayList<entPedido> ListaDat = new ArrayList<entPedido>();
        Cursor cx = procesomain.ListaPedido(Pedido,Cliente,CodCia,OpcionSinc);
        entPedido objEnt;
        while (cx.moveToNext()) {
            objEnt = new entPedido();
            objEnt.setCodPedido(cx.getInt(0));
            objEnt.setCodCliente(cx.getInt(1));
            objEnt.setRazonSocial(cx.getString(2));
            objEnt.setFecRegistro(negZConst.getFecha(cx.getString(3)));
            objEnt.setFecModif(negZConst.getFecha(cx.getString(4)));
            objEnt.setCodCotiza(cx.getInt(5));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }
}
