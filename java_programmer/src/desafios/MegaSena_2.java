package desafios;

/**
 * GERAR UMA SEGESTAO DE JOGO SIMPLES DA MEGASENA
 *  15 36 37 41 45 59
 *
 */

public class MegaSena_2 {
	public static void main(String[] args) {

		// TODO DEFINIR UM ARRAY DE 6 POSICOES
		int[] jogo = new int[6];
		int sorteado = 0;
		
		// TODO CRIAR UM LA�O PARA PREEMCHER ESTE ARRAY
		for(int i = 0; i < jogo.length; i++) {
			// TODO OS NUMEROS DEVEM SER GERADOS ALEATORIAMENTE
			// TODO OS NUMETOS DEVEM ESTAR ENTRE 1 A 60 INCLUSIVE
			sorteado = (int) (1 + Math.random() * 60);
			jogo[i] = sorteado;
		}
		
		// TODO NAO PODE HAVER NUMEROS DUPLICADOS NO ARRAY
		// TODO IMPRIMIR OS NUMEROS DO ARRAY NA TELA
		for (int i = 0; i < jogo.length; i++) {
			System.out.print(jogo[i] + " ");
		}
	}
}