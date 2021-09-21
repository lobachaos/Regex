package conjuntos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConjuntosNegados {

	public static void main(String[] args) {
		String texto = "1,2,3,a.b c!d?e[f";
		String regex = "\\D";
		String regex2 = "[^0-9]";
		String regex3 = "[^\\d!\\?\\[\\s,\\.]";
		String regex4 = "[^!-/:-@\\s]";
		
		String texto2 = "1: !\"#$%&\\'()*+,-./ 2: :;<=>?@";
		
		Pattern p = Pattern.compile(regex);
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		Pattern p4 = Pattern.compile(regex4);
		
		Matcher m = p.matcher(texto);
		Matcher m2 = p2.matcher(texto);
		Matcher m3 = p3.matcher(texto);
		Matcher m4 = p4.matcher(texto2);
		
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
		System.out.println();
		while(m2.find()) {
			System.out.print(m2.group() + " ");
		}
		System.out.println();
		while(m3.find()) {
			System.out.print(m3.group() + " ");
		}
		
		while(m4.find()) {
			System.out.print(m4.group() + " ");
		}
		
		

	}

}
