package capitulo14;

public class CalculadoraApp {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		System.out.println(c.somar(10, 5));
		System.out.println(c.subtrair(10, 5));
		System.out.println(c.dividir(10, 5));
		System.out.println(c.multiplicar(10, 5));
		System.out.println(c.execute(10, 5));
		
//		CHAMADA DE RECURSO FUNCIONAL
		
		OperacaoAritmetica op = new OperacaoAritmetica() {
			
			@Override
			public int execute(int a, int b) {
				return a + b;
			}
		};
		System.out.println(op.execute(10, 35))			;
		
		OperacaoAritmetica sum = (a, b) -> a + b;
		System.out.println(sum.execute(11, 12));
		
	}
}