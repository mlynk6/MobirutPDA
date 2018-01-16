package filtroslzs.layer.entidad;

public class entXModTelefono {
    private int n_correlativo=0,n_codcliente=0;
    private String c_telefono="",c_clasificatelefono="",c_estado="A",c_sincronizado="N";
    private String v_nuevoregistro="N";

    public int getCorrelativo() {
        return n_correlativo;
    }

    public void setCorrelativo(int n_correlativo) {
        this.n_correlativo = n_correlativo;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getTelefono() {
        return c_telefono;
    }

    public void setTelefono(String c_telefono) {
        this.c_telefono = c_telefono;
    }

    public String getClasificaTelefono() {
        return c_clasificatelefono;
    }

    public void setClasificaTelefono(String c_clasificatelefono) {
        this.c_clasificatelefono = c_clasificatelefono;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }

    public String getSincronizado() {
        return c_sincronizado;
    }

    public void setSincronizado(String c_sincronizado) {
        this.c_sincronizado = c_sincronizado;
    }

    public String getNuevoRegistro() {
        return v_nuevoregistro;
    }

    public void setNuevoRegistro(String v_nuevoregistro) {
        this.v_nuevoregistro = v_nuevoregistro;
    }
}
