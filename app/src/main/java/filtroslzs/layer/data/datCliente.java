package filtroslzs.layer.data;
import filtroslzs.layer.entidad.*;
import android.database.Cursor;

public class datCliente {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datCliente(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor ListaCliente(String Vend,String Cia,String Codigo,String Nombre) {
        sql = "Select a.n_codcliente,a.v_razsocial,a.v_direccion,a.v_docfiscal,"
                + "d.c_descripcion as v_segmento,e.c_descripcion as v_tipocategoria,"
                + "c.n_pordescuento * 100 || '%' as n_descuento,a.c_textolsthtml "
                + "from tbc_cliente a "
                + "inner join tbc_cateclientexcia b on (a.n_codcliente = b.n_codcliente) "
                + "inner join tbc_categoria c on (b.n_codcategoria = c.n_codcategoria) "
                + "inner join tbc_segmentocliente d on(b.c_segmento = d.c_segmento) "
                + "inner join tbc_tipocategoriacliente e on(b.c_tipocategoria=e.c_tipocategoria) ";

        if(Vend.length()>0){
            sql = sql + "inner join tbc_clientexvendcia f on (b.n_codcliente = f.n_codcliente "
                    + "and b.n_codcia = f.n_codcia and f.v_codvendedor '" + Vend + "') ";
        }

        sql = sql + "where a.v_codcliente like '%" + Codigo + "%' "
                + "and a.v_razsocial like '%" + Nombre + "%' "
                + "and b.n_codcia = " + Cia + " "
                + "order by a.n_codcliente;";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaClienteRuta(String Vend,String Cia,String Codigo,String Nombre,int Dia) {
        sql = "Select a.n_codcliente,a.v_razsocial,a.v_direccion,a.v_docfiscal," +
                "e.c_descripcion as v_segmento,f.c_descripcion as v_tipocategoria," +
                "d.n_pordescuento * 100 || '%' as n_descuento,a.c_textolsthtml" +
                "from tbc_cliente a " +
                "inner join tbc_cateclientexcia b on (a.n_codcliente = b.n_codcliente) " +
                "inner join tbc_clienteruta c on (a.n_codcliente = c.n_cliente) " +
                "inner join tbc_categoria d on (b.n_codcategoria = d.n_codcategoria) " +
                "left join tbc_segmentocliente e on (b.c_segmento = e.c_segmento) " +
                "left join tbc_tipocategoriacliente f on (b.c_tipocategoria = f.c_tipocategoria) ";

        if(Vend.length()>0){
            sql = sql + "inner join tbc_clientexvendcia g on (b.n_codcliente = g.n_codcliente "
                    + "and b.n_codcia = g.n_codcia and g.v_codvendedor '" + Vend + "') ";
        }

        sql = sql + "where a.v_codcliente like '%" + Codigo + "%' "
                + "and a.v_razsocial like '%" + Nombre + "%' "
                + "and b.n_codcia = " + Cia + " "
                + "and c.n_dia = " + Dia + " "
                + "and c.c_verificado='N' "
                + "order by c.n_orden,a.n_codcliente;";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor VerClienteForm(String Cliente,String Cia) {
        sql = "Select a.n_codcliente,a.v_razsocial,a.v_direccion,a.v_docfiscal,"
                + "d.c_descripcion as v_segmento,b.c_tipocategoria,e.c_descripcion as v_tipocategoria,"
                + "c.n_pordescuento * 100 || '%' as n_descuento,a.c_textoreghtml,"
                + "a.v_agenteretencion,a.v_garante,a.n_cantletras,a.n_porcentajedoc"
                + "from tbc_cliente a "
                + "inner join tbc_cateclientexcia b on (a.n_codcliente = b.n_codcliente) "
                + "inner join tbc_categoria c on (b.n_codcategoria = c.n_codcategoria) "
                + "inner join tbc_segmentocliente d on(b.c_segmento = d.c_segmento) "
                + "inner join tbc_tipocategoriacliente e on(b.c_tipocategoria=e.c_tipocategoria) "
                + "where a.n_codcliente = " + Cliente + " "
                + "and b.n_codcia = " + Cia;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaClienteCombo(String Vend,String Cia) {
        sql = "Select n_codcliente, rtrim(v_razsocial) "
                + "from tbc_cliente "
                + "order by 2 ";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    /*


    public Cursor CategoriaClienteReal(String codigo, String cia) {
        sql = "select b.n_codcategoria " +
                "from tbc_cliente a inner join tbc_cateclientexcia b on a.n_codcliente = b.n_codcliente " +
                "inner join tbc_categoria c on b.n_codcategoria = c.n_codcategoria " +
                "left join tbc_segmentocliente d on b.c_segmento = d.c_segmento " +
                "where a.v_codcliente = '" + codigo + "' " +
                "and b.n_codcia = " + cia;
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor buscarlinea1(String codigo, String cia) {
        sql = "select a.v_codlinea as [Código],b.n_codmoneda as [CodMonOrigen], b.v_simbolo as [SimbMonOrigen], "
                + "a.n_montoasignado as [Aprobado], (a.n_montoasignado-a.n_montoutilizado) as [Disponible], "
                + "b.n_tipocambio as [Tcambio],c.v_simbolo as [SimbMonDestino] "
                + "from tbd_creditoxcliente a inner join tbc_moneda b on a.n_codmoneda = b.n_codmoneda "
                + "left join tbc_moneda c on (a.n_codmoneda <> c.n_codmoneda) "
                + "where a.n_codcliente = " + codigo + " and n_codcia = " + cia;
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor buscarCtaCteTable(String codigo) {
        sql = "select a.v_numdoc as [Num Doc],b.v_simbolo as [Moneda], a.n_montoeudaactual as [Deuda Actual], "
                + "a.d_fecvencimiento as [Fecha Vencimiento], n_diasvencimiento as [Días Vencimiento], "
                + "a.v_codigounico as [Codigo Unico], v_banco as [Banco], c_estado, "
                + "a.v_flagpermitir,a.v_codlinea,c.v_descia,a.v_observacion,a.v_docasociado,a.v_textohtml "
                + "from tbc_moneda b "
                + "inner join tbc_ctactecliente a on b.n_codmoneda = a.n_codmoneda "
                + "inner join TBC_COMPAÑIA c on a.n_codcia = c.n_codcia "
                + "where a.n_codcliente = "
                + codigo
                + " "
                + "order by (case when a.n_diasvencimiento is null then 0 else a.n_diasvencimiento end) asc";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor buscarDireccion(String codigo, String conDefault) {
        sql = "";
        if (conDefault.equals("S")) {
            sql = "select 0 as n_coddirecc, '--NINGUNO--' as v_desdireccion,'N' as v_gps,'' as v_rutapams "
                    + "union all ";
        }

        sql = sql
                + "select n_coddirecc as [Codigo], v_desdireccion [Direccion],v_gps,v_rutapams from tbd_direccionenvio "
                + "where n_codcliente = " + codigo;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor buscarNombre(String codigo) {
        sql = "select v_razsocial from tbc_cliente " + "where n_codcliente ="
                + codigo;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    // Se agregaron para mejoras
    public Cursor buscarNombreCli(String CodigoP) {
        sql = "select razon_social,direccion from mvd_visita "
                + "where n_codvisita = " + CodigoP;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor BuscarDpto() {
        sql = "Select '00' as c_departamentocodigo, '--NINGUNO--' as c_descripcion "
                + "union all "
                + "Select c_departamentocodigo,c_descripcion "
                + "from tbc_departamento "
                + "where c_pais='PER' and c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor BuscarProvincia(String CodDpto) {
        sql = "Select '00' as c_provinciacodigo, '--NINGUNO--' as c_descripcion "
                + "union all "
                + "Select c_provinciacodigo AS Codigo,c_descripcion AS Descripcion "
                + "from tbc_provincia WHERE c_pais='PER' AND "
                + "c_departamentocodigo='" + CodDpto + "' AND c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor BuscarDistrito(String CodDpto, String CodProv) {
        sql = "Select '00' as c_distritocodigo, '--NINGUNO--' as c_descripcion "
                + "union all "
                + "Select c_distritocodigo AS Codigo,c_descripcion AS Descripcion "
                + "from tbc_distrito WHERE c_pais='PER' AND c_departamentocodigo='"
                + CodDpto
                + "' AND c_provinciacodigo='"
                + CodProv
                + "' AND c_estado='A'";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public int ObtenerDirVisita(String Cliente){
        int dir = 0;
        sql = "Select n_direccion from tbc_clienteruta " +
                "where n_cliente = " + Cliente;
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) {
            dir = c.getInt(0);
        }
        if (!c.isClosed()) {c.close();};
        return dir;
    }

    public Cursor buscarDescuentoxClienteSistVenta(String cliente, String cia,
                                                   String sisventa) {
        sql = "select cast(c.n_pordescuento * 100 as integer) || '%' as [Descuento] "
                + "from tbc_cliente a inner join tbc_sistemaventaciaxcliente b on(a.n_codcliente=b.n_codcliente) "
                + "inner join tbc_sistemaventa c on(b.n_codsisventa = c.n_codsisventa) "
                + "where a.n_codcliente = "
                + cliente
                + " and b.n_codcia = "
                + cia + " and b.n_codsisventa = " + sisventa;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public int obtenerDescuentoDefaulxCliente(String cliente, String cia) {
        int categoria = 0;
        sql = "select catcli.n_codcategoria "
                + "from tbc_cateclientexcia catcli inner join tbc_categoria cat on catcli.n_codcategoria = cat.n_codcategoria "
                + "where catcli.n_codcliente = " + cliente
                + " and catcli.n_codcia = " + cia;
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) {
            categoria = c.getInt(0);
        }
        if (!c.isClosed()) {
            c.close();
        }
        ;
        return categoria;
    }

    public double obtenerDescuentoPorcXCliente(String cliente, String cia) {
        double descuento = 0;
        sql = "select cat.n_pordescuento "
                + "from tbc_cateclientexcia catcli inner join tbc_categoria cat on catcli.n_codcategoria = cat.n_codcategoria "
                + "where catcli.n_codcliente = " + cliente
                + " and catcli.n_codcia = " + cia;
        Cursor c = objDat.EjecutaSelect(sql);
        if (c.moveToFirst()) {
            descuento = c.getDouble(0);
        }
        if (!c.isClosed()) {
            c.close();
        }
        ;
        return descuento;
    }

    public Cursor buscarTelefonoxcliente(String codigo) {
        sql = "select 0 as n_cliente, '--NINGUNO--' as c_telefono, '-' as c_clasificatelefono "
                + "union all "
                + "select n_cliente,c_telefono,c_clasificatelefono "
                + "from tbc_clientetelefono "
                + "where n_cliente = "
                + codigo
                + " " + "order by 1,2";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor buscarDescuentoxcliente(String cia, String cliente,
                                          String sisventa) {
        sql = "select a.n_codcia,c.v_descia,cast(d.n_pordescuento*100 as integer)|| '%' ,b.v_dessisventa, "
                + "cast(b.n_pordescuento*100 as integer)|| '%', "
                + "cast(b.n_pordescuentoad*100 as integer)|| '%' "
                + "from tbc_cateclientexcia a, tbc_sistemaventa b, TBC_COMPAÑIA c, tbc_categoria d "
                + "where a.n_codcia = b.n_codcia "
                + "and b.n_codcia = c.n_codcia "
                + "and a.n_codcategoria = d.n_codcategoria "
                + "and a.n_codcia = "
                + cia
                + " "
                + "and a.n_codcliente = "
                + cliente
                + " "
                + "and b.n_codsisventa = "
                + sisventa
                + " "
                + "union all "
                + "select a.n_codcia, e.v_descia,cast(f.n_pordescuento*100 as integer)|| '%' ,b.v_dessisventa, "
                + "cast(b.n_pordescuento*100 as integer)|| '%', "
                + "cast(b.n_pordescuentoad*100 as integer)|| '%' "
                + "from tbc_cateclientexcia a, tbc_sistemaventa b, tbc_compaÑia_rel c, tbc_sistemaventa_rel d, TBC_COMPAÑIA e, tbc_categoria f "
                + "where a.n_codcia = c.n_codcia_rel "
                + "and a.n_codcia = b.n_codcia "
                + "and b.n_codcia = c.n_codcia_rel "
                + "and a.n_codcia = d.n_codcia_rel "
                + "and b.n_codsisventa = d.n_codsisventa_rel "
                + "and a.n_codcategoria = f.n_codcategoria "
                + "and c.n_codcia_rel = e.n_codcia "
                + "and c.n_codcia = "
                + cia
                + " "
                + "and a.n_codcliente = "
                + cliente
                + " "
                + "and d.n_codsisventa = "
                + sisventa
                + " "
                + "order by 1,2 ";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor obtenerPromocionMaraton(String cia, String cliente) {
        sql = "select a.n_codcia,b.v_descia,a.n_cuota,a.n_puntosobt,a.n_puntosdisponibles,a.n_codcliente,a.c_tipopromo,a.c_descripcion "
                + "from tbc_maraton a, TBC_COMPAÑIA b "
                + "where a.n_codcia = b.n_codcia "
                + "and a.n_codcia = "
                + cia
                + " "
                + "and a.n_codcliente = "
                + cliente
                + " "
                + "union all "
                + "select a.n_codcia, c.v_descia,a.n_cuota,a.n_puntosobt,a.n_puntosdisponibles,a.n_codcliente,a.c_tipopromo,a.c_descripcion "
                + "from tbc_maraton a, tbc_compaÑia_rel b, TBC_COMPAÑIA c "
                + "where a.n_codcia = b.n_codcia_rel "
                + "and b.n_codcia = "
                + cia
                + " "
                + "and b.n_codcia_rel = c.n_codcia "
                + "and a.n_codcliente = " + cliente + " " + "order by 1,2";
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
    */

}
