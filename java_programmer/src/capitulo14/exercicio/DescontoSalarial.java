package capitulo14.exercicio;

public class DescontoSalarial {
	public static void main(String[] args) {
		double[] salariosBrutos = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};
		double[] salariosLiquidos;
		
		salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, (sal) -> sal * 0.9);
		
		for(double salario : salariosLiquidos) {
			System.out.printf("%.2f\n", salario);
		}
	}
}
