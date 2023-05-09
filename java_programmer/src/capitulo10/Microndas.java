package capitulo10;

public class Microndas implements Eletrodomestico{
	
	
	@Override
	public void ligar() {
		System.out.println("Microndas ligando");
	}
	
	@Override
	public void desligar() {
		System.out.println("Microndas desligando");
	}
}
