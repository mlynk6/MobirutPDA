package filtroslzs.layer.negocio;

import android.database.Cursor;
import filtroslzs.layer.data.*;
import filtroslzs.layer.entidad.*;
import java.util.ArrayList;

public class negZaccUser {
    private entDataBase entDB;
    private datZaccUser procesomain;

    public negZaccUser(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datZaccUser(this.entDB);
    }

    public ArrayList<entZaccUser> ListaUsuario() {
        ArrayList<entZaccUser> ListaDat = new ArrayList<entZaccUser>();
        Cursor cx = procesomain.ListaUsuario();
        entZaccUser objEnt;
        while (cx.moveToNext()) {
            objEnt = new entZaccUser();
            objEnt.setUsuario(cx.getString(0));
            objEnt.setNombre(cx.getString(1));
            objEnt.setClave(cx.getString(2));
            objEnt.setCorreo(cx.getString(3));
            objEnt.setEsVenta(cx.getString(4));
            objEnt.setSac(cx.getString(5));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public entZaccUser AutenticaUsuario(String Usuario, String Clave) {
        Cursor cx = procesomain.AutenticaUsuario(Usuario,Clave);
        entZaccUser objEnt = new entZaccUser();

        if (cx.moveToFirst()) {
            objEnt.setUsuario(cx.getString(0));
            objEnt.setNombre(cx.getString(1));
            objEnt.setCorreo(cx.getString(2));
            objEnt.setCodVendCia(cx.getString(3));
            objEnt.setCodTransp(cx.getString(4));
        }
        cx.close();
        cx=null;
        return objEnt;
    }
}
