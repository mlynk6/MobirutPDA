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

    public Cursor ListaMenuHome(String Usuario) {
        sql = "Select c_idreg,c_nombre,c_tipo,c_idref "
                + "from zacc_menu "
                + "where c_usuario='" + Usuario + "' "
                + "and c_nivel ='IN'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor GetAccesoMenu(String Usuario,String IdReg) {
        sql = "Select count(1) "
            + "from zacc_menu "
            + "where c_usuario ='" + Usuario + "' "
            + "and c_idreg ='" + IdReg + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}
