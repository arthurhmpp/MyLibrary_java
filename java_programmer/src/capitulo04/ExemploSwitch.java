package capitulo04;

/* 0 Sistema de cadastro
 * 1 Sistema de edição
 * 2 Sistema de listagem
 * 3 Sistema de exclusao
 * 4 Sair do atendimento
 */

public class ExemploSwitch {
	public static void main(String[] args) {
		int opcao;
		opcao = 3;
		
		switch (opcao) {
		case 0: 
			System.out.println("Sistema de cadastro"); 
			break;
		case 1: 
			System.out.println("Sistema de edição"); 
			break;
		case 2: 
			System.out.println("Sistema de listagem");
			break;
		case 3: 
			System.out.println("Sistema de exclusao");
			break;
		case 4: 
			System.out.println("Sair do atendimento");
			break;
		default: 
			System.out.println("opção invalida");
			break;
		}		
	}
}
