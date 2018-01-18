package filtroslzs.layer.data;

import android.database.Cursor;
import filtroslzs.layer.entidad.entDataBase;

public class datPedido {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datPedido(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaPedido(String Pedido,String Cliente,String CodCia,String OpcionSinc) {
        int nSinc = 0;
        String sSimbolo = "<>";
        sql = "Select n_codestadoped from tbc_estadopedido where v_desestado = 'Sincronizado'";
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) {nSinc = c.getInt(0);}

        if (Pedido.length() == 0) Pedido = "a.n_codpedido";
        if (OpcionSinc.equals("SI")) sSimbolo = "=";

        sql = "Select a.n_codpedido,b.n_codcliente,"
            + "(case when a.razon_social <> '' then a.razon_social else b.v_razsocial end), "
            + "a.d_fecregistro,a.d_fecmodif,a.n_codcotiza "
            + "from mvc_pedido a "
            + "inner join tbc_cliente b on (a.n_codcliente = b.n_codcliente) "
            + "where a.n_codpedido = " + Pedido + " "
            + "and (case when a.razon_social <> '' then a.razon_social else b.v_razsocial end) like '%" + Cliente + "%' "
            + "and a.n_codcia = " + CodCia + " "
            + "and a.n_codestadoped " + sSimbolo + " " + nSinc + " "
            + "and a.n_codpedido > 0 "
            + "order by a.n_codpedido asc";
        c = objDat.EjecutaSelect(sql);
        return c;
    }
}