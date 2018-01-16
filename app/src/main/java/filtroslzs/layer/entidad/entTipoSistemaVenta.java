package filtroslzs.layer.entidad;

public class entTipoSistemaVenta {
    private int n_codtiposistemaventa=0;
    private String v_codtiposistemaventa="",v_destiposistemaventa="";

    public int getCodTipoSistemaVenta() {
        return n_codtiposistemaventa;
    }

    public void setCodTipoSistemaVenta(int n_codtiposistemaventa) {
        this.n_codtiposistemaventa = n_codtiposistemaventa;
    }

    public String getVCodTipoSistemaVenta() {
        return v_codtiposistemaventa;
    }

    public void setVCodTipoSistemaVenta(String v_codtiposistemaventa) {
        this.v_codtiposistemaventa = v_codtiposistemaventa;
    }

    public String getDesTipoSistemaVenta() {
        return v_destiposistemaventa;
    }

    public void setDesTipoSistemaVenta(String v_destiposistemaventa) {
        this.v_destiposistemaventa = v_destiposistemaventa;
    }
}
