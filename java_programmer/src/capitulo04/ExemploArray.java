package capitulo04;

public class ExemploArray {
	public static void main(String[] args) {
		String[] nomes = new String[10];
		
		nomes[0] = "Arthur";
		nomes[1] = "Yuri";
		nomes[2] = "Rosimeire";
		nomes[3] = "Shirley";
		nomes[4] = "Lucas";
		nomes[5] = "Nicolas";
		nomes[6] = "Paulo";
		nomes[7] = "Luciano";
		nomes[8] = "Matheus";
		nomes[9] = "Renan";
		
		System.out.println("primeiro posição do array: " + nomes[0]);
		System.out.println("ultima posição do array: " + nomes[nomes.length-1]);
		System.out.println("Tamanho do array: " + nomes.length);
		
		System.out.println("----------------------- FOR DECLARATIVO");
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("nome na posição " + i + ": " + nomes[i]);
		}
		
		System.out.println("----------------------- FOREACH");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		
	}
}
