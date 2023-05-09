package capitulo07.exercicio;

public class lab01 {
	public static void main(String[] args) {
		Cadastro a = new Cadastro();
		Cadastro b = new Cadastro("Arhur", "Pereira");
		Cadastro c = new Cadastro("Cris", "Brito", 31);
		
		a.mostrar();
		System.out.println();
		b.mostrar();
		System.out.println();
		c.mostrar();
	}
}