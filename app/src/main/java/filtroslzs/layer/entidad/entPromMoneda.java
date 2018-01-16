package filtroslzs.layer.entidad;
import java.util.Date;

public class entPromMoneda {
    private int n_codmonedaO=0,n_codmonedaD=0;
    private String c_tiposisventa="";
    private double n_porvartipocambio=0;
    private Date d_fechatcambio;
    private double n_tipocambio=0, n_tipocambionvo=0;

    public int getCodMonedaO() {
        return n_codmonedaO;
    }

    public void setCodMonedaO(int n_codmonedaO) {
        this.n_codmonedaO = n_codmonedaO;
    }

    public int getCodMonedaD() {
        return n_codmonedaD;
    }

    public void setCodMonedaD(int n_codmonedaD) {
        this.n_codmonedaD = n_codmonedaD;
    }

    public String getTipoSisVenta() {
        return c_tiposisventa;
    }

    public void setTipoSisVenta(String c_tiposisventa) {
        this.c_tiposisventa = c_tiposisventa;
    }

    public double getPorVarTipoCambio() {
        return n_porvartipocambio;
    }

    public void setPorVarTipoCambio(double n_porvartipocambio) {
        this.n_porvartipocambio = n_porvartipocambio;
    }

    public Date getFechaTCambio() {
        return d_fechatcambio;
    }

    public void setFechaTCambio(Date d_fechatcambio) {
        this.d_fechatcambio = d_fechatcambio;
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
}
