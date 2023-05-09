package capitulo06;

public class ExemploMetodos {
	public void exibirMsg() {
		System.out.println("hello world!!");
	}
	
	public void exibirMsg(String texto) {
		System.out.println("hello world!!" + texto);
	}
	
	public void exibirMsg(char texto, String texto1) {
		System.out.println("hello world!!" + texto);
	}
	
	public int calcula(int v1, int v2) {
		int result = v1 + v2;
		
		return result;
	}
	
	public void listarNome(String[] nomes) {
		System.out.println("imprime nomes");
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}
	
	public void exibirValores(int ... valores) {
		System.out.println("imprime valores");
		for(int valor : valores) {
			System.out.println(valor);
		}
	}
	
	
	
}
