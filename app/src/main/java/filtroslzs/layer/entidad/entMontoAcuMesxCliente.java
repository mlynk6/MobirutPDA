package filtroslzs.layer.entidad;

public class entMontoAcuMesxCliente {
    private int n_ano=0,n_codcliente=0;
    private double n_montoacumuladomes=0;
    private int n_mes=0,n_codmoneda=0,n_codcia=0;

    public int getAnual() {
        return n_ano;
    }

    public void setAnual(int n_ano) {
        this.n_ano = n_ano;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public double getMontoAcumuladoMes() {
        return n_montoacumuladomes;
    }

    public void setMontoAcumuladoMes(double n_montoacumuladomes) {
        this.n_montoacumuladomes = n_montoacumuladomes;
    }

    public int getMes() {
        return n_mes;
    }

    public void setMes(int n_mes) {
        this.n_mes = n_mes;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }
}
