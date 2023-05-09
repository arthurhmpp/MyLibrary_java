package capitulo03;

import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, resultado;
		
		
		System.out.print("Digite um numero: "); 
		valor1 = sc.nextInt();
		System.out.print("Digite outro numero: "); 
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		System.out.println("Resultado é: " + resultado);
		
		sc.close();
	}
}
