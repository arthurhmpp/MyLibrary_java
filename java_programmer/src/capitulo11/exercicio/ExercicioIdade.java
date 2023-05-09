package capitulo11.exercicio;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informar um ano: ");
		
		try {
			int ano_num = Integer.parseInt(ler.nextLine());	
			int resultado =  Calendar.getInstance().get(Calendar.YEAR) - ano_num;
			System.out.println(resultado);
		} catch (NumberFormatException e) {
			System.out.println("VALOR INFORMADO CONTEM LETRA"); 
		}		

		ler.close();
		
	}	
}
