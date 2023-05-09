package desafios;

//import java.util.HashSet;
import java.util.TreeSet;

public class MegaSenav4 {
	public static void main(String[] args) {
//		HashSet<Integer> jogo = new HashSet<>();
		TreeSet<Integer> jogo = new TreeSet<>();
		
		while(jogo.size() < 6) {
			jogo.add((int) (1 + Math.random() * 60));
		}
	
		jogo.forEach(n -> System.out.printf("%02d ", n));
		
//		for (Integer n : jogo) {
//			System.out.print(n + " ");
//		}
		
	}
}
