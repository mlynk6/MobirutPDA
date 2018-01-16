package filtroslzs.layer.entidad;

public class entCompania {
    private int n_codcia=0;
    private String v_descia="",c_tipopromocion="",c_flag_nr="N",c_flag_serie="N",c_partir_pedido="N";
    private String c_flagfechapcp="N";
    private int n_monedapartess=0;
    private double n_montolimitepartess=0;
    private String c_flagcontado_ob="N",c_flagletra_ob="N",c_soloparte2="N";
    private int n_diaspcp=0;
    private String c_verificastockpartir="N",c_pedmasivo="N";

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getDesCia() {
        return v_descia;
    }

    public void setDesCia(String v_descia) {
        this.v_descia = v_descia;
    }

    public String getTipoPromocion() {
        return c_tipopromocion;
    }

    public void setTipoPromocion(String c_tipopromocion) {
        this.c_tipopromocion = c_tipopromocion;
    }

    public String getFlagNR() {
        return c_flag_nr;
    }

    public void setFlagNR(String c_flag_nr) {
        this.c_flag_nr = c_flag_nr;
    }

    public String getFlagSerie() {
        return c_flag_serie;
    }

    public void setFlagSerie(String c_flag_serie) {
        this.c_flag_serie = c_flag_serie;
    }

    public String getPartirPedido() {
        return c_partir_pedido;
    }

    public void setPartirPedido(String c_partir_pedido) {
        this.c_partir_pedido = c_partir_pedido;
    }

    public String getFlagFechaPCP() {
        return c_flagfechapcp;
    }

    public void setFlagFechaPCP(String c_flagfechapcp) {
        this.c_flagfechapcp = c_flagfechapcp;
    }

    public int getMonedaParteSS() {
        return n_monedapartess;
    }

    public void setMonedaParteSS(int n_monedapartess) {
        this.n_monedapartess = n_monedapartess;
    }

    public double getMontoLimiteParteSS() {
        return n_montolimitepartess;
    }

    public void setMontoLimiteParteSS(double n_montolimitepartess) {
        this.n_montolimitepartess = n_montolimitepartess;
    }

    public String getFlagContadoOB() {
        return c_flagcontado_ob;
    }

    public void setFlagContadoOB(String c_flagcontado_ob) {
        this.c_flagcontado_ob = c_flagcontado_ob;
    }

    public String getFlagLetraOB() {
        return c_flagletra_ob;
    }

    public void setFlagLetraOB(String c_flagletra_ob) {
        this.c_flagletra_ob = c_flagletra_ob;
    }

    public String getSoloParte2() {
        return c_soloparte2;
    }

    public void setSoloParte2(String c_soloparte2) {
        this.c_soloparte2 = c_soloparte2;
    }

    public int getDiasPCP() {
        return n_diaspcp;
    }

    public void setDiasPCP(int n_diaspcp) {
        this.n_diaspcp = n_diaspcp;
    }

    public String getVerificaStockPartir() {
        return c_verificastockpartir;
    }

    public void setVerificaStockPartir(String c_verificastockpartir) {
        this.c_verificastockpartir = c_verificastockpartir;
    }

    public String getPedMasivo() {
        return c_pedmasivo;
    }

    public void setPedMasivo(String c_pedmasivo) {
        this.c_pedmasivo = c_pedmasivo;
    }

}
