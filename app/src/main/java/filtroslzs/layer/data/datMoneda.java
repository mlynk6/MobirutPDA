package filtroslzs.layer.data;

import android.database.Cursor;
import filtroslzs.layer.entidad.entDataBase;

public class datMoneda {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datMoneda(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaMoneda() {
        sql = "Select n_codmoneda,v_simbolo,v_desmoneda "
            + "from tbc_moneda";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}