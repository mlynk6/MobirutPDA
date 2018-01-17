package filtroslzs.layer.data;
import filtroslzs.layer.entidad.entDataBase;
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

    public Cursor GetClienteForm(String Cliente,String Cia) {
        sql = "Select a.n_codcliente,a.v_razsocial,a.v_direccion,a.v_docfiscal,"
            + "d.c_descripcion as v_segmento,e.c_descripcion as v_tipocategoria,"
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

    public Cursor ListaLineaCredito(String Cliente,String Cia) {
        sql = "Select a.v_codlinea as [Código],b.n_codmoneda as [CodMonOrigen], b.v_simbolo as [SimbMonOrigen], "
            + "a.n_montoasignado as [Aprobado], (a.n_montoasignado-a.n_montoutilizado) as [Disponible], "
            + "b.n_tipocambio as [Tcambio],c.v_simbolo as [SimbMonDestino] "
            + "from tbd_creditoxcliente a "
            + "inner join tbc_moneda b on (a.n_codmoneda = b.n_codmoneda) "
            + "left join tbc_moneda c on (a.n_codmoneda <> c.n_codmoneda) "
            + "where a.n_codcliente = " + Cliente + " "
            + "and n_codcia = " + Cia;
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaCuentaCorriente(String Cliente) {
        sql = "Select a.v_numdoc as [Num Doc],b.v_simbolo as [Moneda], a.n_montoeudaactual as [Deuda Actual], "
            + "a.d_fecvencimiento as [Fecha Vencimiento], n_diasvencimiento as [Días Vencimiento], "
            + "a.v_codigounico as [Codigo Unico], v_banco as [Banco], c_estado, "
            + "a.v_flagpermitir,a.v_codlinea,c.v_descia,a.v_observacion,a.v_docasociado,a.v_textohtml "
            + "from tbc_ctactecliente a "
            + "inner join tbc_moneda b on (a.n_codmoneda = b.n_codmoneda) "
            + "inner join tbc_compania c on (a.n_codcia = c.n_codcia) "
            + "where a.n_codcliente = " + Cliente + " "
            + "order by (case when a.n_diasvencimiento is null then 0 else a.n_diasvencimiento end) asc";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaTelefono(String Cliente) {
        sql = "Select n_cliente,c_telefono,c_clasificatelefono "
            + "from tbc_clientetelefono "
            + "where n_cliente = " + Cliente + " "
            + "order by 1,2";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaDireccion(String Cliente) {
        sql = "Select n_coddirecc,v_desdireccion,v_gps,v_rutapams "
            + "from tbd_direccionenvio "
            + "where n_codcliente = " + Cliente;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaSistemaVenta(String Cliente, String Cia) {
        sql = "Select b.v_dessisventa,a.n_codsisventa,b.v_generarletras,b.c_tiposisventa "
            + "from tbc_sistemaventaciaxcliente a "
            + "inner join tbc_sistemaventa b on (a.n_codsisventa = b.n_codsisventa) "
            + "where b.n_codcia = " + Cia + " "
            + "and b.n_codcliente = " + Cliente + " "
            + "order by b.v_dessisventa asc ";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaDsctoxCiaYSistVta(String Cliente, String Cia, String SistVenta) {
        sql = "Select a.n_codcia,c.v_descia,cast(d.n_pordescuento*100 as integer)|| '%' ,b.v_dessisventa, "
            + "cast(b.n_pordescuento*100 as integer)|| '%', "
            + "cast(b.n_pordescuentoad*100 as integer)|| '%' "
            + "from tbc_cateclientexcia a, tbc_sistemaventa b, tbc_compania c, tbc_categoria d "
            + "where a.n_codcia = b.n_codcia "
            + "and b.n_codcia = c.n_codcia "
            + "and a.n_codcategoria = d.n_codcategoria "
            + "and a.n_codcia = " + Cia + " "
            + "and a.n_codcliente = " + Cliente + " "
            + "and b.n_codsisventa = " + SistVenta + " "
            + "union all "
            + "select a.n_codcia, e.v_descia,cast(f.n_pordescuento*100 as integer)|| '%' ,b.v_dessisventa, "
            + "cast(b.n_pordescuento*100 as integer)|| '%', "
            + "cast(b.n_pordescuentoad*100 as integer)|| '%' "
            + "from tbc_cateclientexcia a, tbc_sistemaventa b, tbc_compania_rel c, tbc_sistemaventa_rel d, tbc_compania e, tbc_categoria f "
            + "where a.n_codcia = c.n_codcia_rel "
            + "and a.n_codcia = b.n_codcia "
            + "and b.n_codcia = c.n_codcia_rel "
            + "and a.n_codcia = d.n_codcia_rel "
            + "and b.n_codsisventa = d.n_codsisventa_rel "
            + "and a.n_codcategoria = f.n_codcategoria "
            + "and c.n_codcia_rel = e.n_codcia "
            + "and c.n_codcia = " + Cia + " "
            + "and a.n_codcliente = " + Cliente + " "
            + "and d.n_codsisventa = " + SistVenta + " "
            + "order by 1,2 ";

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

    public Cursor ListaLineaCredCombo(String Cliente, String Cia) {
        sql = "Select a.v_codlinea,"
            + "(rtrim(a.v_codlinea) || ' ' ||  b.v_desmoneda || ' ' || cast((a.n_montoasignado-a.n_montoutilizado) as numeric(9,2))) "
            + "from tbd_creditoxcliente a "
            + "inner join tbc_moneda b on (a.n_codmoneda = b.n_codmoneda) "
            + "where a.n_codcliente = " + Cliente + " "
            + "and n_codcia = " + Cia;

        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }

}
