package filtroslzs.layer.entidad;

public class entAgenciaTransporte {

    private int n_codtranspor=0,n_flgestado=0;
    private String v_razsocial="",c_flagpermitir="S",v_direccion="",v_descripcion="",v_ruc="";

    public int getCodTranspor() {
        return n_codtranspor;
    }

    public void setCodTranspor(int n_codtranspor) {
        this.n_codtranspor = n_codtranspor;
    }

    public int getFlgestado() {
        return n_flgestado;
    }

    public void setFlgestado(int n_flgestado) {
        this.n_flgestado = n_flgestado;
    }

    public String getRazSocial() {
        return v_razsocial;
    }

    public void setRazsocial(String v_razsocial) {
        this.v_razsocial = v_razsocial;
    }

    public String getFlagPermitir() {
        return c_flagpermitir;
    }

    public void setFlagPermitir(String c_flagpermitir) {
        this.c_flagpermitir = c_flagpermitir;
    }

    public String getDireccion() {
        return v_direccion;
    }

    public void setDireccion(String v_direccion) {
        this.v_direccion = v_direccion;
    }

    public String getDescripcion() {
        return v_descripcion;
    }

    public void setDescripcion(String v_descripcion) {
        this.v_descripcion = v_descripcion;
    }

    public String getRuc() {
        return v_ruc;
    }

    public void setRuc(String v_ruc) {
        this.v_ruc = v_ruc;
    }
}
