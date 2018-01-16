package filtroslzs.layer.entidad;
import android.database.sqlite.SQLiteDatabase;

public class entDataBase {
    private SQLiteDatabase d_base;
    private String c_conexion="";

    public SQLiteDatabase getDBaseDatos() {
        return d_base;
    }

    public String getCConexion() {
        return c_conexion;
    }

    public void setDBaseDatos(SQLiteDatabase d_base) {
        this.d_base = d_base;
    }

    public void setCConexion(String c_conexion) {
        this.c_conexion = c_conexion;
    }

}
