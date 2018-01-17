package filtroslzs.layer.negocio;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class negZConst {
    public static int ComboDefCodEnt = -1;
    public static String ComboDefCodStr = "**";

    public static Date getFecha(String fecha) {
        Date date = null;
        if(fecha==null) return date;
        SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = dfm.parse(fecha);
        } catch (ParseException e) {
            throw new Error("Error al convertir String a Datetime");
        }
        return date;
    }
}
