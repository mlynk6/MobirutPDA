package filtroslzs.layer.entidad;
import java.util.Date;

public class entGestion {
    private int n_correlativo=0;
    private String c_codigousuario="",c_cliente="",c_razonsocial="";
    private Date d_fecha;
    private String c_hora="",c_flagcliente="",c_horapunta="",c_mensaje="",c_clasificacion="";
    private String c_tipollamada="",c_estado="";

    public int getCorrelativo() {
        return n_correlativo;
    }

    public void setCorrelativo(int n_correlativo) {
        this.n_correlativo = n_correlativo;
    }

    public String getCodigoUsuario() {
        return c_codigousuario;
    }

    public void setCodigoUsuario(String c_codigousuario) {
        this.c_codigousuario = c_codigousuario;
    }

    public String getCliente() {
        return c_cliente;
    }

    public void setCliente(String c_cliente) {
        this.c_cliente = c_cliente;
    }

    public String getRazonSocial() {
        return c_razonsocial;
    }

    public void setRazonSocial(String c_razonsocial) {
        this.c_razonsocial = c_razonsocial;
    }

    public Date getFecha() {
        return d_fecha;
    }

    public void setFecha(Date d_fecha) {
        this.d_fecha = d_fecha;
    }

    public String getHora() {
        return c_hora;
    }

    public void setHora(String c_hora) {
        this.c_hora = c_hora;
    }

    public String getFlagCliente() {
        return c_flagcliente;
    }

    public void setFlagCliente(String c_flagcliente) {
        this.c_flagcliente = c_flagcliente;
    }

    public String getHoraPunta() {
        return c_horapunta;
    }

    public void setHoraPunta(String c_horapunta) {
        this.c_horapunta = c_horapunta;
    }

    public String getMensaje() {
        return c_mensaje;
    }

    public void setMensaje(String c_mensaje) {
        this.c_mensaje = c_mensaje;
    }

    public String getClasificacion() {
        return c_clasificacion;
    }

    public void setClasificacion(String c_clasificacion) {
        this.c_clasificacion = c_clasificacion;
    }

    public String getTipoLlamada() {
        return c_tipollamada;
    }

    public void setTipoLlamada(String c_tipollamada) {
        this.c_tipollamada = c_tipollamada;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }
}
