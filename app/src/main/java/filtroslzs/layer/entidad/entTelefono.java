package filtroslzs.layer.entidad;

public class entTelefono {
    private int n_cliente=0;
    private String c_telefono="",c_clasificatelefono="";

    public int getCliente() {
        return n_cliente;
    }

    public void setCliente(int n_cliente) {
        this.n_cliente = n_cliente;
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
}
