package filtroslzs.layer.data;

import filtroslzs.layer.entidad.*;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Log;

public class datUtilDB {
    private entDataBase entDB;

    public datUtilDB(entDataBase entDB) {
        this.entDB = entDB;
    }

    public void EjecutaQuery(String sql) {
        entDB.getDBaseDatos().execSQL(sql);
    }

    public Cursor EjecutaSelect(String sql) {
        Cursor c = entDB.getDBaseDatos().rawQuery(sql, null);
        return c;
    }

    public int EjecutaQuerys(String sql[]) {
        int valor = 0;
        String cadena = "";
        entDB.getDBaseDatos().beginTransaction();
        try {
            for (int i = 0; i < sql.length; i++) {
                sql[i] = sql[i].replace("{", "(");
                sql[i] = sql[i].replace("}", ")");
                sql[i] = sql[i].replace("#$", ",");
                sql[i] = sql[i].replace("ñ", "Ñ");
                sql[i] = sql[i].replace("#!", ",");
                cadena = sql[i];
                entDB.getDBaseDatos().execSQL(cadena);
            }
            entDB.getDBaseDatos().setTransactionSuccessful();
            valor = 1;
        } catch (SQLException e) {
            Log.e("eero",e.getMessage());
            valor = 0;
        } finally {
            entDB.getDBaseDatos().endTransaction();
        }
        return valor;
    }
}
