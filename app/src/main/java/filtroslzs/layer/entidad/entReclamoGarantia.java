package filtroslzs.layer.entidad;
import java.util.Date;

public class entReclamoGarantia {
    private int n_numero=0,n_codproducto=0,n_cliente=0,n_formato=0,n_codcia=0;
    private String c_codproducto="";
    private double n_qtyingreso=0;
    private String c_observaciones="",c_codmarca="",c_codmodelo="";
    private int n_pyear=0;
    private String c_prediagnostico="",c_observacioncliente="";
    private Date d_fechaformato;
    private String c_facturareferencia="",v_codvendedor="",c_estado="A",c_sincronizado="N";

    public int getNumero() {
        return n_numero;
    }

    public void setNumero(int n_numero) {
        this.n_numero = n_numero;
    }

    public int getCodProducto() {
        return n_codproducto;
    }

    public void setCodProducto(int n_codproducto) {
        this.n_codproducto = n_codproducto;
    }

    public int getCliente() {
        return n_cliente;
    }

    public void setCliente(int n_cliente) {
        this.n_cliente = n_cliente;
    }

    public int getFormato() {
        return n_formato;
    }

    public void setFormato(int n_formato) {
        this.n_formato = n_formato;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getVCodProducto() {
        return c_codproducto;
    }

    public void setVCodProducto(String c_codproducto) {
        this.c_codproducto = c_codproducto;
    }

    public double getQtyIngreso() {
        return n_qtyingreso;
    }

    public void setQtyIngreso(double n_qtyingreso) {
        this.n_qtyingreso = n_qtyingreso;
    }

    public String getObservaciones() {
        return c_observaciones;
    }

    public void setObservaciones(String c_observaciones) {
        this.c_observaciones = c_observaciones;
    }

    public String getCodMarca() {
        return c_codmarca;
    }

    public void setCodMarca(String c_codmarca) {
        this.c_codmarca = c_codmarca;
    }

    public String getCodModelo() {
        return c_codmodelo;
    }

    public void setCodModelo(String c_codmodelo) {
        this.c_codmodelo = c_codmodelo;
    }

    public int getPYear() {
        return n_pyear;
    }

    public void setPYear(int n_pyear) {
        this.n_pyear = n_pyear;
    }

    public String getPreDiagnostico() {
        return c_prediagnostico;
    }

    public void setPreDiagnostico(String c_prediagnostico) {
        this.c_prediagnostico = c_prediagnostico;
    }

    public String getObservacionCliente() {
        return c_observacioncliente;
    }

    public void setObservacionCliente(String c_observacioncliente) {
        this.c_observacioncliente = c_observacioncliente;
    }

    public Date getFechaFormato() {
        return d_fechaformato;
    }

    public void setFechaFormato(Date d_fechaformato) {
        this.d_fechaformato = d_fechaformato;
    }

    public String getFacturaReferencia() {
        return c_facturareferencia;
    }

    public void setFacturaReferencia(String c_facturareferencia) {
        this.c_facturareferencia = c_facturareferencia;
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

    public String getSincronizado() {
        return c_sincronizado;
    }

    public void setSincronizado(String c_sincronizado) {
        this.c_sincronizado = c_sincronizado;
    }
}
