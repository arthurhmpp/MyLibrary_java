package capitulo04;

public class OutrosComandos {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {
			
			System.out.println("Rodada nº" + i);
			i++;
			if (i == 3) {
				break; // INTERROMPE O LAÇO DE REPETIÇÃO
			}
		}

		System.out.println("---------------------------");
		
		int x = 1;
		
		while(x <= 5) {
			if (x == 3) {
				x++;
				continue; // INTERROMPE O LAÇO DE REPETIÇÃO
			}
			
			System.out.println("Rodada nº" + x);
			x++;
		}
		
	}
}
