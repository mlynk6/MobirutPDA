package filtroslzs.layer.entidad;
import java.util.Date;

public class entVisita {
    private int n_codvisita=0,n_codcliente=0,n_codcia=0;
    private Date d_fecvisita;
    private int d_duracionvisitamin=0,n_coddirecc=0,n_codmotivo=0,n_codrpta=0;
    private String v_codvendedor="",c_estado="",v_mayorista="",observ="";
    private String razon_social="",ruc="",telefono="",contacto="",c_pais="";
    private String c_departamentocodigo="",c_provinciacodigo="",c_distritocodigo="";
    private String direccion="",c_sincronizado="N";
    private double n_latitud=0,n_longitud=0;

    public int getCodVisita() {
        return n_codvisita;
    }

    public void setCodVisita(int n_codvisita) {
        this.n_codvisita = n_codvisita;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public Date getFecVisita() {
        return d_fecvisita;
    }

    public void setFecVisita(Date d_fecvisita) {
        this.d_fecvisita = d_fecvisita;
    }

    public int getDuracionVisitaMin() {
        return d_duracionvisitamin;
    }

    public void setDuracionVisitaMin(int d_duracionvisitamin) {
        this.d_duracionvisitamin = d_duracionvisitamin;
    }

    public int getCodDirecc() {
        return n_coddirecc;
    }

    public void setCodDirecc(int n_coddirecc) {
        this.n_coddirecc = n_coddirecc;
    }

    public int getCodMotivo() {
        return n_codmotivo;
    }

    public void setCodMotivo(int n_codmotivo) {
        this.n_codmotivo = n_codmotivo;
    }

    public int getCodRpta() {
        return n_codrpta;
    }

    public void setCodRpta(int n_codrpta) {
        this.n_codrpta = n_codrpta;
    }

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }

    public String getMayorista() {
        return v_mayorista;
    }

    public void setMayorista(String v_mayorista) {
        this.v_mayorista = v_mayorista;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getRazonSocial() {
        return razon_social;
    }

    public void setRazonSocial(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPais() {
        return c_pais;
    }

    public void setPais(String c_pais) {
        this.c_pais = c_pais;
    }

    public String getDepartamentoCodigo() {
        return c_departamentocodigo;
    }

    public void setDepartamentoCodigo(String c_departamentocodigo) {
        this.c_departamentocodigo = c_departamentocodigo;
    }

    public String getProvinciaCodigo() {
        return c_provinciacodigo;
    }

    public void setProvinciaCodigo(String c_provinciacodigo) {
        this.c_provinciacodigo = c_provinciacodigo;
    }

    public String getDistritoCodigo() {
        return c_distritocodigo;
    }

    public void setDistritoCodigo(String c_distritocodigo) {
        this.c_distritocodigo = c_distritocodigo;
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
}
