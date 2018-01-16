package filtroslzs.layer.entidad;

public class entCategoriaxCia {
    private double n_acumuladomin=0,n_acumuladomax=0;
    private int n_codcia=0,n_correlativo=0,n_codmoneda,n_codcategoria=0;

    public double getAcumuladoMin() {
        return n_acumuladomin;
    }

    public void setAcumuladoMin(double n_acumuladomin) {
        this.n_acumuladomin = n_acumuladomin;
    }

    public double getAcumuladoMax() {
        return n_acumuladomax;
    }

    public void setAcumuladoMax(double n_acumuladomax) {
        this.n_acumuladomax = n_acumuladomax;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCorrelativo() {
        return n_correlativo;
    }

    public void setCorrelativo(int n_correlativo) {
        this.n_correlativo = n_correlativo;
    }

    public int getCodmoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public int getCodCategoria() {
        return n_codcategoria;
    }

    public void setCodCategoria(int n_codcategoria) {
        this.n_codcategoria = n_codcategoria;
    }
}
