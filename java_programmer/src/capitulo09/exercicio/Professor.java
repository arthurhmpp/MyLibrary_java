package capitulo09.exercicio;

public class Professor extends Pessoa{
	private float salario;
	private String disciplina;	
	
	public Professor(String nome, int idade,char sexo, int numeroRG, String dataNasc, float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void falar(String fala) {
		System.out.println(this.getNome() + ": " + fala);
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("---- Professor ----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Numero RG: " + this.getRg().getNumero());
		System.out.println("Data de Nascimento: " + this.getRg().getDataNasc());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Disciplina: " + this.getDisciplina());		
	}
	
}
