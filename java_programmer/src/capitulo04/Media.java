package capitulo04;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		float val1,val2,val3,val4, media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- calculando a media de 4 notas ---");
		System.out.println("informe a primeira nota: ");
		val1 = sc.nextFloat();
		System.out.println("informe a segunda nota: ");
		val2 = sc.nextFloat();
		System.out.println("informe a terneira nota: ");
		val3 = sc.nextFloat();
		System.out.println("informe a quarta nota: ");
		val4 = sc.nextFloat();		
		
		media = (val1+val2+val3+val4)/4;
		
		System.out.print(media >= 6.5 ? "o aluno foi aprovado -  " : "o aluno foi reprovado - ");

//		if (media >= 6.5)
//			System.out.print("o aluno foi aprovado -  ");
//		else 
//			System.out.print("o aluno foi reprovado - ");
		
		System.out.print(media);
		
		sc.close();
	}
}
