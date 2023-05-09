package desafios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * GERAR UMA SEGESTAO DE JOGO SIMPLES DA MEGASENA
 *  15 36 37 41 45 59
 *
 */

public class MegaSena {
	public static void main(String[] args) {
		// TODO DEFINIR UM ARRAY DE 6 POSICOES
		// TODO CRIAR UM LAï¿½O PARA PREEMCHER ESTE ARRAY
		// TODO OS NUMEROS DEVEM SER GERADOS ALEATORIAMENTE
		// TODO OS NUMETOS DEVEM ESTAR ENTRE 1 A 60 INCLUSIVE
		// TODO NAO PODE HAVER NUMEROS DUPLICADOS NO ARRAY
		// TODO IMPRIMIR OS NUMEROS DO ARRAY NA TELA
		
        Random random = new Random();
//        int aux = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Defina o intervalo de numero? ");
        int intervalo = sc.nextInt();
        
        System.out.println("Quantos numeros serão gerados? ");
        int qtdeNumeros = sc.nextInt();
        
        int[] numero = new int[qtdeNumeros];
        
        System.out.println("Quantos jogos de " + qtdeNumeros + " numeros serão gerados? ");
        int qtdJogos = sc.nextInt();
 
        
        for(int i = 1; i <= qtdJogos; i++) {
	        for (int j=0; j < numero.length; j++) {
	        	numero[j] = random.nextInt(intervalo)+1;
	        	for (int l = 0; l < j ; l++) {
	        		if(numero[j]==numero[l]) {
	        			j--;
	        		}
	        	}
	        }

	        Arrays.sort(numero);
	        
//	        for (int j=0; j < numero.length; j++) {
//	        	for (int l=0; l < numero.length; l++) {
//	        		if(numero[j] < numero[l]) {
//	        			aux = numero[j];
//	        			numero[j] = numero[l];
//	        			numero[l] = aux;
// 		       		}
//	        	}
//	        }
	        
	        System.out.printf("jogo - %02d | ", i); 
	        for (int j=0; j < numero.length; j++) {
	             System.out.printf("%02d ", numero[j]); 
	        }
	        
	        System.out.println(); 
        }
        sc.close();
	}
}
