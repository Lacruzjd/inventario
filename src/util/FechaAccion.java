package util;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaAccion {

    private static Date fecha;

    public static String getFecha() {
        fecha = new Date();
        return new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(fecha);
    }
}
