package filtroslzs.layer.entidad;

public class entProcedencia {
    private String v_procedencia="",v_descripcion="",v_estado="A",v_reventa="N",v_editaprecio="N";

    public String getProcedencia() {
        return v_procedencia;
    }

    public void setProcedencia(String v_procedencia) {
        this.v_procedencia = v_procedencia;
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

    public String getReventa() {
        return v_reventa;
    }

    public void setReventa(String v_reventa) {
        this.v_reventa = v_reventa;
    }

    public String getEditaPrecio() {
        return v_editaprecio;
    }

    public void setEditaPrecio(String v_editaprecio) {
        this.v_editaprecio = v_editaprecio;
    }
}
