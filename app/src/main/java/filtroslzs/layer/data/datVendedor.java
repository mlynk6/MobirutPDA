package filtroslzs.layer.data;

import filtroslzs.layer.entidad.entDataBase;
import android.database.Cursor;

public class datVendedor {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datVendedor(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaVendedor() {
        sql = "Select v_codvendedor,v_nombre,v_apepat,v_apemat,n_estado,d_fecexpiracion,c_habilitado "
                + "from tbc_vendedor";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaVendxCia(String Vendedor) {
        sql = "Select n_codcia,v_contrasena,v_codvendcia,v_mercaderista "
                + "from tbd_vendxcia "
                + "where v_codvendedor='" + Vendedor + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor AutenticarVendedor(String VendCia,String Clave) {
        sql = "Select Count(1) "
                + "from tbd_vendxcia "
                + "where v_codvendcia='" + VendCia + "' "
                + "and v_contrasena = '" + Clave + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

}