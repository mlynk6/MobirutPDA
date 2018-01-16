package filtroslzs.layer.entidad;
import java.util.Date;

public class entStock {
    private int n_indice=0,n_codpro=0;
    private String v_procedencia="";
    private double n_stock=0;
    private Date d_fechapcp;

    public int getIndice() {
        return n_indice;
    }

    public void setIndice(int n_indice) {
        this.n_indice = n_indice;
    }

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public String getProcedencia() {
        return v_procedencia;
    }

    public void setProcedencia(String v_procedencia) {
        this.v_procedencia = v_procedencia;
    }

    public double getStock() {
        return n_stock;
    }

    public void setStock(double n_stock) {
        this.n_stock = n_stock;
    }

    public Date getFechaPCP() {
        return d_fechapcp;
    }

    public void setFechaPCP(Date d_fechapcp) {
        this.d_fechapcp = d_fechapcp;
    }
}
