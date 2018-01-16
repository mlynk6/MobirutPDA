package filtroslzs.layer.entidad;
import java.util.Date;

public class entPedidoEnLinea {
    private String c_estado="",c_estadonombre="",c_tipodocumento="",c_seriedocumento="";
    private int n_cia = 0,n_numerodocumento=0,n_cliente=0,n_cotizacion=0;
    private String c_clientenombre="";
    private Date d_fechaemision;
    private String c_sistemaventa="",c_moneda="";
    private double n_montototal=0;
    private String c_transporte="",c_guias="",c_html="",c_error="",c_mensajeerror="";

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }

    public String getEstadoNombre() {
        return c_estadonombre;
    }

    public void setEstadoNombre(String c_estadonombre) {
        this.c_estadonombre = c_estadonombre;
    }

    public String getTipoDocumento() {
        return c_tipodocumento;
    }

    public void setTipoDocumento(String c_tipodocumento) {
        this.c_tipodocumento = c_tipodocumento;
    }

    public String getSerieDocumento() {
        return c_seriedocumento;
    }

    public void setSerieDocumento(String c_seriedocumento) {
        this.c_seriedocumento = c_seriedocumento;
    }

    public int getCia() {
        return n_cia;
    }

    public void setCia(int n_cia) {
        this.n_cia = n_cia;
    }

    public int getNumeroDocumento() {
        return n_numerodocumento;
    }

    public void setNumeroDocumento(int n_numerodocumento) {
        this.n_numerodocumento = n_numerodocumento;
    }

    public int getCliente() {
        return n_cliente;
    }

    public void setCliente(int n_cliente) {
        this.n_cliente = n_cliente;
    }

    public int getCotizacion() {
        return n_cotizacion;
    }

    public void setCotizacion(int n_cotizacion) {
        this.n_cotizacion = n_cotizacion;
    }

    public String getClienteNombre() {
        return c_clientenombre;
    }

    public void setClienteNombre(String c_clientenombre) {
        this.c_clientenombre = c_clientenombre;
    }

    public Date getFechaEmision() {
        return d_fechaemision;
    }

    public void setFechaEmision(Date d_fechaemision) {
        this.d_fechaemision = d_fechaemision;
    }

    public String getSistemaVenta() {
        return c_sistemaventa;
    }

    public void setSistemaVenta(String c_sistemaventa) {
        this.c_sistemaventa = c_sistemaventa;
    }

    public String getMoneda() {
        return c_moneda;
    }

    public void setMoneda(String c_moneda) {
        this.c_moneda = c_moneda;
    }

    public double getMontoTotal() {
        return n_montototal;
    }

    public void setMontoTotal(double n_montototal) {
        this.n_montototal = n_montototal;
    }

    public String getTransporte() {
        return c_transporte;
    }

    public void setTransporte(String c_transporte) {
        this.c_transporte = c_transporte;
    }

    public String getGuias() {
        return c_guias;
    }

    public void setGuias(String c_guias) {
        this.c_guias = c_guias;
    }

    public String getHtml() {
        return c_html;
    }

    public void setHtml(String c_html) {
        this.c_html = c_html;
    }

    public String getError() {
        return c_error;
    }

    public void setError(String c_error) {
        this.c_error = c_error;
    }

    public String getMensajeError() {
        return c_mensajeerror;
    }

    public void setMensajeError(String c_mensajeerror) {
        this.c_mensajeerror = c_mensajeerror;
    }
}
