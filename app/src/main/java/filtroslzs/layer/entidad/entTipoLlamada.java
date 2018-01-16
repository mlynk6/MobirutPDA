package filtroslzs.layer.entidad;

public class entTipoLlamada {
    private String c_tipollamada="",c_clasificacion="",c_descripcion="",c_esventa="N";
    private String c_escobranza="N",c_estado="A";

    public String getTipoLlamada() {
        return c_tipollamada;
    }

    public void setTipoLlamada(String c_tipollamada) {
        this.c_tipollamada = c_tipollamada;
    }

    public String getClasificacion() {
        return c_clasificacion;
    }

    public void setClasificacion(String c_clasificacion) {
        this.c_clasificacion = c_clasificacion;
    }

    public String getDescripcion() {
        return c_descripcion;
    }

    public void setDescripcion(String c_descripcion) {
        this.c_descripcion = c_descripcion;
    }

    public String getEsVenta() {
        return c_esventa;
    }

    public void setEsVenta(String c_esventa) {
        this.c_esventa = c_esventa;
    }

    public String getEsCobranza() {
        return c_escobranza;
    }

    public void setEsCobranza(String c_escobranza) {
        this.c_escobranza = c_escobranza;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }
}
