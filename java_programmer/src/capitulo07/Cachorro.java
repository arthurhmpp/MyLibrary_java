package capitulo07;

public class Cachorro {
	String nome;
	int idade;
	String porte;
	
	public Cachorro() {
		super();
	}
	public Cachorro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void latir() {
		System.out.println("Au au au!!!");
	}
	
	@Override
	public String toString() {
		return "Cachorro - " + super.toString();
	}
}
