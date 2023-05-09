package capitulo09.exercicio;

public class Aluno extends Pessoa{
	private float mensalidade;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	@Override
	public void falar(String fala) {
		System.out.println(this.getNome() + ": " + fala);
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("---- Aluno ----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Numero RG: " + this.getRg().getNumero());
		System.out.println("Data de Nascimento: " + this.getRg().getDataNasc());
		System.out.println("Mensalidade: " + this.getMensalidade());
		System.out.println("Curso: " + this.getCurso());		
	}
}
