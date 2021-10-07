package receitas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telefone {
	public static void main(String[] args) {
		
		String texto = "Lista telefônica:\r\n"
				+ "    - (21) 12345-6789\r\n"
				+ "    - (11) 62300-2234\r\n"
				+ "    - 5678-7771\r\n"
				+ "    - (85)3333-7890\r\n"
				+ "    - (1) 4321-1234";
		
		String regex = "(\\(\\d+\\)\\s?)?\\d+-\\d+"; 
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.print(m.group() + " // ");
		}
		
		
		
	}
}
