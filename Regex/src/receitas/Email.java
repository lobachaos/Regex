package receitas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		
		String texto = "Os e-mails dos convidados são:\r\n"
				+ "    - fulano@cod3r.com.br\r\n"
				+ "    - xico@gmail.com\r\n"
				+ "    - joao@empresa.info.br\r\n"
				+ "    - maria_silva@registro.br\r\n"
				+ "    - rafa.sampaio@yahoo.com\r\n"
				+ "    - fulano+de+tal@escola.ninja.br";
		
		
		String regex = "\\S+@\\w+\\.\\w{2,6}(\\.\\w{2})?";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	}
}
