package capitulo04;

public class OutrosComandos {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {
			
			System.out.println("Rodada n�" + i);
			i++;
			if (i == 3) {
				break; // INTERROMPE O LA�O DE REPETI��O
			}
		}

		System.out.println("---------------------------");
		
		int x = 1;
		
		while(x <= 5) {
			if (x == 3) {
				x++;
				continue; // INTERROMPE O LA�O DE REPETI��O
			}
			
			System.out.println("Rodada n�" + x);
			x++;
		}
		
	}
}
