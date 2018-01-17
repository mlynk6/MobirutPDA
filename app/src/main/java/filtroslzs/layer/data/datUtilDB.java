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

    public Cursor EjecutaSelect(String sql) {
        Cursor c = entDB.getDBaseDatos().rawQuery(sql, null);
        return c;
    }

    public int EjecutaQuery(String sql) {
        int valor = 0;
        String cadena = "";
        entDB.getDBaseDatos().beginTransaction();
        try {
            entDB.getDBaseDatos().execSQL(sql);
            entDB.getDBaseDatos().setTransactionSuccessful();
            valor = 1;
        } catch (SQLException e) {
            Log.e("Err",e.getMessage());
            valor = 0;
        } finally {
            entDB.getDBaseDatos().endTransaction();
        }
        return valor;
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
            Log.e("Err",e.getMessage());
            valor = 0;
        } finally {
            entDB.getDBaseDatos().endTransaction();
        }
        return valor;
    }
}
