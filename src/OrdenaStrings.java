import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("joana");
		palavras.add("adriene");
		palavras.add("eduardo Gonzalez");

		Comparator<String> comparator = new ComparadorPorTamanha();
		//Collections.sort(palavras, comparator);
		palavras.sort(comparator);
		System.out.println(palavras);
		
		/*
		 * //para imprimir uma string por linha for (String string : palavras) {
		 * System.out.println(string); }
		 */
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String p) {
		System.out.println(p);
	}
	
}

class ComparadorPorTamanha implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// se o tamanhoda primeira string for menor que a da segunda retorne -1
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;

		return 0;
	}

}