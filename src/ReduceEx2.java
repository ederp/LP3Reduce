import java.util.Arrays;
import java.util.List;

public class ReduceEx2 {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		System.out.print("Nomes que começam com a letra 'P': ");
		String concatenap = lista.stream()
			.filter(e -> e.startsWith("P"))
			.reduce("",(s1, s2) -> s1.concat(s2));
		System.out.println(concatenap);
		
		System.out.print("Nomes que começam com a letra 'A': ");
		String concatenaa = lista.stream()
			.filter(e -> e.startsWith("A"))
			.reduce("",(s1, s2) -> s1.concat(s2));
		System.out.println(concatenaa);
		
		System.out.print("Lista Inteira: ");
		String concatenatudo = lista.stream()
			.reduce("",(s1, s2) -> s1.concat(s2));
		System.out.println(concatenatudo);
	}

}
