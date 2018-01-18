package filtroslzs.layer.negocio;
import android.util.Log;

import filtroslzs.layer.data.*;
import filtroslzs.layer.entidad.*;
import java.util.ArrayList;
import java.util.Vector;

public class negUtilDB {
    private entDataBase entDB;
    private datUtilDB procesomain;

    public negUtilDB(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datUtilDB(this.entDB);
    }

    public int EjecutaDatSinc(entUtilDB oEnt) {
        ArrayList<String> LstDel = oEnt.getLstDel();
        ArrayList<String> LstInfo = oEnt.getLstInfo();
        Vector<String> LstResponse = oEnt.getLstResponse();
        String[] query;
        String xsql="";
        int size=0,xReg=0,ntrans=0;

        //Quitando No Eliminados
        LstDel.remove("sp_validar_contraseña");

        if(LstDel!=null) size = size + LstDel.size();
        if(LstInfo!=null) size = size + LstInfo.size();
        if(LstResponse!=null) size = size + LstResponse.size() - 1;
        query = new String[size];
        if(LstDel!=null){
            for(int i=0;i<LstDel.size();i++){
                xsql = "delete from " + LstDel.get(i);
                query[xReg] = xsql;
                xReg++;
            }
        }

        if(LstResponse!=null){
            for (int i=0;i<LstResponse.size()-1;i++) {
                xsql = String.valueOf(LstResponse.get(i + 1));
                query[xReg] = xsql;
                xReg++;
            }
        }

        if(LstInfo!=null){
            for(int i=0;i<LstInfo.size();i++){
                xsql = "delete from " + LstInfo.get(i);
                query[xReg] = xsql;
                xReg++;
            }
        }

        //Remplazar Datos
        for(int i=0;i<query.length;i++){
            query[i] = query[i].replaceAll("TBC_COMPAÑIA","TBC_COMPANIA");
            query[i] = query[i].replaceAll("tbc_compañia","tbc_compania");
            query[i] = query[i].replaceAll("TBC_COMPAÑIA_REL","TBC_COMPANIA_REL");
            query[i] = query[i].replaceAll("tbc_compañia_rel","tbc_compania_rel");
            query[i] = query[i].replaceAll("contraseña","contrasena");
        }

        ntrans = procesomain.EjecutaQuerys(query);
        return ntrans;
    }
}
