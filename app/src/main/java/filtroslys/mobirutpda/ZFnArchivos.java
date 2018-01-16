package filtroslys.mobirutpda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import filtroslys.mobirutpda.appglobal;
import android.content.Context;
import android.os.Environment;

public class ZFnArchivos {
	static appglobal app;

	public static void configServicio(Context context) {
		app = ((appglobal) context);
		String linea;

		CrearArchivoConf(context);

		File tarjeta = Environment.getExternalStorageDirectory();
		File file = new File(tarjeta.getAbsolutePath() + app.getRutaConf(),
				app.getArchivoConf());

		try {
			FileInputStream fIn = new FileInputStream(file);
			InputStreamReader archivo = new InputStreamReader(fIn);
			BufferedReader br = new BufferedReader(archivo);

			// Leer 1 Linea de Ip
			linea = br.readLine();
			if (linea != null)
				app.setSoapIp(linea);

			// Leer 2 Linea de Puerto
			linea = br.readLine();
			if (linea != null)
				app.setSoapPuerto(linea);
			
			// Leer 3 Linea de Si es o no Industrial
			linea = br.readLine();
			if (linea != null){
				if(linea.length()>0)
					app.setEsIndustrial(linea);
				else
					app.setEsIndustrial("N");
			}

			br.close();
			archivo.close();

			app.setSoapUrl("http://" + app.getSoapIp() + ":"
					+ app.getSoapPuerto() + "/" + app.getSoapNombreWeb()
					+ "/services/ObtenerDatosSOAP");

		} catch (IOException e) {
		}
	}

	public static String recuperarImagen(Context context, String rutafoto,
			String nombre) {
		app = ((appglobal) context);
		File tarjeta = Environment.getExternalStorageDirectory();
		File file = new File(tarjeta.getAbsolutePath() + app.getRutaCatalogo()
				+ rutafoto, nombre);
		String ruta = "";
		try {

			if (file.exists())
				ruta = file.getAbsolutePath();
		} catch (Exception e) {
		}
		return ruta;
	}

	private static void CrearArchivoConf(Context context) {
		app = ((appglobal) context);
		String rutacarpeta, filebuscado;

		File tarjeta = Environment.getExternalStorageDirectory();
		rutacarpeta = tarjeta.getAbsolutePath() + app.getRutaConf();
		filebuscado = rutacarpeta + File.separator + app.getArchivoConf();

		try {
			File f = new File(filebuscado);
			if (!f.exists()) {
				f = new File(rutacarpeta);
				if (f.list() == null)
					f.mkdirs();

				// SE VA CREAR ARCHIVO
				f = new File(filebuscado);
				f.createNewFile();

				FileOutputStream Fout = new FileOutputStream(f);
				OutputStreamWriter Osw = new OutputStreamWriter(Fout);

				Osw.append(app.getSoapIp());
				Osw.append("\r\n");
				Osw.append(app.getSoapPuerto());
				Osw.append("\r\n");
				Osw.append(app.getEsIndustrial());
				Osw.flush();
				Osw.close();

				Fout.close();
			}
			f = null;
		} catch (IOException e) {
		}
	}

	public static String CrearArchivoCotizacion(Context context,
			String archivo, String texto) {
		app = ((appglobal) context);
		String rutacarpeta, filebuscado, archivogen = "";

		File tarjeta = Environment.getExternalStorageDirectory();
		rutacarpeta = tarjeta.getAbsolutePath() + app.getRutaCotizaciones();
		filebuscado = rutacarpeta + File.separator + archivo;

		try {
			File f = new File(filebuscado);
			if (f.exists()) {
				f.delete();
			}

			f = new File(rutacarpeta);
			if (f.list() == null) {
				f.mkdirs();
			}

			// SE VA CREAR ARCHIVO
			f = new File(filebuscado);
			f.createNewFile();

			FileOutputStream Fout = new FileOutputStream(f);
			OutputStreamWriter Osw = new OutputStreamWriter(Fout);

			Osw.append(texto);
			Osw.flush();
			Osw.close();

			Fout.close();

			f = null;
			archivogen = filebuscado;
		} catch (IOException e) {
		}
		return archivogen;
	}	
}