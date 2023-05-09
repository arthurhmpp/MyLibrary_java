package capitulo09.exercicio;

public class Lab01 {
	public static void main(String[] args) {
		Pessoa a = new Aluno("Cris", 41, 'F', 555555, "13/10/1991", 3000, "Matematica");
		Pessoa b = new Aluno("Karla", 50, 'F', 555555, "23/06/1986", 3000, "Matematica");
		Pessoa c = new Professor("Arthur", 39, 'M', 4444444, "29/07/1988", 3000, "Matematica");
		
		c.falar("Karla?");
		a.falar("Aqui");
		c.falar("Cris?");
		b.falar("Faltou!!");
		
		System.out.println();
		
		c.mostrarDados();
		System.out.println();
		a.mostrarDados();
		System.out.println();
		b.mostrarDados();
				
	}
}
