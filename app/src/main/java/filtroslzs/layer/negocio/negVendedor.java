package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datVendedor;
import filtroslzs.layer.entidad.entVendedor;
import filtroslzs.layer.entidad.entVendxCia;
import filtroslzs.layer.entidad.entDataBase;

public class negVendedor {
    private entDataBase entDB;
    private datVendedor procesomain;

    public negVendedor(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datVendedor(this.entDB);
    }

    public ArrayList<entVendedor> ListaVendedor() {
        ArrayList<entVendedor> ListaDat = new ArrayList<entVendedor>();
        Cursor cx = procesomain.ListaVendedor();
        entVendedor objEnt;
        while (cx.moveToNext()) {
            objEnt = new entVendedor();
            objEnt.setCodVendedor(cx.getString(0));
            objEnt.setNombre(cx.getString(1));
            objEnt.setApePat(cx.getString(2));
            objEnt.setApeMat(cx.getString(3));
            objEnt.setEstado(cx.getInt(4));
            objEnt.setFecExpiracion(negZConst.getFecha(cx.getString(5)));
            objEnt.setHabilitado(cx.getString(6));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entVendxCia> ListaVendxCia(String Vendedor) {
        ArrayList<entVendxCia> ListaDat = new ArrayList<entVendxCia>();
        Cursor cx = procesomain.ListaVendxCia(Vendedor);
        entVendxCia objEnt;
        while (cx.moveToNext()) {
            objEnt = new entVendxCia();
            objEnt.setCodCia(cx.getInt(0));
            objEnt.setContrasena(cx.getString(1));
            objEnt.setCodVendCia(cx.getString(2));
            objEnt.setMercaderista(cx.getString(3));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public boolean GetVendCiaAutenticado(String VendCia,String Clave) {
        Cursor cx = procesomain.GetVendCiaAutenticado(VendCia,Clave);
        entVendedor objEnt = new entVendedor();
        boolean bVal = false;

        if (cx.moveToFirst()) {
            if(cx.getInt(0)>0) bVal = true;
        }
        cx.close();
        cx=null;
        return bVal;
    }

}
