package capitulo06;

public class AviaoApp {
	public static void main(String[] args) {
		Aviao x = new Aviao();
		
		x.setDestino("Paris");
		System.out.println("Aguardando decolagem!\n");
		
		x.decolar();
		System.out.println("Altitude: " + x.getAltitude());
		System.out.println();
		System.out.println("Destino: " + x.getDestino());
		System.out.println();
		x.pousar();
		
	}
}
