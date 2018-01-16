package filtroslzs.layer.entidad;

public class entProductoCompe {
    private int n_codpro=0;
    private double n_precio=0;
    private String v_codpro="";

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public double getPrecio() {
        return n_precio;
    }

    public void setPrecio(double n_precio) {
        this.n_precio = n_precio;
    }

    public String getVCodPro() {
        return v_codpro;
    }

    public void setVCodPro(String v_codpro) {
        this.v_codpro = v_codpro;
    }
}
