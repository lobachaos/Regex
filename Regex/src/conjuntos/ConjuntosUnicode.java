package conjuntos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConjuntosUnicode {

	public static void main(String[] args) {
		String texto = "����� ����� ����� � �� �";
		String regex = "[�-�]";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while (m.find()) {
			System.out.print(m.group() + " ");
		}
	}

}
