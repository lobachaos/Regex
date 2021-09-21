package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioListaArquivos {

	public static void main(String[] args) {
		String texto = "Lista de arquivos mp3: rock.mp3 , blues.mp3 , jazz.mp3 , podcast.mp3";
		// retornar a quantidade de arquivos que possui a extensão mp3
		String regex = "\\w+\\.mp3";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);
		while (m.find()) {
			System.out.print(m.group() + " ");

		}

	}
}
