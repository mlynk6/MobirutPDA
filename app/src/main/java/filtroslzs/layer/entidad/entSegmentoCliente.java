package filtroslzs.layer.entidad;

public class entSegmentoCliente {
    private String c_segmento="",c_descripcion="",c_estado="A";

    public String getSgmento() {
        return c_segmento;
    }

    public void setSegmento(String c_segmento) {
        this.c_segmento = c_segmento;
    }

    public String getDescripcion() {
        return c_descripcion;
    }

    public void setDescripcion(String c_descripcion) {
        this.c_descripcion = c_descripcion;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }
}
