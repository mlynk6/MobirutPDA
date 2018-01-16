package filtroslzs.layer.entidad;
import java.util.Date;

public class entXModCliente {
    private int n_correlativo=0,n_codclientecab=0,n_codcliente=0;
    private String v_razsocial="",v_docfiscal="",v_direccion="",v_contacto="",v_correo="";
    private String v_departamento="",v_provincia="",v_distrito="",c_sincronizado="N";
    private int n_codpedido=0,n_codvisita=0;
    private String v_tipo="",v_clientenuevo="N",v_tiponegocio="",v_observacion="";
    private double n_latitud=0,n_longitud=0;
    private Date d_fecharegistro;
    private String v_codvendedor="",v_flagnocartera="N",v_motivonocartera="";

    public int getCorrelativo() {
        return n_correlativo;
    }

    public void setCorrelativo(int n_correlativo) {
        this.n_correlativo = n_correlativo;
    }

    public int getCodClienteCab() {
        return n_codclientecab;
    }

    public void setCodClienteCab(int n_codclientecab) {
        this.n_codclientecab = n_codclientecab;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getRazSocial() {
        return v_razsocial;
    }

    public void setRazSocial(String v_razsocial) {
        this.v_razsocial = v_razsocial;
    }

    public String getDocFiscal() {
        return v_docfiscal;
    }

    public void setDocFiscal(String v_docfiscal) {
        this.v_docfiscal = v_docfiscal;
    }

    public String getDireccion() {
        return v_direccion;
    }

    public void setDireccion(String v_direccion) {
        this.v_direccion = v_direccion;
    }

    public String getContacto() {
        return v_contacto;
    }

    public void setContacto(String v_contacto) {
        this.v_contacto = v_contacto;
    }

    public String getCorreo() {
        return v_correo;
    }

    public void setCorreo(String v_correo) {
        this.v_correo = v_correo;
    }

    public String getDepartamento() {
        return v_departamento;
    }

    public void setDepartamento(String v_departamento) {
        this.v_departamento = v_departamento;
    }

    public String getProvincia() {
        return v_provincia;
    }

    public void setProvincia(String v_provincia) {
        this.v_provincia = v_provincia;
    }

    public String getDistrito() {
        return v_distrito;
    }

    public void setDistrito(String v_distrito) {
        this.v_distrito = v_distrito;
    }

    public String getSincronizado() {
        return c_sincronizado;
    }

    public void setSincronizado(String c_sincronizado) {
        this.c_sincronizado = c_sincronizado;
    }

    public int getCodPedido() {
        return n_codpedido;
    }

    public void setCodPedido(int n_codpedido) {
        this.n_codpedido = n_codpedido;
    }

    public int getCodVisita() {
        return n_codvisita;
    }

    public void setCodVisita(int n_codvisita) {
        this.n_codvisita = n_codvisita;
    }

    public String getTipo() {
        return v_tipo;
    }

    public void setTipo(String v_tipo) {
        this.v_tipo = v_tipo;
    }

    public String getClienteNuevo() {
        return v_clientenuevo;
    }

    public void setClienteNuevo(String v_clientenuevo) {
        this.v_clientenuevo = v_clientenuevo;
    }

    public String getTipoNegocio() {
        return v_tiponegocio;
    }

    public void setTipoNegocio(String v_tiponegocio) {
        this.v_tiponegocio = v_tiponegocio;
    }

    public String getObservacion() {
        return v_observacion;
    }

    public void setObservacion(String v_observacion) {
        this.v_observacion = v_observacion;
    }

    public double getLatitud() {
        return n_latitud;
    }

    public void setLatitud(double n_latitud) {
        this.n_latitud = n_latitud;
    }

    public double getLongitud() {
        return n_longitud;
    }

    public void setLongitud(double n_longitud) {
        this.n_longitud = n_longitud;
    }

    public Date getFechaRegistro() {
        return d_fecharegistro;
    }

    public void setFechaRegistro(Date d_fecharegistro) {
        this.d_fecharegistro = d_fecharegistro;
    }

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public String getFlagNoCartera() {
        return v_flagnocartera;
    }

    public void setFlagNoCartera(String v_flagnocartera) {
        this.v_flagnocartera = v_flagnocartera;
    }

    public String getMotivoNoCartera() {
        return v_motivonocartera;
    }

    public void setMotivoNoCartera(String v_motivonocartera) {
        this.v_motivonocartera = v_motivonocartera;
    }
}
