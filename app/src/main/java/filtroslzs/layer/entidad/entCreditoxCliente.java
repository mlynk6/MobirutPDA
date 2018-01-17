package filtroslzs.layer.entidad;

public class entCreditoxCliente {
    private String v_codlinea="";
    private double n_montoasignado=0,n_montoutilizado=0,n_montodisponible=0,n_tcambio=0;
    private int n_codcia=0,n_codmoneda=0,n_codcliente=0;
    private String v_simbolo="",v_simboloDest="";

    public String getCodLinea() {
        return v_codlinea;
    }

    public void setCodLinea(String v_codlinea) {
        this.v_codlinea = v_codlinea;
    }

    public double getMontoAsignado() {
        return n_montoasignado;
    }

    public void setMontoAsignado(double n_montoasignado) {
        this.n_montoasignado = n_montoasignado;
    }

    public double getMontoUtilizado() {
        return n_montoutilizado;
    }

    public void setMontoUtilizado(double n_montoutilizado) {
        this.n_montoutilizado = n_montoutilizado;
    }

    public double getMontoDisponible() {
        return n_montodisponible;
    }

    public void setMontoDisponible(double n_montodisponible) {
        this.n_montodisponible = n_montodisponible;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getSimbolo() {
        return v_simbolo;
    }

    public void setSimbolo(String v_simbolo) {
        this.v_simbolo = v_simbolo;
    }

    public double getTCambio() {
        return n_tcambio;
    }

    public void setTCambio(double n_tcambio) {
        this.n_tcambio = n_tcambio;
    }

    public String getSimboloDest() {
        return v_simboloDest;
    }

    public void setSimboloDest(String v_simboloDest) {
        this.v_simboloDest = v_simboloDest;
    }
}
