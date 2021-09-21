package conjuntos;

import java.util.regex.*;

public class CuidadosComIntervalo {

	public static void main(String[] args) {
		
		String texto = "ABC [abc] a-c 1234";
		String regex = "[a-c]";
		String regex2 = "a-c"; // nao define um range
		String regex3 = "[A-z]";// intervalos usam a ordem da tabela UNICODE , entre A-z existem simbolos
		//  tem que respeitar a ordem da tabela UNICODE caso contrário trará erro !
		
		Pattern p = Pattern.compile(regex);
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		
		Matcher m = p.matcher(texto);
		Matcher m2 = p2.matcher(texto);
		Matcher m3 = p3.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
		System.out.println();
		while(m2.find()) {
			System.out.print(m2.group()+ " ");
		}
		System.out.println();
		while(m3.find()) {
			System.out.print(m3.group()+ " ");
		}
			
	}

}
