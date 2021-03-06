package filtroslzs.layer.negocio;

import android.database.Cursor;
import android.util.Log;

import filtroslys.mobirutpda.Login;
import filtroslzs.layer.data.*;
import filtroslzs.layer.entidad.*;
import java.util.ArrayList;

public class negZaccMenu {
    private entDataBase entDB;
    private datZaccMenu procesomain;

    public negZaccMenu(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datZaccMenu(this.entDB);
    }

    public ArrayList<entZaccMenu> ListaMenu(String Usuario,String Nivel) {
        ArrayList<entZaccMenu> ListaDat = new ArrayList<entZaccMenu>();
        Cursor cx = procesomain.ListaMenu(Usuario,Nivel);
        entZaccMenu objEnt;
        while (cx.moveToNext()) {
            objEnt = new entZaccMenu();
            objEnt.setIdReg(cx.getString(0));
            objEnt.setNombre(cx.getString(1));
            objEnt.setTipo(cx.getString(2));
            objEnt.setIdRef(cx.getString(3));
            ListaDat.add(objEnt);
            Log.i("Menu id : ",cx.getString(0));
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public boolean GetAccesoMenu(String Usuario,String IdReg) {
        Cursor cx = procesomain.GetAccesoMenu(Usuario,IdReg);
        entZaccUser objEnt = new entZaccUser();
        boolean bVal = false;

        if (cx.moveToFirst()) {
            int nCont = cx.getInt(0);
            if(nCont>0) bVal = true;
        }
        objEnt = null;
        cx.close();
        cx=null;
        return bVal;
    }
}
