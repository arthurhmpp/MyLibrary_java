package capitulo04;

public class VariavelIndexada {
	public static void main(String[] args) {
		int[] y = new int[6];
		int index = 4;
				
		
		y[0] = 10;
		y[3] = 7;
		y[index] = 9;
		
		System.out.println(" tamanho do array y: " + y.length);
		System.out.println(y[2-2]);
		System.out.println(y[3]);
		System.out.println(y[index]);
		
		System.out.println("---------------------");
		System.out.println("Imprimindo no for");
		for(int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}
}
