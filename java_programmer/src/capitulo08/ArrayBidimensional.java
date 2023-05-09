package capitulo08;

public class ArrayBidimensional {
	public static void main(String[] args) {
		//UNICA INSTRUCAO		
		int y[][] = {{10, 20, 30}, {50, 60}, {70, 40, 80, 90}};
		
		for( int i = 0 ; i < y.length ; i++) {
			System.out.println("Tamanho do array: " + y[i].length);
			System.out.println("Primeirp o elemento do array: " + y[i][0]);
			System.out.println("Ultimo elemento do array: " + y[i][y[i].length-1]);
			for( int j = 0 ; j < y[i].length ; j++) {
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
