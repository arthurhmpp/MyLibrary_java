package capitulo04;

import java.util.Scanner;

public class Paises {
	public static void main(String[] args) {
		String pais = null;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um país: ");
		pais = leitor.nextLine().toLowerCase();
		
		switch(pais) {
		case "brasil":
		case "portugal":
			System.out.println("Bom dia!");
			break;
		case "mexico":
		case "argentina":			
		case "espanha":
			System.out.println("Buenos Dias!");
			break;
		case "frança":
			System.out.println("Bon jour!");
			break;
		default:
			System.out.println("Good Morning!");
		}
		
		leitor.close();
	}
}
