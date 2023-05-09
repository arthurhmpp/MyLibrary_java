package capitulo05;

public class Cachorro {
	String nome;
	String raca;
	String porte;
	char sexo;
	Pessoa dono;
	
	public void mostrarInformacoes() {
		System.out.println("--Informações TAGDog --");
		System.out.println("-----------------------");
		System.out.println("Sobre o PET: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Porte: " + this.porte);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("\nSobre o Tutor");
		System.out.println("-----------------------");
		System.out.println("Nome: " + this.dono.nome);
		System.out.println("Idase: " + this.dono.idade);
	}
}
