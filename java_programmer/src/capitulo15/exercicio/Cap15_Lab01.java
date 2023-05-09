package capitulo15.exercicio;

import java.util.Map;
import java.util.TreeMap;

public class Cap15_Lab01 {
	public static void main(String[] args) {
		Map<String, Integer> pessoaMap = new TreeMap<>();
		
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);
	
		System.out.println("---- pessoas ---- opção 1");
		System.out.println("Roberto: " + pessoaMap.get("Roberto"));
		System.out.println("Carla: " + pessoaMap.get("Carla"));
		System.out.println("Gabriel: " + pessoaMap.get("Gabriel"));
		System.out.println("Bruna: " + pessoaMap.get("Bruna"));
		System.out.println();
		System.out.println("---- pessoas ---- opção 2");
		pessoaMap.forEach((k,v) -> System.out.println(k + ": " + v));
	}
}
