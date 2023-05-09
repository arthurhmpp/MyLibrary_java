package capitulo04;

import java.util.Scanner;

public class diasDaSemana {
	public static void main(String[] args) {
		String meseAno = null;
		int ano = 0;
		Scanner input_mes = new Scanner(System.in);
		Scanner input_ano = new Scanner(System.in);
		
		System.out.print("Digite um mês do ano: ");
		meseAno = input_mes.nextLine().toLowerCase();
				
		switch(meseAno) {
		case "fevereiro":
			System.out.print("Informe o ano: ");
			ano = input_ano.nextInt();
			
			if ((ano%4 == 0) && (ano%100 != 0) || (ano%400 == 0))
				System.out.print("tem 29 dias");
			else
				System.out.print("tem 28 dias");
			
			break;
		case "janeiro":
		case "março":
		case "maio":
		case "julho":
		case "agosto":
		case "outubro":
		case "dezembro":
			System.out.print("tem 31 dias!!");
			break;
		case "abril":
		case "junho":
		case "setembro":
		case "novembro":
			System.out.print("tem 30 dias!!");
			break;
		default:
			System.out.print("Meses invalido!!");
		}
		
		input_mes.close();
		input_ano.close();
	}
}
