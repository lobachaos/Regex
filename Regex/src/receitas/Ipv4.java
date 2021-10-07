package receitas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv4 {
	public static void main(String[] args) {
		
		String texto = "Inválidos:\r\n"
				+ "192.268.0.1\r\n"
				+ "1.333.1.1\r\n"
				+ "192.168.0.256\r\n"
				+ "256.256.256.256\r\n"
				
				+ "Válidos:\r\n"
				+ "192.168.0.1\r\n"
				+ "127.0.0.1\r\n"
				+ "10.0.0.255\r\n"
				+ "10.11.12.0\r\n"
				+ "255.255.255.255\r\n"
				+ "0.0.0.0";

		String borda ="\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";

		Pattern p = Pattern.compile(borda);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " // ");
		}
		
		
	}

}
