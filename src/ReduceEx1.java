import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class ReduceEx1 {

	public static void main(String[] args) {
		Random gerador = new Random();
		List<Integer> listaAleatorios = new ArrayList<>();
		//gerando 100 números aleatórios de 1 a 1000
		IntStream.range(0, 99)
		.forEach(e -> listaAleatorios.add(gerador.nextInt(500)));
		
		//Mostre a soma de todos, usando reduce
		Optional<Integer> soma = listaAleatorios.stream()
				.reduce((n1, n2) -> n1 + n2);
		System.out.println("Soma dos números aleatórios igual a "+ soma.get());
		//Mostre a multiplicação de todos, usando reduce
		Optional<Integer> multiplicacao = listaAleatorios.stream()
				.reduce((n1, n2) -> n1 * n2);
		System.out.println("Multiplicação dos números aleatórios igual a "+multiplicacao.get());
		//Mostre o menor número, usando reduce
		Optional<Integer> minimo = listaAleatorios.stream()
				.reduce((d1, d2) -> Math.min(d1, d2));
		System.out.println("Menor valor é igual a "+minimo.get());
		//Mostre o maior número, usando reduce
		Optional<Integer> maximo = listaAleatorios.stream()
				.reduce((d1, d2) -> Math.max(d1, d2));
		System.out.println("Menor valor é igual a "+maximo.get());
	}

}
