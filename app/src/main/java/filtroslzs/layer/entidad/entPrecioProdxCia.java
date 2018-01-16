package filtroslzs.layer.entidad;

public class entPrecioProdxCia {
    private int n_codpro=0,n_codcia=0,n_codmoneda=0;
    private double n_preciounitario=0;
    private String c_otrows="N";

    public int getCodpPro() {
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

    public double getPrecioUnitario() {
        return n_preciounitario;
    }

    public void setPrecioUnitario(double n_preciounitario) {
        this.n_preciounitario = n_preciounitario;
    }

    public String getOtroWS() {
        return c_otrows;
    }

    public void setOtroWS(String c_otrows) {
        this.c_otrows = c_otrows;
    }
}
