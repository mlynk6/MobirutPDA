package filtroslzs.layer.data;

import filtroslzs.layer.entidad.entDataBase;
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
                + "from zacc_usuario";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor AutenticaUsuario(String Usuario, String Clave) {
        sql = "Select c_usuario,c_nombre,c_correo,c_codvendcia,c_codtransp "
                + "from zacc_usuario "
                + "where c_usuario ='" + Usuario + "' "
                + "and c_clave ='" + Clave + "'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public int ActualizarHomeCodigo(String Usuario,String Vendedor,String Transportista){
        int nVal = 1;
        if(Vendedor==null) Vendedor="";
        if(Transportista==null) Transportista="";

        if(nVal==1 && Vendedor.length()>0){
            sql = "Update zacc_usuario "
                    + "Set c_codvendcia ='" + Vendedor + "' "
                    + "where c_usuario = '" + Usuario + "'";
            nVal = objDat.EjecutaQuery(sql);
        }

        if(nVal==1 && Transportista.length()>0){
            sql = "Update zacc_usuario "
                    + "Set c_codtransp = '" + Transportista + "' "
                    + "where c_usuario = '" + Usuario + "'";
            nVal = objDat.EjecutaQuery(sql);
        }

        return nVal;
    }

}
