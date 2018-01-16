package filtroslzs.layer.entidad;

import java.util.Date;

public class entCambioMoneda {
    private String c_monedacambio="";
    private double n_tipocambio=0,n_tipocambionvo=0;
    private Date d_fechatcambio;

    public String getMonedaCambio() {
        return c_monedacambio;
    }

    public void setMonedaCambio(String c_monedacambio) {
        this.c_monedacambio = c_monedacambio;
    }

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public double getTipoCambioNvo() {
        return n_tipocambionvo;
    }

    public void setTipoCambioNvo(double n_tipocambionvo) {
        this.n_tipocambionvo = n_tipocambionvo;
    }

    public Date getFechaTCambio() {
        return d_fechatcambio;
    }

    public void setFechaTCambio(Date d_fechatcambio) {
        this.d_fechatcambio = d_fechatcambio;
    }
}
