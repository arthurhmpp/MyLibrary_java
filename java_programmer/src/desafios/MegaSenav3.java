package desafios;

import java.util.Arrays;

public class MegaSenav3 {
	public static void main(String[] args) {
		int[] jogo = {0,0,0,0,0,0};
		int sorteado = 0, contador = 0;
		
		sorteio:
		do {
			sorteado = (int) (1 + Math.random() * 60);
			for(int i = 0; i < jogo.length; i++) {
				if(jogo[i] == 0) {
					jogo[i] = sorteado;
					contador++;			
					continue sorteio;
				}else if(jogo[i] == sorteado){
					continue sorteio;
				}

			}
		}while(contador < 6);
		
		Arrays.sort(jogo);
		
		for(int n :jogo) {
			System.out.printf("%02d ", n);
		}
		
	}
	
}
