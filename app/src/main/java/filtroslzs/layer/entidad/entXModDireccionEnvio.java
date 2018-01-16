package filtroslzs.layer.entidad;

public class entXModDireccionEnvio {
    private int n_correlativo=0,n_coddirecc=0,n_flgprovincia=0,n_secuencia=0,n_codcliente=0;
    private String v_desdireccion="",c_estado="A",c_sincronizado="N",v_nuevoregistro="N";
    private double n_latitud=0,n_longitud=0;

    public int getCorrelativo() {
        return n_correlativo;
    }

    public void setCorrelativo(int n_correlativo) {
        this.n_correlativo = n_correlativo;
    }

    public int getCodDirecc() {
        return n_coddirecc;
    }

    public void setCodDirecc(int n_coddirecc) {
        this.n_coddirecc = n_coddirecc;
    }

    public int getFlgProvincia() {
        return n_flgprovincia;
    }

    public void setFlgProvincia(int n_flgprovincia) {
        this.n_flgprovincia = n_flgprovincia;
    }

    public int getSecuencia() {
        return n_secuencia;
    }

    public void setSecuencia(int n_secuencia) {
        this.n_secuencia = n_secuencia;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getDesDireccion() {
        return v_desdireccion;
    }

    public void setDesDireccion(String v_desdireccion) {
        this.v_desdireccion = v_desdireccion;
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

    public double getLatitud() {
        return n_latitud;
    }

    public void setLatitud(double n_latitud) {
        this.n_latitud = n_latitud;
    }

    public double getLongitud() {
        return n_longitud;
    }

    public void setLongitud(double n_longitud) {
        this.n_longitud = n_longitud;
    }
}
