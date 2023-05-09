package capitulo09;

public class Programador extends Funcionario{
	private String linguagem;
	private Computador notebook;
	
	public Programador(String nome, int idade, String linguagem, String modelo, String processador) {
		super(nome, idade);
		this.linguagem = linguagem;
		this.notebook = new Computador(modelo, processador);
	}
	
	public String getLinguagem() {
		return linguagem;
	}
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public Computador getNotebook() {
		return notebook;
	}
	
	public void setNotebook(Computador notebook) {
		this.notebook = notebook;
	}
	
	public String getModeloNotebook() {
		return this.getNotebook().getModelo();
	}
	
	public void mostrarInformacaoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Linguagem: " + this.getLinguagem());
		System.out.println("\n --------------------------- \n");
		System.out.println("Informações do computador:");
		System.out.println("Modelo computador: " + this.notebook.getModelo());
		System.out.println("Processador: " + this.notebook.getProcessador());
	}
	
	public String toString() {
		return super.toString() + "---->" + this.getClass().getSimpleName();
	}

}
