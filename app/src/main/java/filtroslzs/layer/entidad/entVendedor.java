package filtroslzs.layer.entidad;
import java.util.Date;

public class entVendedor {
    private String v_codvendedor="",v_nombre="",v_apepat="";
    private int n_estado=0;
    private String v_apemat="",c_habilitado="S";
    private Date d_fecexpiracion;

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public String getNombre() {
        return v_nombre;
    }

    public void setNombre(String v_nombre) {
        this.v_nombre = v_nombre;
    }

    public String getApePat() {
        return v_apepat;
    }

    public void setApePat(String v_apepat) {
        this.v_apepat = v_apepat;
    }

    public int getEstado() {
        return n_estado;
    }

    public void setEstado(int n_estado) {
        this.n_estado = n_estado;
    }

    public String getApeMat() {
        return v_apemat;
    }

    public void setApeMat(String v_apemat) {
        this.v_apemat = v_apemat;
    }

    public String getHabilitado() {
        return c_habilitado;
    }

    public void setHabilitado(String c_habilitado) {
        this.c_habilitado = c_habilitado;
    }

    public Date getFecExpiracion() {
        return d_fecexpiracion;
    }

    public void setFecExpiracion(Date d_fecexpiracion) {
        this.d_fecexpiracion = d_fecexpiracion;
    }
}
