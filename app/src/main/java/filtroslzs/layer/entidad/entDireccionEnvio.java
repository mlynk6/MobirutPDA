package filtroslzs.layer.entidad;

public class entDireccionEnvio {
    private int n_coddirecc=0,n_flgprovincia=0,n_secuencia=0,n_codcliente=0;
    private String v_desdireccion="",c_estado="A",v_gps="N";
    private double n_latitud=0,n_longitud=0;
    private String v_rutapams="";

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

    public String getGPS() {
        return v_gps;
    }

    public void setGPS(String v_gps) {
        this.v_gps = v_gps;
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

    public String getRutaPams() {
        return v_rutapams;
    }

    public void setRutaPams(String v_rutapams) {
        this.v_rutapams = v_rutapams;
    }
}
