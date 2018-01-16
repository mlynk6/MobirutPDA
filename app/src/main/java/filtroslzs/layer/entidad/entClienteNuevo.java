package filtroslzs.layer.entidad;

public class entClienteNuevo {
    private int n_codclinuevo=0,n_codpedido=0;
    private String razon_social="",ruc="",telefono="",contacto="",tipo_ingreso="";
    private int n_codestcli=0;
    private String c_pais="",c_departamentocodigo="",c_provinciacodigo="",c_distritocodigo="",direccion="";

    public int getCodCliNuevo() {
        return n_codclinuevo;
    }

    public void setCodCliNuevo(int n_codclinuevo) {
        this.n_codclinuevo = n_codclinuevo;
    }

    public int getCodPedido() {
        return n_codpedido;
    }

    public void setCodPedido(int n_codpedido) {
        this.n_codpedido = n_codpedido;
    }

    public String getRazonSocial() {
        return razon_social;
    }

    public void setRazoSocial(String razon_social) {
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

    public String getTipoIngreso() {
        return tipo_ingreso;
    }

    public void setTipoIngreso(String tipo_ingreso) {
        this.tipo_ingreso = tipo_ingreso;
    }

    public int getCoDestCli() {
        return n_codestcli;
    }

    public void setCoDestCli(int n_codestcli) {
        this.n_codestcli = n_codestcli;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
