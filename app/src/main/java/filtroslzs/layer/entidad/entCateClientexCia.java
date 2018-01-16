package filtroslzs.layer.entidad;

public class entCateClientexCia {
    private int n_codcliente=0,n_codcia=0,n_codcategoria=0;
    private String c_tipocliente="",c_segmento="",c_tipocategoria="";

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

    public int getCodCategoria() {
        return n_codcategoria;
    }

    public void setCodCategoria(int n_codcategoria) {
        this.n_codcategoria = n_codcategoria;
    }

    public String getTipoCliente() {
        return c_tipocliente;
    }

    public void setTipoCliente(String c_tipocliente) {
        this.c_tipocliente = c_tipocliente;
    }

    public String getSegmento() {
        return c_segmento;
    }

    public void setSegmento(String c_segmento) {
        this.c_segmento = c_segmento;
    }

    public String getTipoCategoria() {
        return c_tipocategoria;
    }

    public void setTipoCategoria(String c_tipocategoria) {
        this.c_tipocategoria = c_tipocategoria;
    }

}
