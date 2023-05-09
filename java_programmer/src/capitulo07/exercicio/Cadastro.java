package capitulo07.exercicio;

public class Cadastro {
	String nome;
	String sobrenome;
	int idade;
	
	public Cadastro(){
		super();
	}
	
	public Cadastro(String nome, String sobrenome){
		this(nome, sobrenome, 0);
	}
	
	public Cadastro(String nome, String sobrenome, int idade){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Idade: " + this.idade);
		
	}
	
	
}
