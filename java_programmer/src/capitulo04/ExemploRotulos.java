package capitulo04;

public class ExemploRotulos {
	public static void main(String[] args) {
		int i = 1, j = 1;
		
		principal:
		while(i <= 6) {
			System.out.println("Principal - " + i);
			i++;
			while(j <= 4) {
				System.out.println("\tSecundario - " + j);
				j++;
				if(i ==3 && j ==3)
					break principal;
			}
		j = 1;
		}

		System.out.println("----------------------");
		int x = 1,z = 1 ;
		
		principal1:
		while(x <= 6) {
			System.out.println("Principal - " + x);
			x++;
			while(z <= 4) {
				System.out.println("\tSecundario - " + z);
				z++;
				if(z ==3)
					continue principal1;
			}
		z = 1;
		}
	}
}
