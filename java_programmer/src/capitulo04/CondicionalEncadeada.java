package capitulo04;

/* 0 Sistema de cadastro
 * 1 Sistema de edi��o
 * 2 Sistema de listagem
 * 3 Sistema de exclusao
 * 4 Sair do atendimento
 */
public class CondicionalEncadeada {
	public static void main(String[] args) {
		int opcao;
		opcao = 30;
		
		if (opcao == 0) {
			System.out.println("Sistema de cadastro");
		} else if(opcao == 1){
			System.out.println("Sistema de edi��o");
		}else if(opcao == 2){
			System.out.println("Sistema de listagem");
		}else if (opcao == 3){
			System.out.println("Sistema de exclusao");
		}else if (opcao == 4) {
			System.out.println("Sair do atendimento");
		}else {
			System.out.println("op��o invalida");
		}
	}
}
