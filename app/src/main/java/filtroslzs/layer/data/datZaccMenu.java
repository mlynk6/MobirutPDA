package filtroslzs.layer.data;

import android.database.Cursor;
import filtroslzs.layer.entidad.entDataBase;

public class datZaccMenu {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datZaccMenu(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaMenuHome() {
        sql = "Select c_idreg,c_nombre,c_tipo,c_idref "
                + "from zacc_menu "
                + "where c_inicio ='S'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor AccesoMenu(String IdReg) {
        sql = "Select count(1) "
                + "from zacc_menu "
                + "where c_idreg ='" + IdReg + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}
