package capitulo06;

public class ExemploStatic {
	String text;
	static int number;

	public String emitirApresentacao() {
		return "Ola, metodo comum!";
	}
	
	public static String emitirApresentacaoStatic() {
		int n = number;
		return "Ola, metodo estatico!";
	}
	
	@Override
	public String toString() {
		return "Classe de teste";
	}
}
