package filtroslzs.layer.entidad;

public class entPromocionSegItem {
    private int n_cia=0,n_codproPNT=0,n_codproITEM=0;
    private String v_segmento="";

    public int getCia() {
        return n_cia;
    }

    public void setCia(int n_cia) {
        this.n_cia = n_cia;
    }

    public int getCodProPNT() {
        return n_codproPNT;
    }

    public void setCodProPNT(int n_codproPNT) {
        this.n_codproPNT = n_codproPNT;
    }

    public int getCodProITEM() {
        return n_codproITEM;
    }

    public void setCodProITEM(int n_codproITEM) {
        this.n_codproITEM = n_codproITEM;
    }

    public String getSegmento() {
        return v_segmento;
    }

    public void setSegmento(String v_segmento) {
        this.v_segmento = v_segmento;
    }
}
