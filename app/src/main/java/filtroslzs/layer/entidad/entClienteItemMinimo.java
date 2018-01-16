package filtroslzs.layer.entidad;

public class entClienteItemMinimo {
    private int n_codcliente=0,n_codpro=0,n_codcia=0;
    private double n_cantminima=0;
    private double n_pordescuento=0;
    private double n_cantacumulada=0;

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

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

    public double getCantMinima() {
        return n_cantminima;
    }

    public void setCantMinima(double n_cantminima) {
        this.n_cantminima = n_cantminima;
    }

    public double getPorDescuento() {
        return n_pordescuento;
    }

    public void setPorDescuento(double n_pordescuento) {
        this.n_pordescuento = n_pordescuento;
    }

    public double getCantAcumulada() {
        return n_cantacumulada;
    }

    public void setCantAcumulada(double n_cantacumulada) {
        this.n_cantacumulada = n_cantacumulada;
    }
}
