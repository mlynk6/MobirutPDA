package filtroslzs.layer.data;
import android.database.Cursor;
import filtroslzs.layer.entidad.entDataBase;

public class datUbigeo {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datUbigeo(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaDepartamento() {
        sql = "Select c_departamentocodigo,c_descripcion "
            + "from tbc_departamento "
            + "where c_pais='PER' "
            + "and c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaProvinciaxDept(String CodDpto) {
        sql = "Select c_provinciacodigo,c_descripcion "
            + "from tbc_provincia "
            + "where c_pais='PER' "
            + "and c_departamentocodigo='" + CodDpto + "' "
            + "and c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaDistritoxProv(String CodDpto, String CodProv) {
        sql = "Select c_distritocodigo,c_descripcion "
            + "from tbc_distrito "
            + "where c_pais='PER' "
            + "and c_departamentocodigo='" + CodDpto + "' "
            + "and c_provinciacodigo='" + CodProv + "' "
            + "and c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}