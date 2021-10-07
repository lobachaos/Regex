package receitas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntervaloNumerico {
	public static void main(String[] args) {
		
		String texto = "0 1 10 192 199 201 249 255 256 312 1010 1512";
		String regex = "\\b(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\b";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " // ");
		}
	}
}
