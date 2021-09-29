package grupos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgunsCuidados {
	public static void main(String[] args) {
		
		String texto = "Pedrinho (filho do Pedro Silva) é doutor do ABC!";
		String regex1 = "(?i)[(abc)]"; // nao é um grupo
		String regex2 = "(?i)([abc])";
		String regex3 = "(?i)(abc)";
		
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		Pattern p3 = Pattern.compile(regex3);
		
		Matcher m1 = p1.matcher(texto);
		Matcher m2 = p2.matcher(texto);
		Matcher m3 = p3.matcher(texto);
		
		while(m1.find()) {
			System.out.print(m1.group() + " ");
		}
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
