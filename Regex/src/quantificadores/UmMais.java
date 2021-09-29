package quantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UmMais {
	public static void main(String[] args) {
		String texto = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOOOO!";
		String texto2 = "There is a big fog in NYC";
		
		// + --> Um ou Mais 
		String regex = "(?i)fogo+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		Matcher m2 = p.matcher(texto2);
		
		while(m.find()) {
			System.out.print(m.group() + " " );
		}
		
		System.out.println();
		
		if(m2.find() == false) {
			System.out.println("Nenhum Resultado Encontrado");
		}else {
			System.out.println(m2.group());
		}
		
		String texto3 = "0123456789";
		String regex2 = "\\d"; // tras um por vez
		String regex3 = "\\d+"; // tras todos
		
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		
		Matcher m3 = p2.matcher(texto3);
		Matcher m4 = p3.matcher(texto3);
		
		while(m3.find()) {
			System.out.print(m3.group() + " ");
		}
		System.out.println();
		
		while(m4.find()) {
			System.out.println(m4.group() + " ! ");
		}
		
	}
}
