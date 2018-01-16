package filtroslzs.layer.entidad;

public class entTipoNegocio {
    private String v_tiponegocio="",v_descripcion="",v_estado="A";

    public String getTipoNegocio() {
        return v_tiponegocio;
    }

    public void setTipoNegocio(String v_tiponegocio) {
        this.v_tiponegocio = v_tiponegocio;
    }

    public String getDescripcion() {
        return v_descripcion;
    }

    public void setDescripcion(String v_descripcion) {
        this.v_descripcion = v_descripcion;
    }

    public String getEstado() {
        return v_estado;
    }

    public void setEstado(String v_estado) {
        this.v_estado = v_estado;
    }
}
