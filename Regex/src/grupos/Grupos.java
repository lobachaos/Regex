package grupos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupos {

	public static void main(String[] args) {
		
		String texto = "O José Simão é muito engraçado... hehehehehehe";
		String regex = "(he)+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
