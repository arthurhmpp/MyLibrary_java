package capitulo03;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		int a = 10, b = 7, c = 3;
		
		System.out.printf("a = %d * b = %d => %d", a, b, (a*b));
		System.out.printf("\na = %d / c = %d => %d", a, c, (a/c));
		System.out.printf("\nb = %d + c = %d => %d", b, c, (b+c));
		System.out.printf("\na = %d - c = %d => %d", a, c, (a-c));
		System.out.printf("\na = %d /(float) c = %d => %f", a, c, (a / (float) c));
		System.out.printf("\na = %d %% c = %d => %d", a, c, (a%c));
		
		System.out.println("\nexponenciação de 3^2 = > " + Math.pow(3, 2));
		System.out.println("\nRadiação de 16 // 2 = > " + Math.sqrt(16));
		System.out.println("\nRadiação de 125 // 3 = > " + Math.cbrt(125));
		
	}
}
