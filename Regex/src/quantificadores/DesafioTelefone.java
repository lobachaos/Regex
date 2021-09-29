package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioTelefone {
	public static void main(String[] args) {
		
		String texto = "(11)9999-9999 , 1234-5678 , (11) 9999-9759";
		String regex = "\\(?([0-9]+)\\)?\\s?[0-9]+-[0-9]+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
