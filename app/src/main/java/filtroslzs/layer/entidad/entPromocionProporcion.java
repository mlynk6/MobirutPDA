package filtroslzs.layer.entidad;

public class entPromocionProporcion {
    private int n_codcia=0,n_codpro=0,n_codprorel=0;
    private double n_proporcion=0;

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

    public int getCodProRel() {
        return n_codprorel;
    }

    public void setCodProRel(int n_codprorel) {
        this.n_codprorel = n_codprorel;
    }

    public double getProporcion() {
        return n_proporcion;
    }

    public void setProporcion(double n_proporcion) {
        this.n_proporcion = n_proporcion;
    }
}
