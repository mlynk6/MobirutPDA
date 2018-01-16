package filtroslzs.layer.entidad;
import java.util.Date;

public class entCotizacion {
    private int n_codcotiza=0,n_codestadocot=0,n_cantdias=0,n_codcliente=0,n_coddirecc=0;
    private Date d_fecregistro,d_fecmodif;
    private int n_flgparc=0,n_codsisventa=0,n_tiempocotiza=0,n_codmoneda=0,n_secuencia=0;
    private double n_montobruto=0,n_montodsctototal=0,n_montoigv=0,n_pordsctocat=0;
    private int n_codcia=0,n_codcategoria=0,n_idparametros=0,n_codobserv=0,n_codtranspor=0;
    private String v_codvendedor="",v_codlinea="";
    private double n_pordsctosisventa=0,n_coddscto=0,n_pordsctomonto=0,n_pordsctomontoad=0;
    private String razon_social="",ruc="",telefono="",contacto="",c_pais="",c_departamentocodigo="";
    private String c_provinciacodigo="",c_distritocodigo="",direccion="",c_flagaprobar="N";
    private int n_codvisita=0,n_letras=0,n_operaciones=0;
    private String v_codvendcia="",c_recalcular="",c_partirpedido="",c_tipopartir="",c_tipocuota="";
    private double n_latitud=0,n_longitud=0;
    private String c_obspase="",c_obsventa="",c_numeroorden="",c_obspedido="",c_cambiomonedaret="";
    private int n_codmonedaant=0;
    private double n_tipocambio=0,n_tipocambiohoy=0;
    private Date d_fechatcambio;
    private String c_simulado="";

    public int getCodCotiza() {
        return n_codcotiza;
    }

    public void setCodCotiza(int n_codcotiza) {
        this.n_codcotiza = n_codcotiza;
    }

    public int getCodEstadoCot() {
        return n_codestadocot;
    }

    public void setCodEstadoCot(int n_codestadocot) {
        this.n_codestadocot = n_codestadocot;
    }

    public int getCantDias() {
        return n_cantdias;
    }

    public void setCantDias(int n_cantdias) {
        this.n_cantdias = n_cantdias;
    }

    public int getCodCliente() {
        return n_codcliente;
    }

    public void setCodCliente(int n_codcliente) {
        this.n_codcliente = n_codcliente;
    }

    public int getCodDirecc() {
        return n_coddirecc;
    }

    public void setCodDirecc(int n_coddirecc) {
        this.n_coddirecc = n_coddirecc;
    }

    public Date getFecRegistro() {
        return d_fecregistro;
    }

    public void setFecRegistro(Date d_fecregistro) {
        this.d_fecregistro = d_fecregistro;
    }

    public Date getFecModif() {
        return d_fecmodif;
    }

    public void setFecModif(Date d_fecmodif) {
        this.d_fecmodif = d_fecmodif;
    }

    public int getFlgParc() {
        return n_flgparc;
    }

    public void setFlgParc(int n_flgparc) {
        this.n_flgparc = n_flgparc;
    }

    public int getCodSisVenta() {
        return n_codsisventa;
    }

    public void setCodSisVenta(int n_codsisventa) {
        this.n_codsisventa = n_codsisventa;
    }

    public int getTiempoCotiza() {
        return n_tiempocotiza;
    }

    public void setTiempoCotiza(int n_tiempocotiza) {
        this.n_tiempocotiza = n_tiempocotiza;
    }

    public int getCodMoneda() {
        return n_codmoneda;
    }

    public void setCodMoneda(int n_codmoneda) {
        this.n_codmoneda = n_codmoneda;
    }

    public int getSecuencia() {
        return n_secuencia;
    }

    public void setSecuencia(int n_secuencia) {
        this.n_secuencia = n_secuencia;
    }

    public double getMontoBruto() {
        return n_montobruto;
    }

    public void setMontoBruto(double n_montobruto) {
        this.n_montobruto = n_montobruto;
    }

    public double getMontoDsctoTotal() {
        return n_montodsctototal;
    }

    public void setMontoDsctoTotal(double n_montodsctototal) {
        this.n_montodsctototal = n_montodsctototal;
    }

    public double getMontoIgv() {
        return n_montoigv;
    }

    public void setMontoIgv(double n_montoigv) {
        this.n_montoigv = n_montoigv;
    }

    public double getPorDsctoCat() {
        return n_pordsctocat;
    }

