package filtroslzs.layer.entidad;

public class entPorDescxCia {
    private int n_codcia=0,n_codpro=0;
    private double n_pordescuento=0;
    private String c_tipocliente="";

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public double getPorDescuento() {
        return n_pordescuento;
    }

    public void setPorDescuento(double n_pordescuento) {
        this.n_pordescuento = n_pordescuento;
    }

    public String getTipoCliente() {
        return c_tipocliente;
    }

    public void setTipoCliente(String c_tipocliente) {
        this.c_tipocliente = c_tipocliente;
    }
}
