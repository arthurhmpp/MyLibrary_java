package capitulo10;

public class Geladeira implements Eletrodomestico{
	
	@Override
	public void ligar() {
		System.out.println("Geladeira ligando");
	}
	
	@Override
	public void desligar() {
		System.out.println("Geladeira desligando");
	}

}
