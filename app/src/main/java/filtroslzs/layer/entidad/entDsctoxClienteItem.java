package filtroslzs.layer.entidad;

public class entDsctoxClienteItem {
    private int n_codcliente=0,n_codpro=0;
    private double n_cantidadmin=0,n_cantidadmax=0,n_descuento=0;

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

    public double getCantidadMin() {
        return n_cantidadmin;
    }

    public void setCantidadMin(double n_cantidadmin) {
        this.n_cantidadmin = n_cantidadmin;
    }

    public double getCantidadMax() {
        return n_cantidadmax;
    }

    public void setCantidadMax(double n_cantidadmax) {
        this.n_cantidadmax = n_cantidadmax;
    }

    public double getDescuento() {
        return n_descuento;
    }

    public void setDescuento(double n_descuento) {
        this.n_descuento = n_descuento;
    }
}
