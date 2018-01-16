package filtroslzs.layer.entidad;

public class entCliente {
    private String v_codcliente="";
    private int n_codcliente=0;
    private String v_apemat="",v_nombre="",v_direccion="",v_email="",v_estadocliente="",v_razsocial="";
    private String v_apepat="",v_telefono="",v_garante="",v_agenteretencion="",v_docfiscal="",v_correo="";
    private String v_departamento="",v_provincia="",v_distrito="",v_contacto="",v_clientenuevo="N";
    private String v_tiponegocio="",v_flag_nr="N",c_flagmoneda="N";
    private int n_moneda=0;
    private String c_flagpreciolista="N",c_flagprecioneto="N";
    private int n_cantletras=0;
    private double n_porcentajedoc=0;
    private String c_textolsthtml="",c_textoreghtml="";

    public String getVCodCliente() {
        return v_codcliente;
    }

    public void setVCodCliente(String v_codcliente) {
        this.v_codcliente = v_codcliente;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getApeMat() {
        return v_apemat;
    }

    public void setApeMat(String v_apemat) {
        this.v_apemat = v_apemat;
    }

    public String getNombre() {
        return v_nombre;
    }

    public void setNombre(String v_nombre) {
        this.v_nombre = v_nombre;
    }

    public String getDireccion() {
        return v_direccion;
    }

    public void setDireccion(String v_direccion) {
        this.v_direccion = v_direccion;
    }

    public String getEmail() {
        return v_email;
    }

    public void setEmail(String v_email) {
        this.v_email = v_email;
    }

    public String getEstadoCliente() {
        return v_estadocliente;
    }

    public void setEstadoCliente(String v_estadocliente) {
        this.v_estadocliente = v_estadocliente;
    }

    public String getRazSocial() {
        return v_razsocial;
    }

    public void setRazSocial(String v_razsocial) {
        this.v_razsocial = v_razsocial;
    }

    public String getApePat() {
        return v_apepat;
    }

    public void setApePat(String v_apepat) {
        this.v_apepat = v_apepat;
    }

    public String getTelefono() {
        return v_telefono;
    }

    public void setTelefono(String v_telefono) {
        this.v_telefono = v_telefono;
    }

    public String getGarante() {
        return v_garante;
    }

    public void setGarante(String v_garante) {
        this.v_garante = v_garante;
    }

    public String getAgenteRetencion() {
        return v_agenteretencion;
    }

    public void setAgenteRetencion(String v_agenteretencion) {
        this.v_agenteretencion = v_agenteretencion;
    }

    public String getDocFiscal() {
        return v_docfiscal;
    }

    public void setDocFiscal(String v_docfiscal) {
        this.v_docfiscal = v_docfiscal;
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

    public String getContacto() {
        return v_contacto;
    }

    public void setContacto(String v_contacto) {
        this.v_contacto = v_contacto;
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

    public String getFlagNR() {
        return v_flag_nr;
    }

    public void setFlagNR(String v_flag_nr) {
        this.v_flag_nr = v_flag_nr;
    }

    public String getFlagMoneda() {
        return c_flagmoneda;
    }

    public void setFlagMoneda(String c_flagmoneda) {
        this.c_flagmoneda = c_flagmoneda;
    }

    public int getMoneda() {
        return n_moneda;
    }

    public void setMoneda(int n_moneda) {
        this.n_moneda = n_moneda;
    }

    public String getFlagPrecioLista() {
        return c_flagpreciolista;
    }

    public void setC_FlagPrecioLista(String c_flagpreciolista) {
        this.c_flagpreciolista = c_flagpreciolista;
    }

    public String getFlagPrecioNeto() {
        return c_flagprecioneto;
    }

    public void setFlagPrecioNeto(String c_flagprecioneto) {
        this.c_flagprecioneto = c_flagprecioneto;
    }

    public int getCanLetras() {
        return n_cantletras;
    }

    public void setCantLetras(int n_cantletras) {
        this.n_cantletras = n_cantletras;
    }

    public double getPorcentajeDoc() {
        return n_porcentajedoc;
    }

    public void setPorcentajeDoc(double n_porcentajedoc) {
        this.n_porcentajedoc = n_porcentajedoc;
    }

    public String getTextoLstHtml() {
        return c_textolsthtml;
    }

    public void setTextoLstHtml(String c_textolsthtml) {
        this.c_textolsthtml = c_textolsthtml;
    }

    public String getTextoRegHtml() {
        return c_textoreghtml;
    }

    public void setTextoRegHtml(String c_textoreghtml) {
        this.c_textoreghtml = c_textoreghtml;
    }
}
