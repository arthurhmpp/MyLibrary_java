package desafios;

import java.util.Scanner;

/*  quadrados (5 x 5)
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *    
 *  retangulo (5 x 9)
 *  
 *  * * * * * * * * * 
 *  * * * * * * * * *
 *  * * * * * * * * *
 *  * * * * * * * * *
 *  * * * * * * * * *
 *
 * *  retangulo (5 x 9)
 *  
 *  * * * * * * * * * 
 *  *               *
 *  *               *
 *  *               *
 *  * * * * * * * * *
 *
 *  triangulo (5 x 9)
 *  
 *         *
 *       * * *
 *     * * * * *  
 *    * * * * * * * 
 *  * * * * * * * * *
 */

public class FigurasGeometricas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("informe uma opção:");
		System.out.println("1 - quadrado:");
		System.out.println("2 - retangulo:");
		System.out.println("3 - retangulo com vazio:");
		System.out.println("4 - triangulo: ");
		int opcao = sc.nextInt();
		
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			String[][] figura = new String[5][5];
			for(int i = 0; i < figura.length; i++) {
				for(int j = 0 ; j < figura[i].length; j++) {
					figura[i][j] = "* ";
					System.out.print(figura[i][j]);
				}
				System.out.println();
			}
			break;
		case 2:
			String[][] figura1 = new String[5][9];
			for(int i = 0; i < figura1.length; i++) {
				for(int j = 0 ; j < figura1[i].length; j++) {
					figura1[i][j] = "* ";
					System.out.print(figura1[i][j]);
				}
				System.out.println();
			}
			break;
		case 3:
			String[][] figura2 = new String[5][9];
			for(int i = 0; i < figura2.length; i++) {
				for(int j = 0 ; j < figura2[i].length; j++) {
					if (i == 0 || i == figura2.length-1 || j == 0 || j == figura2[i].length-1)
						figura2[i][j] = "*";
					else
						figura2[i][j] = " ";
							
					System.out.print(figura2[i][j]);
				}
				System.out.println();
			}
			break;
		case 4:
			String[][] figura3 = new String[5][9];
			for(int i = 0; i < figura3.length; i++) {
				for(int j = 0 ; j < figura3[i].length; j++) {
					figura3[i][j] = "*";
					System.out.print(figura3[i][j]);
				}
				System.out.println();
			}
			break;
		default:
			break;

		}
		sc.close();
	}
	
	
}
