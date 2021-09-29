package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioCPF {
	public static void main(String[] args) {
		
		String texto = "278.000.001-21 , 258.123.123-22";
		String regex = "[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.println(m.group());
		}
				
		
		
	}

}
