package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datTransportista;
import filtroslzs.layer.entidad.entDataBase;
import filtroslzs.layer.entidad.entTransportista;
import filtroslzs.layer.entidad.entVendxCia;

public class negTransportista {
    private entDataBase entDB;
    private datTransportista procesomain;

    public negTransportista(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datTransportista(this.entDB);
    }

    public ArrayList<entTransportista> ListaTransportista() {
        ArrayList<entTransportista> ListaDat = new ArrayList<entTransportista>();
        Cursor cx = procesomain.ListaTransportista();
        entTransportista objEnt;
        while (cx.moveToNext()) {
            objEnt = new entTransportista();
            objEnt.setCompania(cx.getString(0));
            objEnt.setUsuario(cx.getString(1));
            objEnt.setNombre(cx.getString(2));
            objEnt.setPassword(cx.getString(3));
            objEnt.setFecExpiracion(negZConst.getFecha(cx.getString(4)));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public boolean GetTranspAutenticado(String Transportista,String Clave) {
        Cursor cx = procesomain.GetTranspAutenticado(Transportista,Clave);
        entTransportista objEnt = new entTransportista();
        boolean bVal = false;

        if (cx.moveToFirst()) {
            if(cx.getInt(0)>0) bVal = true;
        }
        cx.close();
        cx=null;
        return bVal;
    }

}
