package capitulo03;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int a = 10,  b = 5; 
		boolean teste = true;
		
		System.out.println("Dadas as variareis");
		System.out.println("a = " + a + " | b = " + b + " | teste = " + teste);
		System.out.println();
		
		// EXPRESSAO
		System.out.println("(a > b) && (b + 2 == a) --> " + ((a > b) && (b + 2 == a)));
		System.out.println("(a > b) || (b + 2 != a) --> " + ((a > b) || (b + 2 != a)));
		System.out.println("(a > b) ^ (b + 2 == a) --> " + ((a > b) ^ (b + 2 == a)));
		System.out.println("!teste --> " + !teste);
		
	}
}
