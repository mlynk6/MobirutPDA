package filtroslzs.layer.negocio;

import android.database.Cursor;
import java.util.ArrayList;
import filtroslzs.layer.data.datProducto;
import filtroslzs.layer.entidad.entDataBase;
import filtroslzs.layer.entidad.entProducto;
import filtroslzs.layer.entidad.entPrefijoPro;
import filtroslzs.layer.entidad.entSufijoPro;
import filtroslzs.layer.entidad.entProcedencia;
import filtroslzs.layer.entidad.entKits;

public class negProducto {
    private entDataBase entDB;
    private datProducto procesomain;

    public negProducto(entDataBase entDB) {
        this.entDB = entDB;
        procesomain = new datProducto(this.entDB);
    }

    public ArrayList<entProducto> ListaProductoToPedido(String Prefijo, String Sufijo, String SubCod) {
        ArrayList<entProducto> ListaDat = new ArrayList<entProducto>();
        Cursor cx = procesomain.ListaProductoToPedido(Prefijo,Sufijo,SubCod);
        entProducto objEnt;
        while (cx.moveToNext()) {
            objEnt = new entProducto();
            objEnt.setVCodPro(cx.getString(0));
            objEnt.setDesPro(cx.getString(1));
            objEnt.setStock(cx.getInt(2));
            objEnt.setProyectado(cx.getString(3));
            objEnt.setCaja(cx.getString(4));
            objEnt.setCodCia(cx.getInt(5));
            objEnt.setCodPro(cx.getInt(6));
            objEnt.setProcedencia(cx.getString(7));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entProducto> ListaProductoToPedido(String Item) {
        ArrayList<entProducto> ListaDat = new ArrayList<entProducto>();
        Cursor cx = procesomain.ListaProductoToPedido(Item);
        entProducto objEnt;
        while (cx.moveToNext()) {
            objEnt = new entProducto();
            objEnt.setVCodPro(cx.getString(0));
            objEnt.setDesPro(cx.getString(1));
            objEnt.setStock(cx.getInt(2));
            objEnt.setProyectado(cx.getString(3));
            objEnt.setCaja(cx.getString(4));
            objEnt.setCodCia(cx.getInt(5));
            objEnt.setCodPro(cx.getInt(6));
            objEnt.setProcedencia(cx.getString(7));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entProducto> ListaProductoToPedidoEquiv() {
        ArrayList<entProducto> ListaDat = new ArrayList<entProducto>();
        Cursor cx = procesomain.ListaProductoToPedidoEquiv();
        entProducto objEnt;
        while (cx.moveToNext()) {
            objEnt = new entProducto();
            objEnt.setVCodPro(cx.getString(0));
            objEnt.setDesPro(cx.getString(1));
            objEnt.setStock(cx.getInt(2));
            objEnt.setProyectado(cx.getString(3));
            objEnt.setCaja(cx.getString(4));
            objEnt.setCodCia(cx.getInt(5));
            objEnt.setCodPro(cx.getInt(6));
            objEnt.setProcedencia(cx.getString(7));
            objEnt.setCodigoEquiv(cx.getString(8));
            objEnt.setMarcaComp(cx.getString(9));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entPrefijoPro> ListaPrefijoCombo(String Cia,String Opc) {
        ArrayList<entPrefijoPro> ListaDat = new ArrayList<entPrefijoPro>();
        Cursor cx = procesomain.ListaPrefijo(Cia);
        entPrefijoPro objEnt;
        while (cx.moveToNext()) {
            objEnt = new entPrefijoPro();
            objEnt.setPrefijo(cx.getString(0));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entPrefijoPro();
            objEnt.setPrefijo(negZConst.ComboDefCodStr);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entSufijoPro> ListaSufijoCombo(String Cia,String Opc) {
        ArrayList<entSufijoPro> ListaDat = new ArrayList<entSufijoPro>();
        Cursor cx = procesomain.ListaPrefijo(Cia);
        entSufijoPro objEnt;
        while (cx.moveToNext()) {
            objEnt = new entSufijoPro();
            objEnt.setSufijo(cx.getString(0));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entSufijoPro();
            objEnt.setSufijo(negZConst.ComboDefCodStr);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entProcedencia> ListaProcedenciaCombo(String Opc) {
        ArrayList<entProcedencia> ListaDat = new ArrayList<entProcedencia>();
        Cursor cx = procesomain.ListaProcedencia();
        entProcedencia objEnt;
        while (cx.moveToNext()) {
            objEnt = new entProcedencia();
            objEnt.setProcedencia(cx.getString(0));
            objEnt.setDescripcion(cx.getString(1));
            objEnt.setEstado(cx.getString(2));
            objEnt.setReventa(cx.getString(3));
            objEnt.setEditaPrecio(cx.getString(4));
            ListaDat.add(objEnt);
        }
        if(Opc.length()>0){
            objEnt = new entProcedencia();
            objEnt.setProcedencia(negZConst.ComboDefCodStr);objEnt.setDescripcion(Opc);
            ListaDat.add(0,objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }

    public ArrayList<entKits> ListaKitToPedido(String Item, String Limite) {
        ArrayList<entKits> ListaDat = new ArrayList<entKits>();
        Cursor cx = procesomain.ListaProcedencia();
        entKits objEnt;
        while (cx.moveToNext()) {
            objEnt = new entKits();
            objEnt.setVehiculo(cx.getString(0));
            objEnt.setUsoPrincipal(cx.getString(1));
            objEnt.setFiltros(cx.getString(2));
            ListaDat.add(objEnt);
        }
        objEnt = null;
        cx.close();
        cx=null;
        return ListaDat;
    }
}
