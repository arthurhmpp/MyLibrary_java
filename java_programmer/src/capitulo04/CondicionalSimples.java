package capitulo04;

public class CondicionalSimples {
	public static void main(String[] args) {
		float salario = 2850.99f;
		String cargo = "analista jr";
		
		System.out.println("antes da condicional");
		if (salario > 2500 && cargo.equals("analista jr")) {
			System.out.println("Meus parabens!");
		}
		else {
			System.out.println("false");
			System.out.println("verdade");
		}
		System.out.println("depois da condicional");
	}
}
