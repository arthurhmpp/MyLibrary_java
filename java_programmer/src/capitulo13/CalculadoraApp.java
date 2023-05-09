package capitulo13;

public class CalculadoraApp {
	public static void main(String[] arga) {
		Calculadora c = new Calculadora();
		
		System.out.println(c.multiplicar(4, 4));
		System.out.println(c.multiplicar(2, 10));
		System.out.println(c.multiplicar(3, -4));
		System.out.println(c.multiplicar(-9, 8));
		System.out.println(c.multiplicar(-4, 10));
		System.out.println(c.multiplicar(9, 2));
		
	}
}
