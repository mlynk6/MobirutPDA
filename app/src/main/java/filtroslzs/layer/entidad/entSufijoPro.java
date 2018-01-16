package filtroslzs.layer.entidad;

public class entSufijoPro {
    private int n_codsufijo=0,n_codcia=0;
    private String v_sufijo="";
    private int n_flgestado=0;

    public int getCodSufijo() {
        return n_codsufijo;
    }

    public void setCodSufijo(int n_codsufijo) {
        this.n_codsufijo = n_codsufijo;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getSufijo() {
        return v_sufijo;
    }

    public void setSufijo(String v_sufijo) {
        this.v_sufijo = v_sufijo;
    }

    public int getFlgEstado() {
        return n_flgestado;
    }

    public void setFlgEstado(int n_flgestado) {
        this.n_flgestado = n_flgestado;
    }
}