    public void setPorDsctoCat(double n_pordsctocat) {
        this.n_pordsctocat = n_pordsctocat;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodCategoria() {
        return n_codcategoria;
    }

    public void setCodCategoria(int n_codcategoria) {
        this.n_codcategoria = n_codcategoria;
    }

    public int getIdParametros() {
        return n_idparametros;
    }

    public void setIdParametros(int n_idparametros) {
        this.n_idparametros = n_idparametros;
    }

    public int getCodObserv() {
        return n_codobserv;
    }

    public void setCodObserv(int n_codobserv) {
        this.n_codobserv = n_codobserv;
    }

    public int getCodTranspor() {
        return n_codtranspor;
    }

    public void setCodTranspor(int n_codtranspor) {
        this.n_codtranspor = n_codtranspor;
    }

    public String getCodVendedor() {
        return v_codvendedor;
    }

    public void setCodVendedor(String v_codvendedor) {
        this.v_codvendedor = v_codvendedor;
    }

    public String getCodLinea() {
        return v_codlinea;
    }

    public void setCodLinea(String v_codlinea) {
        this.v_codlinea = v_codlinea;
    }

    public double getPorDsctoSisVenta() {
        return n_pordsctosisventa;
    }

    public void setPorDsctoSisVenta(double n_pordsctosisventa) {
        this.n_pordsctosisventa = n_pordsctosisventa;
    }

    public double getCodDscto() {
        return n_coddscto;
    }

    public void setCodDscto(double n_coddscto) {
        this.n_coddscto = n_coddscto;
    }

    public double getPorDsctoMonto() {
        return n_pordsctomonto;
    }

    public void setPorDsctoMonto(double n_pordsctomonto) {
        this.n_pordsctomonto = n_pordsctomonto;
    }

    public double getPorDsctoMontoAD() {
        return n_pordsctomontoad;
    }

    public void setPorDsctoMontoAD(double n_pordsctomontoad) {
        this.n_pordsctomontoad = n_pordsctomontoad;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFlagAprobar() {
        return c_flagaprobar;
    }

    public void setFlagAprobar(String c_flagaprobar) {
        this.c_flagaprobar = c_flagaprobar;
    }

    public int getCodVisita() {
        return n_codvisita;
    }

    public void setCodVisita(int n_codvisita) {
        this.n_codvisita = n_codvisita;
    }

    public int getLetras() {
        return n_letras;
    }

    public void setLetras(int n_letras) {
        this.n_letras = n_letras;
    }

    public int getOperaciones() {
        return n_operaciones;
    }

    public void setOperaciones(int n_operaciones) {
        this.n_operaciones = n_operaciones;
    }

    public String getCodVendCia() {
        return v_codvendcia;
    }

    public void setCodVendCia(String v_codvendcia) {
        this.v_codvendcia = v_codvendcia;
    }

    public String getRecalcular() {
        return c_recalcular;
    }

    public void setRecalcular(String c_recalcular) {
        this.c_recalcular = c_recalcular;
    }

    public String getPartirPedido() {
        return c_partirpedido;
    }

    public void setPartirPedido(String c_partirpedido) {
        this.c_partirpedido = c_partirpedido;
    }

    public String getTipoPartir() {
        return c_tipopartir;
    }

    public void setTipoPartir(String c_tipopartir) {
        this.c_tipopartir = c_tipopartir;
    }

    public String getTipoCuota() {
        return c_tipocuota;
    }

    public void setTipoCuota(String c_tipocuota) {
        this.c_tipocuota = c_tipocuota;
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

    public String getObsPase() {
        return c_obspase;
    }

    public void setObsPase(String c_obspase) {
        this.c_obspase = c_obspase;
    }

    public String getObsVenta() {
        return c_obsventa;
    }

    public void setObsVenta(String c_obsventa) {
        this.c_obsventa = c_obsventa;
    }

    public String getNumeroOrden() {
        return c_numeroorden;
    }

    public void setNumeroOrden(String c_numeroorden) {
        this.c_numeroorden = c_numeroorden;
    }

    public String getObsPedido() {
        return c_obspedido;
    }

    public void setObsPedido(String c_obspedido) {
        this.c_obspedido = c_obspedido;
    }

    public String getCambioMonedaRet() {
        return c_cambiomonedaret;
    }

    public void setCambioMonedaRet(String c_cambiomonedaret) {
        this.c_cambiomonedaret = c_cambiomonedaret;
    }

    public int getCodMonedaAnt() {
        return n_codmonedaant;
    }

    public void setCodMonedaAnt(int n_codmonedaant) {
        this.n_codmonedaant = n_codmonedaant;
    }

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public double getTipoCambioHoy() {
        return n_tipocambiohoy;
    }

    public void setTipoCambioHoy(double n_tipocambiohoy) {
        this.n_tipocambiohoy = n_tipocambiohoy;
    }

    public Date getFechaTCambio() {
        return d_fechatcambio;
    }

    public void setFechaTCambio(Date d_fechatcambio) {
        this.d_fechatcambio = d_fechatcambio;
    }

    public String getSimulado() {
        return c_simulado;
    }

    public void setSimulado(String c_simulado) {
        this.c_simulado = c_simulado;
    }
}
