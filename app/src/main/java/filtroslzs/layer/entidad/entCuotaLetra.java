package filtroslzs.layer.entidad;
import java.util.Date;

public class entCuotaLetra {
    private String c_origen="";
    private int n_codigo=0,n_codcuota=0,n_diasplazo=0;
    private double n_montocuota=0;
    private Date d_fecvencimiento;

    public String getOrigen() {
        return c_origen;
    }

    public void setOrigen(String c_origen) {
        this.c_origen = c_origen;
    }

    public int getCodigo() {
        return n_codigo;
    }

    public void setCodigo(int n_codigo) {
        this.n_codigo = n_codigo;
    }

    public int getCodCuota() {
        return n_codcuota;
    }

    public void setCodCuota(int n_codcuota) {
        this.n_codcuota = n_codcuota;
    }

    public int getDiasPlazo() {
        return n_diasplazo;
    }

    public void setDiasPlazo(int n_diasplazo) {
        this.n_diasplazo = n_diasplazo;
    }

    public double getMontoCuota() {
        return n_montocuota;
    }

    public void setMontoCuota(double n_montocuota) {
        this.n_montocuota = n_montocuota;
    }

    public Date getFecVencimiento() {
        return d_fecvencimiento;
    }

    public void setFecVencimiento(Date d_fecvencimiento) {
        this.d_fecvencimiento = d_fecvencimiento;
    }
}
