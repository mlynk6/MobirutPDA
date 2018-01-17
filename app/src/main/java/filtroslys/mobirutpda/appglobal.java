package filtroslys.mobirutpda;
import filtroslzs.layer.entidad.*;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

public class appglobal extends Application {
	private String Usuario, Fecha, USinc="N";
	private String UMaestroId="MAESTRO",UMaestroClave="MAESTRO";
	private String CodigoVendedor="MAESTRO", NombreVendedor = "";
	private int CodCia=1; String NombreCia = "";
	private String codVendCia="", codTransp="";

	// Configuracion Predeterminada del WebService, cambia al momento de
	// utilizar las ip y puertos. 
	private String soapnombreweb = "Mobirut";
	private String soapnamespace = "http://www.example.org/ObtenerDatos/";
	private String soapmetodo = "solicitarInformacion";
	/*private String soapip = "190.187.181.56";
	private String soappuerto = "80";*/
	private String soapip = "100.100.100.186";
	private String soappuerto = "8080";
	private String soapaccion = soapnamespace + soapmetodo;
	private String soapurl = "http://" + soapip + ":" + soappuerto + "/" + soapnombreweb + "/services/ObtenerDatosSOAP";
	private String urlreclamogarantia = "http://" + soapip + ":" + soappuerto + "/" + "webupload/uploadreclamogarantia.jsp";
	private String urldescarga = "http://" + soapip + ":" + soappuerto + "/" + "lys/archivos.html";
	private String urlfotocatalogo = "http://" + soapip + ":" + soappuerto + "/" + "lys/verimagencatalogo.jsp?itemproc=";

	// Configuracion de Rutas en memoria externa para lectura.
	private String rutaconf = "/mobirut/config";
	private String rutacatalogo = "/mobirut/"; // Esto no tiene la carpeta
												// catalogo, por que solo se
												// copia del server la ruta de
												// fotocatalogo y sus fotos;
	private String rutagarantia = "/mobirut/garantia/";
	private String rutacotizaciones = "/mobirut/cotizacion";
	private String archconf = "config.txt";
	private String upk = "638;8>;9B=B", sfk = "37;8:<",sfk2 = "27<76<7@";
	private int regkits = 20;

	private int clientesel=0;
	private SQLiteDatabase db;
	private entDataBase entConnDB;
	private String esindustrial = "N";
	private String dbWebService = "A";
	private boolean esAdmin = false;
	private boolean SiGPS = false;
	private boolean ConSerie=false;
	private boolean PartirPedido=false;
	private boolean ValidarFechaPCP=false;
	private boolean ContadoObligatorio = false;
	private boolean LetraObligatorio = false;
	private boolean PermiteSoloParte2 = false;
	private boolean PedidoMasivo = false;
	private boolean esSuperAdmin = false;
	private boolean esMercaderista = false;
	private entRptaServ eRptaServ = new entRptaServ();

	public String getUsuario() {
		return Usuario;
	}

	public String getFecha() {
		return Fecha;
	}

	public String getCodigoVendedor() {
		return CodigoVendedor;
	}

	public String getNombreVendedor() {
		return NombreVendedor;
	}

	public String getNombreCia() {
		return NombreCia;
	}

	public int getCodCia() {
		return CodCia;
	}

	public String getCodVendCia() {
		return codVendCia;
	}

	public String getCodTransp() {
		return codTransp;
	}

	public int getClienteId() {
		return clientesel;
	}

	public SQLiteDatabase getDataBase() {
		return db;
	}

	public String getSoapNombreWeb() {
		return soapnombreweb;
	}

	public String getSoapNamespace() {
		return soapnamespace;
	}

	public String getSoapMetodo() {
		return soapmetodo;
	}

	public String getSoapAccion() {
		return soapaccion;
	}

	public String getSoapUrl() {
		return soapurl;
	}

	public String getSoapIp() {
		return soapip;
	}

	public String getSoapPuerto() {
		return soappuerto;
	}

	public String getRutaConf() {
		return rutaconf;
	}

	public String getRutaCatalogo() {
		return rutacatalogo;
	}

	public String getArchivoConf() {
		return archconf;
	}

	public String getRutaCotizaciones() {
		return rutacotizaciones;
	}

	public String getRutaGarantia() {
		return rutagarantia;
	}

	public String getRutaImagenGarantia() {
		return urlreclamogarantia;
	}

	public String getUpk() {
		return upk;
	}

	public String getSfk() {
		return sfk;
	}

	public String getSfk2() {
		return sfk2;
	}
	
	public entDataBase getConexion() {
		return entConnDB;
	}
	
	public String getRutaDescargaHTML() {
		return urldescarga;
	}

	public int getRegMaxKits() {
		return regkits;
	}

	public String getEsIndustrial()	{
		return esindustrial;
	}
	
	public String getdbWebService()	{
		return dbWebService;
	}
	
	public boolean getEsAdmin(){
		return esAdmin;
	}
	
	public boolean getEsSuperAdmin(){
		return esSuperAdmin;
	}
	
	public boolean getSiGPS(){
		return SiGPS;
	}
	
	public boolean getConSerie(){
		return ConSerie;
	}
	
	public boolean getPartirPedido(){
		return PartirPedido;
	}
	
	public boolean getValidarFechaPCP(){
		return ValidarFechaPCP;
	}
	
	public boolean getContadoObligatorio(){
		return ContadoObligatorio;
	}
	
	public boolean getLetraObligatorio(){
		return LetraObligatorio;
	}
	
	public boolean getPermiteSoloParte2(){
		return PermiteSoloParte2;
	}
	
