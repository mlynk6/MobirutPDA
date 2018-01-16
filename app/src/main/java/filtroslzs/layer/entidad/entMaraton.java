package filtroslzs.layer.entidad;

public class entMaraton {
    private int n_codcia=0,n_codcliente=0;
    private String c_tipopromo="",c_descripcion="";
    private double n_cuota=0,n_puntosobt=0,n_puntosdisponibles=0;

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getTipoPromo() {
        return c_tipopromo;
    }

    public void setTipoPromo(String c_tipopromo) {
        this.c_tipopromo = c_tipopromo;
    }

    public String getDescripcion() {
        return c_descripcion;
    }

    public void setDescripcion(String c_descripcion) {
        this.c_descripcion = c_descripcion;
    }

    public double getCuota() {
        return n_cuota;
    }

    public void setCuota(double n_cuota) {
        this.n_cuota = n_cuota;
    }

    public double getPuntosObt() {
        return n_puntosobt;
    }

    public void setPuntosObt(double n_puntosobt) {
        this.n_puntosobt = n_puntosobt;
    }

    public double getPuntosDisponibles() {
        return n_puntosdisponibles;
    }

    public void setPuntosDisponibles(double n_puntosdisponibles) {
        this.n_puntosdisponibles = n_puntosdisponibles;
    }
}
