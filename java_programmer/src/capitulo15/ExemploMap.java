package capitulo15;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
// PARAMETRIZAR UM RAPER, POIS O MAP ESPERA UM OBJ E NAO UMA TIPO DE VARIAVEL
		Map<String, Double> listaCompras = new HashMap<>();
		
		listaCompras.put("Pao", 0.40);
		listaCompras.put("Manga", 1.0);
		listaCompras.put("SmartWatch", 130.0);
		listaCompras.put("Milkshake", 13.9);
		
		System.out.println(listaCompras.size());
		System.out.println(listaCompras.containsKey("Pao"));
		System.out.println(listaCompras.containsValue(13.9));
		System.out.println(listaCompras.get("Pao"));
		listaCompras.forEach((k,v) -> System.out.println(k + ": " + v));
//      NAO FUNCIONA PELO FATO DELE SER BICONSUNER
//		listaCompras.forEach(System.out::println);
	}
}
