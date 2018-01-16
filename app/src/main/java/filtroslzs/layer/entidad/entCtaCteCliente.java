package filtroslzs.layer.entidad;
import java.util.Date;

public class entCtaCteCliente {
    private int n_codctacorriente=0,n_codcia=0,n_codcliente=0;
    private String v_numdoc="";
    private double n_montoeudaactual=0,n_tipocambio=0;
    private int n_codmoneda=0,n_diasvencimiento=0,n_transaccion=0;
    private Date d_fecvencimiento;
    private String v_codigounico="",v_banco="",c_estado="",v_flagpermitir="",v_codlinea="";
    private String v_observacion="",v_docasociado="",v_textohtml="";

    public int getCodCtaCorriente() {
        return n_codctacorriente;
    }

    public void setCodCtaCorriente(int n_codctacorriente) {
        this.n_codctacorriente = n_codctacorriente;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public String getNumDoc() {
        return v_numdoc;
    }

    public void setNumDoc(String v_numdoc) {
        this.v_numdoc = v_numdoc;
    }

    public double getMontoDeudaActual() {
        return n_montoeudaactual;
    }

    public void setMontoDeudaActual(double n_montoeudaactual) {
        this.n_montoeudaactual = n_montoeudaactual;
    }

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public int getDiasVencimiento() {
        return n_diasvencimiento;
    }

    public void setDiasVencimiento(int n_diasvencimiento) {
        this.n_diasvencimiento = n_diasvencimiento;
    }

    public int getTransaccion() {
        return n_transaccion;
    }

    public void setTransaccion(int n_transaccion) {
        this.n_transaccion = n_transaccion;
    }

    public Date getFecVencimiento() {
        return d_fecvencimiento;
    }

    public void setFecVencimiento(Date d_fecvencimiento) {
        this.d_fecvencimiento = d_fecvencimiento;
    }

    public String getCodigoUnico() {
        return v_codigounico;
    }

    public void setCodigoUnico(String v_codigounico) {
        this.v_codigounico = v_codigounico;
    }

    public String getBnco() {
        return v_banco;
    }

    public void setBanco(String v_banco) {
        this.v_banco = v_banco;
    }

    public String getEstado() {
        return c_estado;
    }

    public void setEstado(String c_estado) {
        this.c_estado = c_estado;
    }

    public String getFlagPermitir() {
        return v_flagpermitir;
    }

    public void setFlagPermitir(String v_flagpermitir) {
        this.v_flagpermitir = v_flagpermitir;
    }

    public String getCodLinea() {
        return v_codlinea;
    }

    public void setCodLinea(String v_codlinea) {
        this.v_codlinea = v_codlinea;
    }

    public String getObservacion() {
        return v_observacion;
    }

    public void setObservacion(String v_observacion) {
        this.v_observacion = v_observacion;
    }

    public String getDocAsociado() {
        return v_docasociado;
    }

    public void setDocAsociado(String v_docasociado) {
        this.v_docasociado = v_docasociado;
    }

    public String getTextoHtml() {
        return v_textohtml;
    }

    public void setTextoHtml(String v_textohtml) {
        this.v_textohtml = v_textohtml;
    }
}
