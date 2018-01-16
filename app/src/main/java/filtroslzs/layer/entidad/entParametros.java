package filtroslzs.layer.entidad;
import java.sql.Date;

public class entParametros {
    private double n_tipocambio=0;
    private Date d_fecregistro;
    private int n_idparametros=0;
    private String n_igv="0",c_gps="N";

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public Date getFecRegistro() {
        return d_fecregistro;
    }

    public void setFecRegistro(Date d_fecregistro) {
        this.d_fecregistro = d_fecregistro;
    }

    public int getIdParametros() {
        return n_idparametros;
    }

    public void setIdParametros(int n_idparametros) {
        this.n_idparametros = n_idparametros;
    }

    public String getIgv() {
        return n_igv;
    }

    public void setIgv(String n_igv) {
        this.n_igv = n_igv;
    }

    public String getGPS() {
        return c_gps;
    }

    public void setGPS(String c_gps) {
        this.c_gps = c_gps;
    }
}
