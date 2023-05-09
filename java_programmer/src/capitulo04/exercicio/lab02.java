package capitulo04.exercicio;

import java.util.Calendar;

public class lab02 {
	public static void main(String[] args) {

		for(int ano = 1930; ano <= Calendar.getInstance().get(Calendar.YEAR); ano+=4) {
			if(ano == 1942 || ano == 1946) {
				continue;
			}
			System.out.println("copa do mundo de " + ano);
		}
		
	}
}
