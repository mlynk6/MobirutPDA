package filtroslzs.layer.entidad;

public class entEstadoPedido {
    private int n_codestadoped=0;
    private String v_desestado="";

    public int getCodEstadoPed() {
        return n_codestadoped;
    }

    public void setCodEstadoPed(int n_codestadoped) {
        this.n_codestadoped = n_codestadoped;
    }

    public String getDesEstado() {
        return v_desestado;
    }

    public void setDesEstado(String v_desestado) {
        this.v_desestado = v_desestado;
    }
}
