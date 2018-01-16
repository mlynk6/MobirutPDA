package filtroslzs.layer.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class datCreateDB{
	private final static String DB_PATH = "/data/data/filtroslys.mobirutpda/databases/";
	private final static String DB_NAME = "DBMobirut.sqlite";

	private SQLiteDatabase myDataBase;
	private final Context myContext;

	public datCreateDB(Context context) {
		this.myContext = context;
	}

	public SQLiteDatabase getManager() {
		return myDataBase;
	}

	public void createDataBase() {
		try {
			boolean dbExist = checkDataBase();
			if (dbExist) {
			} else {
				copyDataBase();
			}
		} catch (IOException e) {

			throw new Error("Error copying database");
		}
	}

	private boolean checkDataBase() {

		SQLiteDatabase checkDB = null;
		try {
			String myPath = DB_PATH + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(myPath, null,
					SQLiteDatabase.OPEN_READONLY);

		} catch (SQLiteException e) {
		}

		if (checkDB != null) {
			checkDB.close();
		}
		return checkDB != null ? true : false;
	}

	private void copyDataBase() throws IOException {

		File dir = new File(DB_PATH);
		if (!dir.exists())
			dir.mkdir();

		InputStream myInput = myContext.getAssets().open(DB_NAME);
		String outFileName = DB_PATH + DB_NAME;
		OutputStream myOutput = new FileOutputStream(outFileName);

		byte[] buffer = new byte[1024];
		int length;
		while ((length = myInput.read(buffer)) > 0) {
			myOutput.write(buffer, 0, length);
		}

		myOutput.flush();
		myOutput.close();
		myInput.close();
	}

	public void openDataBase() throws SQLException {
		String myPath = DB_PATH + DB_NAME;
		myDataBase = SQLiteDatabase.openDatabase(myPath, null,
				SQLiteDatabase.OPEN_READWRITE);
	}
}