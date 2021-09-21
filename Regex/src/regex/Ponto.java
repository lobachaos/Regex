package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ponto {
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,7,8,9";

		String regex = "1.2";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		m.find();
		System.out.println(m.group());

		String regex2 = "1..,";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(texto);
		m2.find();
		System.out.println(m2.group());

	}

}
