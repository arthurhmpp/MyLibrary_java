package capitulo04.exercicio;

import java.util.Scanner;

public class lab01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- descobrindo numero primo ---");
		System.out.println("informe um numero: ");
		int numero = sc.nextInt();
		int cont = 0;
		
		for(int i = 1 ; i <= numero ; i++) {
			if(numero%i == 0)
				cont++;
			
			// VERIFICA SE PASSOU DE 2 DIVISOES
			if (cont > 2)
				break;
		}
		
		if(cont == 2) {
			System.out.println("o numero " + numero + " é primo");
		}else {
			System.out.println("o numero " + numero + " não é primo");
		}
			
		sc.close();
	}
}
