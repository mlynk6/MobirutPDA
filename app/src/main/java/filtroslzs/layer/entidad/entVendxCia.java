package filtroslzs.layer.entidad;

public class entVendxCia {
    private int n_codcia=0;
    String v_contrasena="",v_codvendcia="",v_codvendedor="",v_mercaderista="N";

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getContrasena() {
        return v_contrasena;
    }

    public void setContrasena(String v_contrasena) {
        this.v_contrasena = v_contrasena;
    }

    public String getCodVendCia() {
        return v_codvendcia;
    }

    public void setCodVendCia(String v_codvendcia) {
        this.v_codvendcia = v_codvendcia;
    }

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public String getMercaderista() {
        return v_mercaderista;
    }

    public void setMercaderista(String v_mercaderista) {
        this.v_mercaderista = v_mercaderista;
    }
}
