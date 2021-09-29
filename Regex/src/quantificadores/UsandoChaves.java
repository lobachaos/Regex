package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsandoChaves {
	public static void main(String[] args) {
		
		String texto = "O João recebeu 120 milhões apostando 6 9 21 23 45 46.";
		String regex = "\\d{1,2}";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
		
		String regex2 = "\\d{2}";
		String regex3 = "\\d{1,}";
		
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		Matcher m2 = p2.matcher(texto);
		Matcher m3 = p3.matcher(texto);
		
		System.out.println();
		while(m2.find()) {
			System.out.print(m2.group() + " ");
		}
		
		System.out.println();
		while(m3.find()) {
			System.out.print(m3.group() + " ");
		}
		
		
	}
}