	public boolean getPedidoMasivo(){
		return PedidoMasivo;
	}
	
	public String getUrlFotoCatalogo(){
		return urlfotocatalogo;
	}

	public String getUsuarioMaestroID(){
		return UMaestroId;
	}

	public String getUsuarioMaestroPW(){
		return UMaestroClave;
	}

	public boolean getEsMercaderista(){
		return esMercaderista;
	}

	public String getUsuarioSincronizado(){
		return USinc;
	}

	public entRptaServ getRptaServ() {
		if(eRptaServ==null){
			eRptaServ=new entRptaServ();
		}
		return eRptaServ;
	}

	public void setUsuario(String Usuario) {
		this.Usuario = Usuario;
	}

	public void setFecha(String Fecha) {
		this.Fecha = Fecha;
	}

	public void setCodigoVendedor(String CodigoVendedor) {
		this.CodigoVendedor = CodigoVendedor;
	}

	public void setNombreVendedor(String NombreVendedor) {
		this.NombreVendedor = NombreVendedor;
	}

	public void setNombreCia(String NombreCia) {
		this.NombreCia = NombreCia;
	}

	public void setCodCia(int CodCia) {
		this.CodCia = CodCia;
	}

	public void setCodVendCia(String codVendCia) {
		this.codVendCia = codVendCia;
	}

	public void setCodTransp(String codTransp) {
		this.codTransp = codTransp;
	}

	public void setClienteId(int clientesel) {
		this.clientesel = clientesel;
	}

	public void setDataBase(SQLiteDatabase db) {
		this.db = db;
	}

	public void setSoapNombreWeb(String soapnombreweb) {
		this.soapnombreweb = soapnombreweb;
	}

	public void setSoapNamespace(String soapnamespace) {
		this.soapnamespace = soapnamespace;
	}

	public void setSoapMetodo(String soapmetodo) {
		this.soapmetodo = soapmetodo;
	}

	public void setSoapAccion(String soapaccion) {
		this.soapaccion = soapaccion;
	}

	public void setSoapUrl(String soapurl) {
		this.soapurl = soapurl;
	}

	public void setSoapIp(String soapip) {
		this.soapip = soapip;
	}

	public void setSoapPuerto(String soappuerto) {
		this.soappuerto = soappuerto;
	}

	public void setRutaConf(String rutaconf) {
		this.rutaconf = rutaconf;
	}

	public void setRutaCotizaciones(String rutacotizaciones) {
		this.rutacotizaciones = rutacotizaciones;
	}

	public void setRutaCatalogo(String rutacatalogo) {
		this.rutacatalogo = rutacatalogo;
	}

	public void setArchivoConf(String archconf) {
		this.archconf = archconf;
	}

	public void setRutaGarantia(String rutagarantia) {
		this.rutagarantia = rutagarantia;
	}

	public void setRutaImagenGarantia(String urlreclamogarantia) {
		this.urlreclamogarantia = urlreclamogarantia;
	}

	public void setUpk(String upk) {
		this.upk = upk;
	}

	public void setSfk(String sfk) {
		this.sfk = sfk;
	}

	public void setSfk2(String sfk2) {
		this.sfk2 = sfk2;
	}
	
	public void setRutaDescargaHTML(String urldescarga) {
		this.urldescarga = urldescarga;
	}

	public void setRegMaxKits(int regkits) {
		this.regkits = regkits;
	}

	public void setConexion(entDataBase entConnDB) {
		this.entConnDB = entConnDB;
	}
	
	public void setEsIndustrial(String esindustrial) {
		this.esindustrial = esindustrial;
	}
	
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}	
	
	public void setEsSuperAdmin(boolean esSuperAdmin) {
		this.esSuperAdmin = esSuperAdmin;
	}	
	
	public void setdbWebService(String dbWebService) {
		this.dbWebService = dbWebService;
	}
	
	public void setSiGPS(boolean SiGPS) {
		this.SiGPS = SiGPS;
	}
	
	public void setConSerie(boolean ConSerie) {
		this.ConSerie = ConSerie;
	}
	
	public void setPartirPedido(boolean PartirPedido) {
		this.PartirPedido = PartirPedido;
	}
	
	public void setValidarFechaPCP(boolean ValidarFechaPCP) {
		this.ValidarFechaPCP = ValidarFechaPCP;
	}
	
	public void setContadoObligatorio(boolean ContadoObligatorio) {
		this.ContadoObligatorio = ContadoObligatorio;
	}
	
	public void setLetraObligatorio(boolean LetraObligatorio) {
		this.LetraObligatorio = LetraObligatorio;
	}

	public void setPermiteSoloParte2(boolean PermiteSoloParte2) {
		this.PermiteSoloParte2 = PermiteSoloParte2;
	}
	
	public void setPedidoMasivo(boolean PedidoMasivo){
		this.PedidoMasivo = PedidoMasivo;
	}
	
	public void setUrlFotoCatalogo(String urlfotocatalogo){
		this.urlfotocatalogo = urlfotocatalogo;
	}
	
	public void setEsMercaderista(boolean esMercaderista){
		this.esMercaderista = esMercaderista;
	}

	public void setUsuarioMaestroID(String UMaestroId){
		this.UMaestroId = UMaestroId;
	}

	public void setUsuarioMaestroPW(String UMaestroClave){
		this.UMaestroClave = UMaestroClave;
	}

	public void setUsuarioSincronizado(String USinc){
		this.USinc = USinc;
	}

	public void setRptaServ(entRptaServ eRptaServ) {
		this.eRptaServ = eRptaServ;
	}
}
