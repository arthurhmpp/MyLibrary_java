package capitulo06.exercicio;

public class lab03 {
	public static void main(String[] args) {
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();
		
		joao.setNome("Joao");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("Contador do objeto: " + joao.contadorDeAlunos);
		
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("Contador do objeto: " + maria.contadorDeAlunos);
		
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("Contador do objeto: " + marcos.contadorDeAlunos);
		
		System.out.println("Contador acessado diretamente  da classe: " + Aluno.contadorDeAlunos);
	}
}
