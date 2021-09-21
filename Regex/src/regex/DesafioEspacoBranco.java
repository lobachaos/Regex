package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioEspacoBranco {
	public static void main(String[] args) {
		String texto = "a     b";

		String regex = "\\w\\s+\\w";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		while (m.find()) {

			System.out.println(m.group());
		}

	}
}
