package grupos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Retrovisor {

	public static void main(String[] args) {
		
		String texto = "<b>Destaque</b><strong>Forte</strong><div>Conteudo</div>";
		String regex = "<(\\w+)>.*<\\/\\1>";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		String texto2 = "Lentamente é mente muito lenta.";
		String regex2 = "(?i)(lenta)(mente).*\\2.*\\1\\.";
		String regex3 = "(?i)(?:lenta)(mente).*\\1";  // ?: não guarda
		
		Pattern p2 = Pattern.compile(regex2);
		Matcher m2 = p2.matcher(texto2);
		
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(texto2);
		
		while(m2.find()) {
			System.out.println(m2.group());
		}
		
		while(m3.find()) {
			System.out.println(m3.group());
		}
		
	}

}
