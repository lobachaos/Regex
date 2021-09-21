package conjuntos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shorthands {

	public static void main(String[] args) {
		
		String texto = "abcsdkepokrw1!*&234567890.,;^  \t";
		String regex = "\\d"; // busca todos os digitos
		String regex2 = "\\D"; // busca tudo que não é digito 
		String regex3 = "\\w"; // busca letras maiusculas e minisculas , todos os digitos e o underline
		String regex4 = "\\W"; // negacao do w
		String regex5 = "\\s"; // busca espaços em brancos , inclusive (\t,\n,\r,f)
		
		
		Pattern p = Pattern.compile(regex);
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		Pattern p4 = Pattern.compile(regex4);
		Pattern p5 = Pattern.compile(regex5);
		
		Matcher m = p.matcher(texto);
		Matcher m2 = p2.matcher(texto);
		Matcher m3 = p3.matcher(texto);
		Matcher m4 = p4.matcher(texto);
		Matcher m5 = p5.matcher(texto);
		
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
		System.out.println();
		while(m4.find()) {
			System.out.print(m4.group() + " ");
		}
		System.out.println();
		while(m5.find()) {
			System.out.print(m5.group() + " ");
		}
		
	}

}
