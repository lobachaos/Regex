package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wub {
	public static void main(String[] args) {
		String teste = "WUBIWUBWUBAMWUBWUBWUBX";
		String wub = "WUB";
		Pattern p = Pattern.compile(wub);
		Matcher m = p.matcher(teste);
		m.find();
		System.out.println("Primeira tentativa --> " + m.replaceAll(" ").trim());

		String a = "Qualquer Coisa WUBWUBIWUBAM";
		System.out.println(a.replaceAll("[wub]", " "));
		System.out.println(a.replaceAll("WUB", " "));
	}
}
