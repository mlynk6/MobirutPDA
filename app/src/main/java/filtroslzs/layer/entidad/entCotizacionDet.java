package filtroslzs.layer.entidad;
import java.util.Date;

public class entCotizacionDet {
    private int n_codcotiza=0,n_codpro=0,n_linea=0,n_codcia=0;
    private String v_procedencia="";
    private double n_cantpro=0,n_precioprod=0;
    private String v_codpromo="",v_codvendcia="";
    private double n_pordsctoitem=0,n_montobruto=0,n_montodscto=0,n_montoigv=0,n_montototal=0;
    private Date d_fecregistro;
    private int n_codsisventa=0,n_codcategoria=0;
    private double n_pordsctosisventa=0,n_pordsctomontoad=0,n_pordsctocat=0,n_impdessisventa=0;
    private double n_impdescategoria=0,n_impdessisventaad=0,n_impdesitem=0,n_impdesmonto=0;
    private double n_stockvend=0,n_preciovend=0,n_tipocambio=0;
    private int n_partirpedido=0;
    private Date d_fechapcp;
    private String c_flagpase="";

    public int getCodCotiza() {
        return n_codcotiza;
    }

    public void setCodCotiza(int n_codcotiza) {
        this.n_codcotiza = n_codcotiza;
    }

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public int getLinea() {
        return n_linea;
    }

    public void setLinea(int n_linea) {
        this.n_linea = n_linea;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getProcedencia() {
        return v_procedencia;
    }

    public void setProcedencia(String v_procedencia) {
        this.v_procedencia = v_procedencia;
    }

    public double getCantPro() {
        return n_cantpro;
    }

    public void setCantPro(double n_cantpro) {
        this.n_cantpro = n_cantpro;
    }

    public double getPrecioProd() {
        return n_precioprod;
    }

    public void setPrecioProd(double n_precioprod) {
        this.n_precioprod = n_precioprod;
    }

    public String getCodPromo() {
        return v_codpromo;
    }

    public void setCodPromo(String v_codpromo) {
        this.v_codpromo = v_codpromo;
    }

    public String getCodVendCia() {
        return v_codvendcia;
    }

    public void setCodVendCia(String v_codvendcia) {
        this.v_codvendcia = v_codvendcia;
    }

    public double getPorDsctoItem() {
        return n_pordsctoitem;
    }

    public void setPorDsctoItem(double n_pordsctoitem) {
        this.n_pordsctoitem = n_pordsctoitem;
    }

    public double getMontoBruto() {
        return n_montobruto;
    }

    public void setMontoBruto(double n_montobruto) {
        this.n_montobruto = n_montobruto;
    }

    public double getMontoDscto() {
        return n_montodscto;
    }

    public void setMontoDscto(double n_montodscto) {
        this.n_montodscto = n_montodscto;
    }

    public double getMontoIgv() {
        return n_montoigv;
    }

    public void setMontoIgv(double n_montoigv) {
        this.n_montoigv = n_montoigv;
    }

    public double getMontoTotal() {
        return n_montototal;
    }

    public void setMontoTotal(double n_montototal) {
        this.n_montototal = n_montototal;
    }

    public Date getFecRegistro() {
        return d_fecregistro;
    }

    public void setFecRegistro(Date d_fecregistro) {
        this.d_fecregistro = d_fecregistro;
    }

    public int getCodSisVenta() {
        return n_codsisventa;
    }

    public void setCodSisVenta(int n_codsisventa) {
        this.n_codsisventa = n_codsisventa;
    }

    public int getCodCategoria() {
        return n_codcategoria;
    }

    public void setCodCategoria(int n_codcategoria) {
        this.n_codcategoria = n_codcategoria;
    }

    public double getPorDsctoSisVenta() {
        return n_pordsctosisventa;
    }

    public void setPorDsctoSisVenta(double n_pordsctosisventa) {
        this.n_pordsctosisventa = n_pordsctosisventa;
    }

    public double getPorDsctoMontoAD() {
        return n_pordsctomontoad;
    }

    public void setPorDsctoMontoAD(double n_pordsctomontoad) {
        this.n_pordsctomontoad = n_pordsctomontoad;
    }

    public double getPorDsctoCat() {
        return n_pordsctocat;
    }

    public void setPorDsctoCat(double n_pordsctocat) {
        this.n_pordsctocat = n_pordsctocat;
    }

    public double getImpDesSisVenta() {
        return n_impdessisventa;
    }

    public void setImpDesSisVenta(double n_impdessisventa) {
        this.n_impdessisventa = n_impdessisventa;
    }

    public double getImpDesCategoria() {
        return n_impdescategoria;
    }

    public void setImpDesCategoria(double n_impdescategoria) {
        this.n_impdescategoria = n_impdescategoria;
    }

    public double getImpDesSisVentaAD() {
        return n_impdessisventaad;
    }

    public void setImpDesSisVentaAD(double n_impdessisventaad) {
        this.n_impdessisventaad = n_impdessisventaad;
    }

    public double getImpDesItem() {
        return n_impdesitem;
    }

    public void setImpDesItem(double n_impdesitem) {
        this.n_impdesitem = n_impdesitem;
    }

    public double getImpDesMonto() {
        return n_impdesmonto;
    }

    public void setImpDesMonto(double n_impdesmonto) {
        this.n_impdesmonto = n_impdesmonto;
    }

    public double getStockVend() {
        return n_stockvend;
    }

    public void setStockVend(double n_stockvend) {
        this.n_stockvend = n_stockvend;
    }

    public double getPrecioVend() {
        return n_preciovend;
    }

    public void setPrecioVend(double n_preciovend) {
        this.n_preciovend = n_preciovend;
    }

    public double getTipoCambio() {
        return n_tipocambio;
    }

    public void setTipoCambio(double n_tipocambio) {
        this.n_tipocambio = n_tipocambio;
    }

    public int getPartirPedido() {
        return n_partirpedido;
    }

    public void setPartirPedido(int n_partirpedido) {
        this.n_partirpedido = n_partirpedido;
    }

    public Date getFechaPCP() {
        return d_fechapcp;
    }

    public void setFechaPCP(Date d_fechapcp) {
        this.d_fechapcp = d_fechapcp;
    }

    public String getFlagPase() {
        return c_flagpase;
    }

    public void setFlagPase(String c_flagpase) {
        this.c_flagpase = c_flagpase;
    }
}
