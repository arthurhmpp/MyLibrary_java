package capitulo15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppComparator {
	public static void main(String[] args) {
		List<Brinquedo> brinquedos = new ArrayList<>();
		
		brinquedos.add(new Brinquedo("Aquaman", "Senhor das aguas", 15, 39.9));
		brinquedos.add(new Brinquedo("Batman", "Morcego", 16, 399.9));
		brinquedos.add(new Brinquedo("Wolverine Lego", "xpto", 32, 89.9));
		brinquedos.add(new Brinquedo("Mario Lego", "xpto mario", 5, 189.9));
		
		System.out.println("Lista original");
		brinquedos.forEach(System.out::println);
		
		// ORDENANDO DE FORMA NATURAL
		System.out.println();
		Collections.sort(brinquedos);
		
		System.out.println("Lista ordenada");
		brinquedos.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(brinquedos, new Brinquedo());
		
		System.out.println("Lista ordenada - Comparator");
		brinquedos.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(brinquedos, new FilterName());
		
		System.out.println("Lista ordenada - Comparator Name");
		brinquedos.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(brinquedos, new FilterDescricao());
		
		System.out.println("Lista ordenada - Comparator Descricao");
		brinquedos.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(brinquedos, (obj, other) -> obj.getNome().length() - other.getNome().length());
		
		System.out.println("Lista ordenada - Funcional");
		brinquedos.forEach(System.out::println);
	}
}

class FilterName implements Comparator<Brinquedo>{

	@Override
	public int compare(Brinquedo obj, Brinquedo other) {
		return obj.getNome().compareTo(other.getNome());
	}
}