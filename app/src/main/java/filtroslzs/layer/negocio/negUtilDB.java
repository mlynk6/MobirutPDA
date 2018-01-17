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

        ntrans = procesomain.EjecutaQuerys(query);
        return ntrans;
    }
}
