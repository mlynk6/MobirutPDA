package filtroslzs.layer.entidad;

public class entClienteTelefono {
    private int n_cliente=0;
    private String c_telefono="",c_clasificatelefono="",c_estado="";

    public int getCcliente() {
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

    public String getClasificaTlefono() {
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

}
