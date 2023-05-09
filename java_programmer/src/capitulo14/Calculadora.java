package capitulo14;

public class Calculadora  implements OperacaoAritmetica {
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int dividir(int a, int b) {
		return a / b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}

	@Override
	public int execute(int a, int b) {
		return 15;
	}
}