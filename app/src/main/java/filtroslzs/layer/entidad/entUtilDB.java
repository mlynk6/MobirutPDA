package filtroslzs.layer.entidad;
import java.util.ArrayList;
import java.util.Vector;

public class entUtilDB {
    ArrayList<String> LstDel = new ArrayList<String>();
    ArrayList<String> LstInfo = new ArrayList<String>();
    Vector<String> LstResponse = new Vector<String>();

    public ArrayList<String> getLstDel() {
        return LstDel;
    }

    public void setLstDel(ArrayList<String> LstDelX) {
        LstDel = LstDelX;
    }

    public ArrayList<String> getLstInfo() {
        return LstInfo;
    }

    public void setLstInfo(ArrayList<String> lstInfoX) {
        LstInfo = lstInfoX;
    }

    public Vector<String> getLstResponse() {
        return LstResponse;
    }

    public void setLstResponse(Vector<String> lstResponse) {
        LstResponse = lstResponse;
    }
}
