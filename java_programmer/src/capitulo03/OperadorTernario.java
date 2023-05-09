package capitulo03;

public class OperadorTernario {
	public static void main(String[] args) {
		double salario, novoSalario = 0;
		salario = 7500.89;
		
		System.out.println(10 > 5 ? "Maior" : "Menor"); 
		
		System.out.println("Salario base: " + salario);
		novoSalario = (salario > 4000) ? (salario * 1.05) : (salario * 1.1);
		System.out.printf("Salario atualizado: %.2f", novoSalario);
	}
}
