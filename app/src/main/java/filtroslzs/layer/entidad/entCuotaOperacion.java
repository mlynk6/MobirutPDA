package filtroslzs.layer.entidad;
import java.util.Date;

public class entCuotaOperacion {
    private String c_origen="";
    private int n_codigo=0,n_linea=0,n_codmoneda=0;
    private Date d_fechaoperacion;
    private String c_bancocodigo="",c_numerooperacion="";
    private double n_montooperacion=0;
    private String c_observaciones="",c_agencia="",c_flagdoc="N";
    private int n_transaccion=0;
    private String v_documento="";

    public String getOrigen() {
        return c_origen;
    }

    public void setOrigen(String c_origen) {
        this.c_origen = c_origen;
    }

    public int getCodigo() {
        return n_codigo;
    }

    public void setCodigo(int n_codigo) {
        this.n_codigo = n_codigo;
    }

    public int getLinea() {
        return n_linea;
    }

    public void setLinea(int n_linea) {
        this.n_linea = n_linea;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public Date getFechaOperacion() {
        return d_fechaoperacion;
    }

    public void setFechaOperacion(Date d_fechaoperacion) {
        this.d_fechaoperacion = d_fechaoperacion;
    }

    public String getBancoCodigo() {
        return c_bancocodigo;
    }

    public void setBancoCodigo(String c_bancocodigo) {
        this.c_bancocodigo = c_bancocodigo;
    }

    public String getNumeroOperacion() {
        return c_numerooperacion;
    }

    public void setNumeroOperacion(String c_numerooperacion) {
        this.c_numerooperacion = c_numerooperacion;
    }

    public double getMontoOperacion() {
        return n_montooperacion;
    }

    public void setMontoOperacion(double n_montooperacion) {
        this.n_montooperacion = n_montooperacion;
    }

    public String getObservaciones() {
        return c_observaciones;
    }

    public void setObservaciones(String c_observaciones) {
        this.c_observaciones = c_observaciones;
    }

    public String getAgencia() {
        return c_agencia;
    }

    public void setAgencia(String c_agencia) {
        this.c_agencia = c_agencia;
    }

    public String getFlagDoc() {
        return c_flagdoc;
    }

    public void setFlagDoc(String c_flagdoc) {
        this.c_flagdoc = c_flagdoc;
    }

    public int getTransaccion() {
        return n_transaccion;
    }

    public void setTransaccion(int n_transaccion) {
        this.n_transaccion = n_transaccion;
    }

    public String getDocumento() {
        return v_documento;
    }

    public void setDocumento(String v_documento) {
        this.v_documento = v_documento;
    }
}
