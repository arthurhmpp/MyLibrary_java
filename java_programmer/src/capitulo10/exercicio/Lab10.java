package capitulo10.exercicio;

public class Lab10 {
	public static void main(String[] args) {
		Imprimivel a = new Relatorio();
		Imprimivel b = new Grafico();
		
		a.imprimir();
		System.out.println();
		b.imprimir();
	}
}
