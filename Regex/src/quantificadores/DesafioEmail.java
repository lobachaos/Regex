package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioEmail {
	public static void main(String[] args) {
		
		String texto = "fulanim@gmail.com  123vimto@hotmail.com.br maria_123@yahoo.org.br";
		String regex = "\\w+@\\w+\\.\\w+\\.?+\\w+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
