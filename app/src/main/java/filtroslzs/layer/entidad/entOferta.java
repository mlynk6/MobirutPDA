package filtroslzs.layer.entidad;

public class entOferta {
    private int n_codoferta=0,n_codcia=0;
    private String v_desoferta="";

    public int getCodOferta() {
        return n_codoferta;
    }

    public void setCodOferta(int n_codoferta) {
        this.n_codoferta = n_codoferta;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getDesOferta() {
        return v_desoferta;
    }

    public void setDesOferta(String v_desoferta) {
        this.v_desoferta = v_desoferta;
    }
}
