package filtroslzs.layer.entidad;

public class entClienteRuta {
    private String c_periodo="";
    private int n_ciasecundaria=0,n_cliente=0,n_dia=0,n_orden=0,n_direccion=0;
    private String c_observant="",c_verificado="";

    public String getPeriodo() {
        return c_periodo;
    }

    public void setPeriodo(String c_periodo) {
        this.c_periodo = c_periodo;
    }

    public int getCiaSecundaria() {
        return n_ciasecundaria;
    }

    public void setCiaSecundaria(int n_ciasecundaria) {
        this.n_ciasecundaria = n_ciasecundaria;
    }

    public int getCliente() {
        return n_cliente;
    }

    public void setCliente(int n_cliente) {
        this.n_cliente = n_cliente;
    }

    public int getDia() {
        return n_dia;
    }

    public void setDia(int n_dia) {
        this.n_dia = n_dia;
    }

    public int getOrden() {
        return n_orden;
    }

    public void setOrden(int n_orden) {
        this.n_orden = n_orden;
    }

    public int getDireccion() {
        return n_direccion;
    }

    public void setDireccion(int n_direccion) {
        this.n_direccion = n_direccion;
    }

    public String getObservAnt() {
        return c_observant;
    }

    public void setObservAnt(String c_observant) {
        this.c_observant = c_observant;
    }

    public String getVerificado() {
        return c_verificado;
    }

    public void setVerificado(String c_verificado) {
        this.c_verificado = c_verificado;
    }
}

