package filtroslzs.layer.entidad;
import java.util.Date;

public class entPrecioNetoProd {
    private int n_codpro=0,n_codcia=0,n_codmoneda=0;
    private double n_precioneto=0;
    private Date d_fecinicio,d_fecvencimiento;
    private int n_codtiposistemaventa=0,n_codcategoria=0;
    private String v_codpromo="",c_otrows="N";

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public double getPrecioNeto() {
        return n_precioneto;
    }

    public void setPrecioNeto(double n_precioneto) {
        this.n_precioneto = n_precioneto;
    }

    public Date getFecInicio() {
        return d_fecinicio;
    }

    public void setFecInicio(Date d_fecinicio) {
        this.d_fecinicio = d_fecinicio;
    }

    public Date getFecVencimiento() {
        return d_fecvencimiento;
    }

    public void setFecVencimiento(Date d_fecvencimiento) {
        this.d_fecvencimiento = d_fecvencimiento;
    }

    public int getCodTipoSistemaVenta() {
        return n_codtiposistemaventa;
    }

    public void setCodTipoSistemaVenta(int n_codtiposistemaventa) {
        this.n_codtiposistemaventa = n_codtiposistemaventa;
    }

    public int getCodCategoria() {
        return n_codcategoria;
    }

    public void setCodCategoria(int n_codcategoria) {
        this.n_codcategoria = n_codcategoria;
    }

    public String getCodPromo() {
        return v_codpromo;
    }

    public void setCodPromo(String v_codpromo) {
        this.v_codpromo = v_codpromo;
    }

    public String getOtroWS() {
        return c_otrows;
    }

    public void setOtroWS(String c_otrows) {
        this.c_otrows = c_otrows;
    }
}

