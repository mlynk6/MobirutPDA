package filtroslzs.layer.data;
import filtroslzs.layer.entidad.*;
import android.database.Cursor;

public class datCreditoxCliente {
    private datUtilDB objDat;
    private entDataBase entDB;
    private String sql = "";

    public datCreditoxCliente(entDataBase entDB) {
        this.entDB = entDB;
        objDat = new datUtilDB(this.entDB);
    }

    public Cursor buscarlinea(String codigo, String cia) {
        sql = "select a.v_codlinea as [Código],b.n_codmoneda as [CodMonOrigen], b.v_simbolo as [SimbMonOrigen], "
                + "a.n_montoasignado as [Aprobado], (a.n_montoasignado-a.n_montoutilizado) as [Disponible], "
                + "b.n_tipocambio as [Tcambio],c.v_simbolo as [SimbMonDestino] "
                + "from tbd_creditoxcliente a inner join tbc_moneda b on a.n_codmoneda = b.n_codmoneda "
                + "left join tbc_moneda c on (a.n_codmoneda <> c.n_codmoneda) "
                + "where a.n_codcliente = " + codigo + " and n_codcia = " + cia;
        Cursor c = objDat.EjecutaSelect(sql);
        return c;
    }
}
