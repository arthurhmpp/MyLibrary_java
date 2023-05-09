package capitulo02;

public class CaracteresEscape {
	public static void main(String[] args) {
		System.out.print("hoje estou aprendendo sobre \"caracteres de espace\"\n");
		System.out.println("\testou escrevendo em outra linha!");
		
		String fruta = "banana";
		float valorKilo = 10.8f;
		System.out.printf("o valor do kilo %s, esta R$ %.2f", fruta, valorKilo);
	}
}
