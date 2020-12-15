package string;

public class MinhasFuncoes {

	public static Object rep(String string, int qtd) {

		String repeticao = "";
		for (int i = 0; i < qtd; i++) {
			repeticao = repeticao + string;
		}
		return repeticao;
	}

	public static Object substituir(String string, char c, char d) {

		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				newString = newString + d;
			} else {
				newString = newString + string.charAt(i);
			}
		}
		return newString;
	}

	public static boolean contem(String string, char c) {

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}

		if (count > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean contem(String string, String string2) {

		if (string.contains(string2)) {
			return true;
		} else {
			return false;
		}
	}

	public static int contador(String string, char c) {

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

	public static int contador(Object rep, String sub) {

		int count = 0, indice = 0;
		String repS = rep.toString();

		if (isEmpty(repS) || isEmpty(sub)) {
			return 0;
		}

		while ((indice = repS.indexOf(sub, indice)) != -1) {
			count++;
			indice += sub.length();
		}
		return count;
	}

	public static Object subString(String string, int i, int j) {

		String palavra = string.substring(i, j);
		return palavra;
	}

	public static Object concatenar(String[] palavras) {

		StringBuilder builder = new StringBuilder();

		for (String palavra : palavras) {

			palavra = palavra.toLowerCase();
			String s1 = palavra.substring(0, 1).toUpperCase();
			String s2 = s1 + palavra.substring(1);

			builder.append(s2 + " ");
		}
		String builderS = builder.toString();
		return builderS;
	}

	public static Object concatenar(String[] palavras, char c) {

		StringBuilder builder = new StringBuilder();

		for (String palavra : palavras) {

			palavra = palavra.toLowerCase();
			String s1 = palavra.substring(0, 1).toUpperCase();
			String s2 = s1 + palavra.substring(1);

			builder.append(s2 + c);
		}
		String builderS = builder.toString();
		return builderS;
	}

	public static Object primeiraLetraMaiuscula(String palavra) {

		String palavras[];
		String palavras2[];
		palavras = palavra.split(" ");
		String s2 ="";
		StringBuilder builder = new StringBuilder();

		for (String p : palavras) {
			p = p.toLowerCase();
			String s1 = p.substring(0, 1).toUpperCase();
			s2 = s1 + p.substring(1);
			builder.append(s2+" ");	
		}
		
		String builderS = builder.toString();
		return builderS;


	}

}
