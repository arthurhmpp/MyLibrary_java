package capitulo04;

public class CondicionalDupla {
	public static void main(String[] args) {
		float salario = 2850.99f;
		String cargo = "analista pl";
		
		System.out.println("antes da condicional");
		if (salario > 2500 && cargo.equals("analista jr")) {
			System.out.println("Meus parabens!, ganhou uma promo��o!");
		}
		else {
			System.out.println("vai ficar sem promo��o haha");
		}
		System.out.println("depois da condicional");
	}
}
