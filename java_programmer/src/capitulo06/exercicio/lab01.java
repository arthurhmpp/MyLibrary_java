package capitulo06.exercicio;

import capitulo06.Calculadora;

public class lab01 {
	public static void main(String[] args) {
		Calculadora valor = new Calculadora ();
		
		System.out.println("valor.Somar = " + valor.Somar(3, 4));
		System.out.println("valor.Subtrair = " + valor.Subtrair(25, 5));
		System.out.println("valor.Multiplicar = " + valor.Multiplicar(5, 5));
		System.out.println("valor.Dividir = " + valor.Dividir(6, 2));
		
		
	}
}
