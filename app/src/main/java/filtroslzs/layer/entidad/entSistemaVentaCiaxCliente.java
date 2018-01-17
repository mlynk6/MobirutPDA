package filtroslzs.layer.entidad;

public class entSistemaVentaCiaxCliente {
    private int n_codsisventa=0,n_codcia=0,n_codcliente=0;
    private String v_desSistVta="",v_generarLet="",v_tipoSistVta="";

    public int getCodSisVenta() {
        return n_codsisventa;
    }

    public void setCodSisVenta(int n_codsisventa) {
        this.n_codsisventa = n_codsisventa;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getDesSistVta() {
        return v_desSistVta;
    }

    public void setDesSistVta(String v_desSistVta) {
        this.v_desSistVta = v_desSistVta;
    }

    public String getGenerarLetra() {
        return v_generarLet;
    }

    public void setGenerarLetra(String v_generarLet) {
        this.v_generarLet = v_generarLet;
    }

    public String getTipoSistVta() {
        return v_tipoSistVta;
    }

    public void setTipoSistVta(String v_tipoSistVta) {
        this.v_tipoSistVta = v_tipoSistVta;
    }
}
