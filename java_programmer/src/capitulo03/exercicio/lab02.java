package capitulo03.exercicio;

import java.util.Scanner;

public class lab02 {
	public static void main(String[] args) {
		int valor;
		String resultado = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		valor = sc.nextInt();
		
		resultado = (valor%2 != 0) ? "Numero é impar" : "Numero é par";
		
		System.out.println(resultado);
		
		sc.close();
	}
}
