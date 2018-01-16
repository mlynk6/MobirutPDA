package filtroslzs.layer.entidad;

public class entClientexVendCia {
    private int n_codcliente=0;
    private String v_codvendedor="";
    private int n_codcia=0;

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }
}
