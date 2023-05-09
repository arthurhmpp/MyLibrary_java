package capitulo03;

public class AtribuicaoReduzida {
	public static void main(String[] args) {
		int x = 0;
		
		x = 5;
		
		x += 3; // x = x + 3;		
		System.out.println(x);

		x -= 2; // x = x - 2;
		System.out.println(x);
		
		x *= 2; // x = x * 2;
		System.out.println(x);
		
		x /= 2; // x = x / 2;
		System.out.println(x);
		
		x %= 5; // x = x % 5;
		System.out.println(x);
	}
}
