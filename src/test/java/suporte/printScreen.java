package suporte;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class printScreen {
	@SuppressWarnings("unused")
	public static String evidencia() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

	}
}
