package filtroslzs.layer.entidad;

public class entDsctoxMonto {
    private int n_coddscto=0,n_codcia=0,n_codmoneda=0;
    private String v_segmento="";
    private double n_pordscto=0,n_montomin=0,n_montomax=0,n_montomin_nr=0,n_montomax_nr=0;

    public int getCodDscto() {
        return n_coddscto;
    }

    public void setCodDscto(int n_coddscto) {
        this.n_coddscto = n_coddscto;
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

    public String getSegmento() {
        return v_segmento;
    }

    public void setSegmento(String v_segmento) {
        this.v_segmento = v_segmento;
    }

    public double getPorDscto() {
        return n_pordscto;
    }

    public void setPorDscto(double n_pordscto) {
        this.n_pordscto = n_pordscto;
    }

    public double getMontoMin() {
        return n_montomin;
    }

    public void setMontoMin(double n_montomin) {
        this.n_montomin = n_montomin;
    }

    public double getMontoMax() {
        return n_montomax;
    }

    public void setMontoMax(double n_montomax) {
        this.n_montomax = n_montomax;
    }

    public double getMontoMinNR() {
        return n_montomin_nr;
    }

    public void setMontoMinNR(double n_montomin_nr) {
        this.n_montomin_nr = n_montomin_nr;
    }

    public double getMontoMaxNR() {
        return n_montomax_nr;
    }

    public void setMontoMaxNR(double n_montomax_nr) {
        this.n_montomax_nr = n_montomax_nr;
    }
}
