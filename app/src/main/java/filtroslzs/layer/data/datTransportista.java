package filtroslzs.layer.data;

import android.database.Cursor;
import filtroslzs.layer.entidad.entDataBase;

public class datTransportista {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datTransportista(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaTransportista() {
        sql = "Select v_compania,v_usuario,v_nombre,v_password,d_fecexpiracion "
            + "from tbc_transportista";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor GetTranspAutenticado(String Transportista,String Clave) {
        sql = "Select Count(1) "
            + "from tbc_transportista "
            + "where v_usuario='" + Transportista + "' "
            + "and v_password = '" + Clave + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

}