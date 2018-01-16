package filtroslzs.layer.entidad;
import java.util.Date;

public class entPromocionDiaL {
    private int n_codcia=0,n_codpro=0;
    private Date d_fecha;
    private int n_codpro_l=0;

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public Date getFecha() {
        return d_fecha;
    }

    public void setFecha(Date d_fecha) {
        this.d_fecha = d_fecha;
    }

    public int getCodProL() {
        return n_codpro_l;
    }

    public void setCodProL(int n_codpro_l) {
        this.n_codpro_l = n_codpro_l;
    }
}
