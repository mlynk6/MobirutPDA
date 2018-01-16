package filtroslzs.layer.entidad;

public class entMoneda {
    private int n_codmoneda=0;
    private String v_simbolo="",v_desmoneda="",v_codmoneda="";
    private double n_tipocambio=0;
    private int n_monedadefecto=0;

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public String getSimbolo() {
        return v_simbolo;
    }

    public void setSimbolo(String v_simbolo) {
        this.v_simbolo = v_simbolo;
    }

    public String getDesMoneda() {
        return v_desmoneda;
    }

    public void setDesMoneda(String v_desmoneda) {
        this.v_desmoneda = v_desmoneda;
    }

    public String getVCodMoneda() {
        return v_codmoneda;
    }

    public void setVCodmoneda(String v_codmoneda) {
        this.v_codmoneda = v_codmoneda;
    }

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public int getMonedaDefecto() {
        return n_monedadefecto;
    }

    public void setMonedaDefecto(int n_monedadefecto) {
        this.n_monedadefecto = n_monedadefecto;
    }
}
