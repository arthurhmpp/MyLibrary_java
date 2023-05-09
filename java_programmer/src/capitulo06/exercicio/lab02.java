package capitulo06.exercicio;

import capitulo06.Calculadora;

public class lab02 {
	public static void main(String[] args) {
		Calculadora valor = new Calculadora();
		
		System.out.println("valor.Subtrair = " + valor.Subtrair(3, 4));
		System.out.println("valor.Subtrair = " + valor.Subtrair(25.4, 5.8));
		System.out.println("valor.Subtrair = " + valor.Subtrair(5, 5.9));
		System.out.println("valor.Subtrair = " + valor.Subtrair(6.8, 2));
		
		
	}
}
