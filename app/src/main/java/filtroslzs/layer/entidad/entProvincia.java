package filtroslzs.layer.entidad;

public class entProvincia {
    private String c_pais="",c_departamentocodigo="",c_provinciacodigo="",c_descripcion="";
    private String c_estado="";

    public String getPais() {
        return c_pais;
    }

    public void setPais(String c_pais) {
        this.c_pais = c_pais;
    }

    public String getDepartamentoCodigo() {
        return c_departamentocodigo;
    }

    public void setDepartamentoCodigo(String c_departamentocodigo) {
        this.c_departamentocodigo = c_departamentocodigo;
    }

    public String getProvinciaCodigo() {
        return c_provinciacodigo;
    }

    public void setProvinciaCodigo(String c_provinciacodigo) {
        this.c_provinciacodigo = c_provinciacodigo;
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
