package filtroslzs.layer.data;

import android.database.Cursor;

import filtroslzs.layer.entidad.entDataBase;

public class datProducto {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datProducto(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaProductoToPedido(String Prefijo, String Sufijo, String SubCod) {
        Prefijo = Prefijo.trim();
        Sufijo = Sufijo.trim();
        SubCod = SubCod.trim();

        if (Prefijo.equalsIgnoreCase(".") == false) {
            SubCod = Prefijo + SubCod;
        }

        if (Sufijo.equalsIgnoreCase(".") == true) {
            Sufijo = "rtrim(d.v_sufijo)";
        } else {
            Sufijo = "'" + Sufijo + "'";
        }

        sql = "Select a.v_codpro,a.v_despro,e.n_stock,a.c_proyectado,b.c_caja,a.n_codcia,a.n_codpro,e.v_procedencia "
            + "from tbc_producto a "
            + "left join tbc_itemsdatatecnica b on (a.v_codpro = b.c_item) "
            + "left join tbc_prefijopro c on (a.n_codprefijo = c.n_codprefijo) "
            + "left join tbc_sufijopro d on (a.n_codsufijo = d.n_codsufijo) "
            + "left join tbc_stock e on (a.n_codpro = e.n_codpro) "
            + "where rtrim(c.v_prefijo) = '" + Prefijo + "' "
            + "and a.v_codpro like '%" + Sufijo + "%' "
            + "and rtrim(d.v_sufijo) = " + SubCod + " "
            + "order by a.v_codpro asc";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaProductoToPedido(String Item) {
        sql = "Select a.v_codpro,a.v_despro,c.n_stock,a.c_proyectado,b.c_caja,a.n_codcia,a.n_codpro,c.v_procedencia "
            + "from tbc_producto a "
            + "left join tbc_itemsdatatecnica b on (a.v_codpro = b.c_item) "
            + "left join tbc_stock c on (a.n_codpro = c.n_codpro) "
            + "where a.v_codpro like '" + Item + "%' "
            + "order by a.v_codpro asc";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaProductoToPedidoEquiv() {
        sql = "Select a.c_item,b.v_despro,d.n_stock,b.c_proyectado,c.c_caja,b.n_codcia, " +
            "b.n_codpro,d.v_procedencia,a.c_codigoequival,a.c_marcacomp " +
            "from tbc_equivalencias a " +
            "inner join tbc_producto b on (a.c_item = b.v_codpro) " +
            "left join tbc_itemsdatatecnica c on (a.c_item = c.c_item) " +
            "left join tbc_stock d on (b.n_codpro = d.n_codpro) ";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaPrefijo(String Cia) {
        int contador = 0;
        sql = "Select count(1) from tbc_compania where n_codcia = " + Cia;
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) contador = c.getInt(0);
        if (!c.isClosed()) c.close();

        if (contador == 0) {
            sql = "Select distinct rtrim(v_prefijo) "
                + "from tbc_prefijopro "
                + "where n_codcia = " + Cia + " "
                + "and n_flgestado = 1 "
                + "order by v_prefijo asc";
        } else {
            sql = "Select distinct rtrim(v_prefijo) "
                + "from tbc_prefijopro "
                + "where n_codcia <> 3 "
                + "and n_flgestado = 1 "
                + "order by v_prefijo asc";
        }
        c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaSufijo(String Cia) {
        int contador = 0;
        sql = "Select count(1) from tbc_compania where n_codcia = " + Cia;
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) contador = c.getInt(0);
        if (!c.isClosed()) {c.close();};

        if (contador == 0) {
            sql = "Select distinct rtrim(v_sufijo) "
                + "from tbc_sufijopro "
                + "where n_codcia = " + Cia + " "
                + "and n_flgestado = 1 "
                + "order by v_sufijo asc";
        } else {
            sql = "Select distinct rtrim(v_sufijo) "
                + "from tbc_sufijopro "
                + "where n_codcia <> 3 "
                + "and n_flgestado = 1 "
                + "order by v_sufijo asc";
        }
        c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaProcedencia() {
        sql = "Select v_procedencia,v_descripcion,v_estado,v_reventa,v_editaprecio "
            + "from tbc_procedencia";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaKitToPedido(String Item, String Limite) {
        sql = "Select c_vehiculo,c_usoprincipal, "
            + "replace(replace(c_filtros,'(',''),')','') as c_filtros "
            + "from tbc_kits "
            + "where c_filtros like '%(" + Item + ")%' "
            + "order by c_vehiculo,c_usoprincipal ";

        if (Limite.length() > 0) {
            sql = sql + "limit " + Limite;
        }
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}