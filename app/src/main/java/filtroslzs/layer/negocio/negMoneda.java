package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datMoneda;
import filtroslzs.layer.entidad.entDataBase;
import filtroslzs.layer.entidad.entMoneda;

public class negMoneda {
    private entDataBase entDB;
    private datMoneda procesomain;

    public negMoneda(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datMoneda(this.entDB);
    }

    public ArrayList<entMoneda> ListaMonedaCombo(String Opc) {
        ArrayList<entMoneda> ListaDat = new ArrayList<entMoneda>();
        Cursor cx = procesomain.ListaMoneda();
        entMoneda objEnt;
        while (cx.moveToNext()) {
            objEnt = new entMoneda();
            objEnt.setCodMoneda(cx.getInt(0));
            objEnt.setSimbolo(cx.getString(1));
            objEnt.setDesMoneda(cx.getString(2));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entMoneda();
            objEnt.setCodMoneda(negZConst.ComboDefCodEnt);objEnt.setSimbolo(Opc);objEnt.setDesMoneda(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

}
