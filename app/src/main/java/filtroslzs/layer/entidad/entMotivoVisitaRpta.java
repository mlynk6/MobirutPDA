package filtroslzs.layer.entidad;

public class entMotivoVisitaRpta {
    private int n_codmotivo=0,n_linea=0;
    private String v_descripcion="",v_flagdefault="N";
    private int n_orden=0;

    public int getCodMotivo() {
        return n_codmotivo;
    }

    public void setCodMotivo(int n_codmotivo) {
        this.n_codmotivo = n_codmotivo;
    }

    public int getLinea() {
        return n_linea;
    }

    public void setLinea(int n_linea) {
        this.n_linea = n_linea;
    }

    public String getDescripcion() {
        return v_descripcion;
    }

    public void setDescripcion(String v_descripcion) {
        this.v_descripcion = v_descripcion;
    }

    public String getFlagDefault() {
        return v_flagdefault;
    }

    public void setFlagDefault(String v_flagdefault) {
        this.v_flagdefault = v_flagdefault;
    }

    public int getOrden() {
        return n_orden;
    }

    public void setOrden(int n_orden) {
        this.n_orden = n_orden;
    }
}
