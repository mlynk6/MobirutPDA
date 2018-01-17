package filtroslzs.layer.entidad;

public class entRptaServ {
    int rptaServ = 1;
    int cantReg = 0;
    String sErr = "";

    public int getRptaServ() {
        return rptaServ;
    }

    public void setRptaServ(int rptaServ) {
        this.rptaServ = rptaServ;
    }

    public int getCantReg() {
        return cantReg;
    }

    public void setCantReg(int cantReg) {
        this.cantReg = cantReg;
    }

    public String getMsjErr() {
        return sErr;
    }

    public void setMsjErr(String sMensaje) {
        this.sErr = sMensaje;
    }
}
