package filtroslzs.layer.entidad;

public class entPrefijoPro {
    private int n_codprefijo=0;
    private String v_prefijo="";
    private int n_codcia=0,n_flgestado=0;

    public int getCodPrefijo() {
        return n_codprefijo;
    }

    public void setCodPrefijo(int n_codprefijo) {
        this.n_codprefijo = n_codprefijo;
    }

    public String getPrefijo() {
        return v_prefijo;
    }

    public void setPrefijo(String v_prefijo) {
        this.v_prefijo = v_prefijo;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getFlgEstado() {
        return n_flgestado;
    }

    public void setFlgEstado(int n_flgestado) {
        this.n_flgestado = n_flgestado;
    }
}
