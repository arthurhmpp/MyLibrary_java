package capitulo11.exercicio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		String frase = ler.nextLine();  
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("C:\\Users\\noturno\\Documents\\doc1.txt");
			writer.println(frase);	
			System.out.println("Arquivo gravado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer != null)
				writer.close();
			ler.close();
		}
	}
}
