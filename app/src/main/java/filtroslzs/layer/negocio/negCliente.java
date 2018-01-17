package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datCliente;
import filtroslzs.layer.entidad.entCliente;
import filtroslzs.layer.entidad.entCreditoxCliente;
import filtroslzs.layer.entidad.entCtaCteCliente;
import filtroslzs.layer.entidad.entTelefono;
import filtroslzs.layer.entidad.entDataBase;

public class negCliente {
    private entDataBase entDB;
    private datCliente procesomain;

    public negCliente(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datCliente(this.entDB);
    }

    public ArrayList<entCliente> ListaCliente(String Vend,String Cia,String Codigo,String Nombre) {
        ArrayList<entCliente> ListaDat = new ArrayList<entCliente>();
        Cursor cx = procesomain.ListaCliente(Vend,Cia,Codigo,Nombre);
        entCliente objEnt;
        while (cx.moveToNext()) {
            objEnt = new entCliente();
            objEnt.setCodCliente(cx.getInt(0));
            objEnt.setRazSocial(cx.getString(1));
            objEnt.setDireccion(cx.getString(3));
            objEnt.setDocFiscal(cx.getString(4));
            objEnt.setSegmento(cx.getString(5));
            objEnt.setTipoCategoria(cx.getString(6));
            objEnt.setDescuento(cx.getString(7));
            objEnt.setTextoLstHtml(cx.getString(8));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entCliente> ListaClienteRuta(String Vend,String Cia,String Codigo,String Nombre,int Dia){
        ArrayList<entCliente> ListaDat = new ArrayList<entCliente>();
        Cursor cx = procesomain.ListaClienteRuta(Vend,Cia,Codigo,Nombre,Dia);
        entCliente objEnt;
        while (cx.moveToNext()) {
            objEnt = new entCliente();
            objEnt.setCodCliente(cx.getInt(0));
            objEnt.setRazSocial(cx.getString(1));
            objEnt.setDireccion(cx.getString(3));
            objEnt.setDocFiscal(cx.getString(4));
            objEnt.setSegmento(cx.getString(5));
            objEnt.setTipoCategoria(cx.getString(6));
            objEnt.setDescuento(cx.getString(7));
            objEnt.setTextoLstHtml(cx.getString(8));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public entCliente VerClienteForm(String Cliente,String Cia) {
        Cursor cx = procesomain.VerClienteForm(Cliente,Cia);
        entCliente objEnt = new entCliente();

        if (cx.moveToFirst()) {
            objEnt.setCodCliente(cx.getInt(0));
            objEnt.setRazSocial(cx.getString(1));
            objEnt.setDireccion(cx.getString(2));
            objEnt.setDocFiscal(cx.getString(3));
            objEnt.setSegmento(cx.getString(4));
            objEnt.setTipoCategoria(cx.getString(5));
            objEnt.setDescuento(cx.getString(6));
            objEnt.setTextoRegHtml(cx.getString(7));
            objEnt.setAgenteRetencion(cx.getString(8));
            objEnt.setGarante(cx.getString(9));
            objEnt.setCantLetras(cx.getInt(10));
            objEnt.setPorcentajeDoc(cx.getDouble(11));
        }
        cx.close();
        cx=null;
        return objEnt;
    }

    public ArrayList<entCliente> ListaClienteCombo(String Vend,String Cia,String Opc) {
        ArrayList<entCliente> ListaDat = new ArrayList<entCliente>();
        Cursor cx = procesomain.ListaClienteCombo(Vend,Cia);
        entCliente objEnt;
        while (cx.moveToNext()) {
            objEnt = new entCliente();
            objEnt.setCodCliente(cx.getInt(0));
            objEnt.setRazSocial(cx.getString(1));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entCliente();
            objEnt.setCodCliente(negZConst.ComboDefCodEnt);objEnt.setRazSocial(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entCreditoxCliente> ListaLineaCredito(String Cliente,String Cia) {
        ArrayList<entCreditoxCliente> ListaDat = new ArrayList<entCreditoxCliente>();
        Cursor cx = procesomain.ListaLineaCredito(Cliente,Cia);
        entCreditoxCliente objEnt;
        while (cx.moveToNext()) {
            objEnt = new entCreditoxCliente();
            objEnt.setCodLinea(cx.getString(0));
            objEnt.setCodMoneda(cx.getInt(1));
            objEnt.setSimbolo(cx.getString(2));
            objEnt.setMontoAsignado(cx.getDouble(3));
            objEnt.setMontoDisponible(cx.getDouble(4));
            objEnt.setTCambio(cx.getDouble(5));
            objEnt.setSimboloDest(cx.getString(6));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entCtaCteCliente> ListaCuentaCorriente(String Cliente) {
        ArrayList<entCtaCteCliente> ListaDat = new ArrayList<entCtaCteCliente>();
        Cursor cx = procesomain.ListaCuentaCorriente(Cliente);
        entCtaCteCliente objEnt;
        while (cx.moveToNext()) {
            objEnt = new entCtaCteCliente();
            objEnt.setNumDoc(cx.getString(0));
            objEnt.setSimbolo(cx.getString(1));
            objEnt.setMontoDeudaActual(cx.getDouble(2));
            objEnt.setFecVencimiento(negZConst.getFecha(cx.getString(3)));
            objEnt.setDiasVencimiento(cx.getInt(4));
            objEnt.setCodigoUnico(cx.getString(5));
            objEnt.setBanco(cx.getString(6));
            objEnt.setEstado(cx.getString(7));
            objEnt.setFlagPermitir(cx.getString(8));
            objEnt.setCodLinea(cx.getString(9));
            objEnt.setDescCia(cx.getString(10));
            objEnt.setObservacion(cx.getString(11));
            objEnt.setDocAsociado(cx.getString(12));
            objEnt.setTextoHtml(cx.getString(13));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entTelefono> ListaTelefonoCombo(String Cliente,String Opc) {
        ArrayList<entTelefono> ListaDat = new ArrayList<entTelefono>();
        Cursor cx = procesomain.ListaTelefono(Cliente);
        entTelefono objEnt;
        while (cx.moveToNext()) {
            objEnt = new entTelefono();
            objEnt.setCliente(cx.getInt(0));
            objEnt.setTelefono(cx.getString(1));
            objEnt.setClasificaTelefono(cx.getString(2));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entTelefono();
            objEnt.setCliente(negZConst.ComboDefCodEnt);objEnt.setTelefono(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

}
