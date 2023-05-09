package capitulo15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploObjectList {
	public static void main(String[] args) {
		List<Produto> listProduto = new ArrayList<>();
		
		listProduto.add(new Produto("Pao", 0.4, "Massa", true));
		listProduto.add(new Produto("Manga", 14.0, "Fruta", true));
		listProduto.add(new Produto("Milkshare", 13.9, "Doce", false));
		
		listProduto.forEach((p) -> System.out.println(p.getNome() + " | " + 
													  p.getCategoria() + " | "+ 
													  p.getPreco()));
		
		System.out.println();
		
		listProduto.forEach((p) -> p.detalharProduto());
		
		System.out.println("Lista ordenada");
		Collections.sort(listProduto);
//		Collections.sort(listProduto, (p) -> {return 0});
		listProduto.forEach((p) -> p.detalharProduto());
		
		listProduto.removeIf(p -> p.getNome().equals("Pao"));
		
		
		//---------------------------------------------------//
		
		Set<Produto> setProduto = new TreeSet<>();
		setProduto.add(new Produto("Pao", 0.4, "Massa", true));
		setProduto.add(new Produto("Manga", 1.0, "Fruta", true));
		setProduto.add(new Produto("Milkshare", 13.9, "Doce", false));
		
		setProduto.forEach(System.out::println);
		
		//---------------------------------------------------//
		System.out.println();
		
		Map<String, Produto> mapProduto = new TreeMap<>();
		mapProduto.put("Pao", new Produto("Pao", 0.4, "Massa", true));
		mapProduto.put("Manga", new Produto("Manga", 1.0, "Fruta", true));
		mapProduto.put("Milkshare", new Produto("Milkshare", 13.9, "Doce", false));
		
		mapProduto.forEach((k, p)-> System.out.println(p.getNome() + " - " + p.getCategoria()));;
	}
}
