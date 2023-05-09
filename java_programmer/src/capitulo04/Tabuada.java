package capitulo04;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner tabuada = new Scanner(System.in);
		
		System.out.println("informe um numero para calcular: ");
		int valor = tabuada.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " x " + valor + " = " + i*valor);
		}
		
		tabuada.close();
	}
}
