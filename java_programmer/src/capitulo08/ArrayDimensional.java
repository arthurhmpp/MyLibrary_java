package capitulo08;

public class ArrayDimensional {
	public static void main(String[] args) {
		//FORMA CONVENCIONAL
		int x[] = new int[4];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		
		System.out.println("Tamanho do array: " + x.length);
		System.out.println("Primeirp o elemento do array: " + x[0]);
		System.out.println("Ultimo elemento do array: " + x[x.length-1]);
		
		for( int i = 0 ; i < x.length ; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println();
		//UNICA INSTRUCAO		
		int y[] = {50, 60, 70};
		
		System.out.println("Tamanho do array: " + y.length);
		System.out.println("Primeirp o elemento do array: " + y[0]);
		System.out.println("Ultimo elemento do array: " + y[y.length-1]);
		
		for( int i = 0 ; i < y.length ; i++) {
			System.out.println(y[i]);
		}
		
		System.out.println();
		int z[];
		z = new int[] {50, 70, 80, 90};
		
		System.out.println("Tamanho do array: " + z.length);
		System.out.println("Primeirp o elemento do array: " + z[0]);
		System.out.println("Ultimo elemento do array: " + z[z.length-1]);
		
		for( int i = 0 ; i < z.length ; i++) {
			System.out.println(z[i]);
		}		
	}
}
