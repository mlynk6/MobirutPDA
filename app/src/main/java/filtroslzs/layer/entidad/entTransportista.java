package filtroslzs.layer.entidad;

import java.util.Date;

public class entTransportista {
    private String v_compania="",v_usuario="",v_nombre="",v_password="";
    private Date d_fecexpiracion;

    public String getCompania() {
        return v_compania;
    }

    public void setCompania(String v_compania) {
        this.v_compania = v_compania;
    }

    public String getUsuario() {
        return v_usuario;
    }

    public void setUsuario(String v_usuario) {
        this.v_usuario = v_usuario;
    }

    public String getNombre() {
        return v_nombre;
    }

    public void setNombre(String v_nombre) {
        this.v_nombre = v_nombre;
    }

    public String getPassword() {
        return v_password;
    }

    public void setPassword(String v_password) {
        this.v_password = v_password;
    }

    public Date getFecExpiracion() {
        return d_fecexpiracion;
    }

    public void setFecExpiracion(Date d_fecexpiracion) {
        this.d_fecexpiracion = d_fecexpiracion;
    }
}
