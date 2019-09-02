package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datUbigeo;
import filtroslzs.layer.entidad.entDepartamento;
import filtroslzs.layer.entidad.entProvincia;
import filtroslzs.layer.entidad.entDistrito;
import filtroslzs.layer.entidad.entDataBase;

public class negUbigeo {
    private entDataBase entDB;
    private datUbigeo procesomain;

    public negUbigeo(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datUbigeo(this.entDB);
    }

    public ArrayList<entDepartamento> ListaDepartamentoCombo(String Opc) {
        ArrayList<entDepartamento> ListaDat = new ArrayList<entDepartamento>();
        Cursor cx = procesomain.ListaDepartamento();
        entDepartamento objEnt;
        while (cx.moveToNext()) {
            objEnt = new entDepartamento();
            objEnt.setDepartamentoCodigo(cx.getString(0));
            objEnt.setDescripcion(cx.getString(1));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entDepartamento();
            objEnt.setDepartamentoCodigo(negZConst.ComboDefCodStr);objEnt.setDescripcion(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entProvincia> ListaProvinciaxDeptCombo(String CodDpto,String Opc) {
        ArrayList<entProvincia> ListaDat = new ArrayList<entProvincia>();
        Cursor cx = procesomain.ListaProvinciaxDept(CodDpto);
        entProvincia objEnt;
        while (cx.moveToNext()) {
            objEnt = new entProvincia();
            objEnt.setProvinciaCodigo(cx.getString(0));
            objEnt.setDescripcion(cx.getString(1));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entProvincia();
            objEnt.setProvinciaCodigo(negZConst.ComboDefCodStr);objEnt.setDescripcion(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entDistrito> ListaDistritoxProvCombo(String CodDpto, String CodProv, String Opc) {
        ArrayList<entDistrito> ListaDat = new ArrayList<entDistrito>();
        Cursor cx = procesomain.ListaDistritoxProv(CodDpto,CodProv);
        entDistrito objEnt;
        while (cx.moveToNext()) {
            objEnt = new entDistrito();
            objEnt.setDistritoCodigo(cx.getString(0));
            objEnt.setDescripcion(cx.getString(1));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entDistrito();
            objEnt.setDistritoCodigo(negZConst.ComboDefCodStr);objEnt.setDescripcion(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

}
