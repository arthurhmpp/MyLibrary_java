package capitulo10;

public class EletroApp {
	public static void main(String[] args) {
		Eletrodomestico e;
				
		e = new Geladeira();
				
		e.ligar();
		e.desligar();
		
		System.out.println();
	
		e = new Microndas();
		e.ligar();
		e.desligar();
		
	}

}
