package filtroslzs.layer.entidad;

public class entCateClientexCia {
    private int n_codcliente=0,n_codcia=0,n_codcategoria=0;
    private String c_tipocliente="",c_segmento="",c_tipocategoria="";
    private String c_descia="",c_descsistventa="";
    private String c_descCat="",c_descSist="",c_descSistAd="";

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

    public String getDesCia() {
        return c_descia;
    }

    public void setDesCia(String c_descia) {
        this.c_descia = c_descia;
    }

    public String getDesSistVenta() {
        return c_descsistventa;
    }

    public void setDesSistVenta(String c_descsistventa) {
        this.c_descsistventa = c_descsistventa;
    }

    public String getDescuentoCat() {
        return c_descCat;
    }

    public void setDescuentoCat(String c_descCat) {
        this.c_descCat = c_descCat;
    }

    public String getDescuentoSistVta() {
        return c_descSist;
    }

    public void SetDescuentoSistVta(String c_descSist) {
        this.c_descSist = c_descSist;
    }

    public String getDescuentoSistVtaAD() {
        return c_descSistAd;
    }

    public void setDescuentoSistVtaAD(String c_descSistAd) {
        this.c_descSistAd = c_descSistAd;
    }
}
