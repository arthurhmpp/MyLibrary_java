package capitulo04;

public class repeticao01 {
	public static void main(String[] args) {
		// DECLARACAO DE VARIAVEL
		int i = 0;
		
		// DEFINICAO DE CONDICAO PARA CONTROLE DO LADO
		while(i <= 4) {
			System.out.println("Passando dentro do while: " + i);
			i++; // INCREMENTO DE VALOR PARA SAIDA DO LADO
		}
		System.out.println(i);
	}
}
