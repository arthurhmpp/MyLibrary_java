package capitulo03;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 7;
		
		System.out.println("Dada as variaveis");
		System.out.println("a = " + a + " | b = " + b + " | c = " + c);
		
		// MAIOR QUE
		System.out.println("a > b => " + (a > b));
		// MANOR QUE
		System.out.println("b < a => " + (b < a));
		// MAIOR IGUAL QUE
		System.out.println("c >= (a + b) => " + (c >= (b + a)));
		// MENOR IGUAL QUE
		System.out.println("c <= (a + b) => " + (c <= (b + a)));
		// IGUAL A
		System.out.println("a == (c + 3) => " + (a == (c + 3)));
		// DIFERENTE DE
		System.out.println("c != a => " + (c != a));
	
	}
}
