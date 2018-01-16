package filtroslzs.layer.entidad;

public class entClienteItemDsc {
    private int n_codpro=0,n_codcliente =0,n_codcia=0;
    private double n_pordescuento=0;
    private String c_otrows="";

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public double getPorDescuento() {
        return n_pordescuento;
    }

    public void setPorDescuento(double n_pordescuento) {
        this.n_pordescuento = n_pordescuento;
    }

    public String getOtroWS() {
        return c_otrows;
    }

    public void setOtroWS(String c_otrows) {
        this.c_otrows = c_otrows;
    }

}
