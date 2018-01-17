package filtroslzs.layer.entidad;

public class entProducto {
    private int n_codpro=0,n_codcia=0;
    private String v_codpro="",v_subcodi="",v_despro="";
    private int n_stock=0,n_codsufijo=0,n_codprefijo=0,n_flgestadoact=0;
    private String c_tipopromocion="",c_proyectado="N",c_textolsthtml="",c_textoreghtml="";
    private String c_caja="",c_procedencia="";
    private String c_codEquiv="",c_marcaComp="";

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

    public String getVCodPro() {
        return v_codpro;
    }

    public void setVCodPro(String v_codpro) {
        this.v_codpro = v_codpro;
    }

    public String getSubCodi() {
        return v_subcodi;
    }

    public void setSubCodi(String v_subcodi) {
        this.v_subcodi = v_subcodi;
    }

    public String getDesPro() {
        return v_despro;
    }

    public void setDesPro(String v_despro) {
        this.v_despro = v_despro;
    }

    public int getStock() {
        return n_stock;
    }

    public void setStock(int n_stock) {
        this.n_stock = n_stock;
    }

    public int getCodSufijo() {
        return n_codsufijo;
    }

    public void setCodSufijo(int n_codsufijo) {
        this.n_codsufijo = n_codsufijo;
    }

    public int getCodPrefijo() {
        return n_codprefijo;
    }

    public void setCodPrefijo(int n_codprefijo) {
        this.n_codprefijo = n_codprefijo;
    }

    public int getFlgEstadoAct() {
        return n_flgestadoact;
    }

    public void setFlgEstadoAct(int n_flgestadoact) {
        this.n_flgestadoact = n_flgestadoact;
    }

    public String getTipoPromocion() {
        return c_tipopromocion;
    }

    public void setTipoPromocion(String c_tipopromocion) {
        this.c_tipopromocion = c_tipopromocion;
    }

    public String getProyectado() {
        return c_proyectado;
    }

    public void setProyectado(String c_proyectado) {
        this.c_proyectado = c_proyectado;
    }

    public String getTextoLstHtml() {
        return c_textolsthtml;
    }

    public void setTextoLstHtml(String c_textolsthtml) {
        this.c_textolsthtml = c_textolsthtml;
    }

    public String getTextoRegHtml() {
        return c_textoreghtml;
    }

    public void setTextoRegHtml(String c_textoreghtml) {
        this.c_textoreghtml = c_textoreghtml;
    }

    public String getCaja() {
        return c_caja;
    }

    public void setCaja(String c_caja) {
        this.c_caja = c_caja;
    }

    public String getProcedencia() {
        return c_procedencia;
    }

    public void setProcedencia(String c_procedencia) {
        this.c_procedencia = c_procedencia;
    }

    public String getCodigoEquiv() {
        return c_codEquiv;
    }

    public void setCodigoEquiv(String c_codEquiv) {
        this.c_codEquiv = c_codEquiv;
    }

    public String getMarcaComp() {
        return c_marcaComp;
    }

    public void setMarcaComp(String c_marcaComp) {
        this.c_marcaComp = c_marcaComp;
    }
}
