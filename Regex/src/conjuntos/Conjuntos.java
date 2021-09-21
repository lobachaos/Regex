package conjuntos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Conjuntos {
	public static void main(String[] args) {
		String texto = "1,2,3,4,5,6,a.b c!d?e[f";
		String regex = "[02468]";
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		while (m.find()) {
			System.out.print(m.group() + " " );

		}
		
		String texto2 = "João não vai passear na moto.";
		String regex2 = "n[aã]";
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(texto2);
		
		while(m2.find()) {
			System.out.print("\n" + m2.group() + " ");
		}
		
	}

}
