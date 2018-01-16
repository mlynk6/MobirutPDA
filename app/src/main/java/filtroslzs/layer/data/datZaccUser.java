package filtroslzs.layer.data;
import filtroslzs.layer.entidad.*;
import android.database.Cursor;

public class datZaccUser {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datZaccUser(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaUsuario() {
        sql = "Select c_usuario,c_nombre,c_clave,c_correo,c_esventa,c_sac "
                + "from zacc_user";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor AutenticaUsuario(String Nombre, String Clave) {
        sql = "Select c_usuario,c_nombre,c_correo "
                + "from zacc_user "
                + "where c_usuario ='" + Nombre + "' "
                + "and c_clave ='" + Clave + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}
