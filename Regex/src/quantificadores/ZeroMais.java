package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroMais {
	public static void main(String[] args) {

		String texto = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
		String texto2 = "There is a big fog in NYC";

		// * --> Zero ou Mais
		String regex = "(?i)fogo*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		Matcher m2 = p.matcher(texto2);

		while (m.find()) {
			System.out.print(m.group() + " ");
		}

		System.out.println();

		while (m2.find()) {
			System.out.println(m2.group());
		}
	}

}
