package filtroslzs.layer.entidad;

public class entBanco {
    private String v_bancocodigo="",v_descripcion="",v_estado="A";

    public String getBancoCodigo() {
        return v_bancocodigo;
    }

    public void setBancoCodigo(String v_bancocodigo) {
        this.v_bancocodigo = v_bancocodigo;
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
