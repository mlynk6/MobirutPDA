package filtroslzs.layer.entidad;

public class entTipoCategoriaCliente {
    private String c_tipocategoria="",c_descripcion="",c_estado="A";

    public String getTipoCategoria() {
        return c_tipocategoria;
    }

    public void setTipoCategoria(String c_tipocategoria) {
        this.c_tipocategoria = c_tipocategoria;
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
