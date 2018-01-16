package filtroslzs.layer.entidad;

public class entMotivoVisita {
    private int n_codmotivo=0;
    private String v_codmotivo="",v_desmotivo="";
    private int n_flgestado=0,n_orden=0;
    private String v_indicador="N",v_tomarpedido="N";

    public int getCodMotivo() {
        return n_codmotivo;
    }

    public void setCodMotivo(int n_codmotivo) {
        this.n_codmotivo = n_codmotivo;
    }

    public String getVCodMotivo() {
        return v_codmotivo;
    }

    public void setVCodMotivo(String v_codmotivo) {
        this.v_codmotivo = v_codmotivo;
    }

    public String getVDesMotivo() {
        return v_desmotivo;
    }

    public void setDesMotivo(String v_desmotivo) {
        this.v_desmotivo = v_desmotivo;
    }

    public int getFlgEstado() {
        return n_flgestado;
    }

    public void setFlgEstado(int n_flgestado) {
        this.n_flgestado = n_flgestado;
    }

    public int getOrden() {
        return n_orden;
    }

    public void setOrden(int n_orden) {
        this.n_orden = n_orden;
    }

    public String getIndicador() {
        return v_indicador;
    }

    public void setIndicador(String v_indicador) {
        this.v_indicador = v_indicador;
    }

    public String getTomarPedido() {
        return v_tomarpedido;
    }

    public void setTomarPedido(String v_tomarpedido) {
        this.v_tomarpedido = v_tomarpedido;
    }
}
