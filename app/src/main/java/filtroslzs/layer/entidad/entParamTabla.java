package filtroslzs.layer.entidad;
import java.util.Date;

public class entParamTabla {
    private String c_parametro="";
    private String c_texto="";
    private double n_numero=0;
    private Date d_fecha;

    public String getParametro() {
        return c_parametro;
    }

    public void setParametro(String c_parametro) {
        this.c_parametro = c_parametro;
    }

    public String getTexto() {
        return c_texto;
    }

    public void setTexto(String c_texto) {
        this.c_texto = c_texto;
    }

    public double getNumero() {
        return n_numero;
    }

    public void setNumero(double n_numero) {
        this.n_numero = n_numero;
    }

    public Date getFecha() {
        return d_fecha;
    }

    public void setFecha(Date d_fecha) {
        this.d_fecha = d_fecha;
    }
}
