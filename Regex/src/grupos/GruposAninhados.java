package grupos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GruposAninhados {

	public static void main(String[] args) {
		
		String texto = "supermercado hipermercado minimercado mercado";
		String regex = "(?i)(super|hiper|mini)?mercado";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
		
		String grupoAninhado = "((hi|su)per|mini)?mercado";
		Pattern p2 = Pattern.compile(grupoAninhado);
		Matcher m2 = p2.matcher(texto);
		
		System.out.println();
		while(m2.find()) {
			System.out.print(m2.group() + " ");
		}
	}

}
