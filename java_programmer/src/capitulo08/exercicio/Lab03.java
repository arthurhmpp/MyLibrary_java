package capitulo08.exercicio;

import java.util.Scanner;

public class Lab03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
//		int num = read.nextInt() % 10;
//		String numTxt = String.valueOf(read.nextInt());
		String x = Integer.toString(read.nextInt());
		
		
//		System.out.println(numTxt);
//		System.out.println(numTxt.charAt(numTxt.length()-1));
		System.out.println(x);
		
		read.close();
	}
}
