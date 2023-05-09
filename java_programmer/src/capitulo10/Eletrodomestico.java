package capitulo10;

public interface Eletrodomestico {
	
	public abstract void ligar();
	
	public abstract void desligar();	
	
	default void acionar(int time) {
		try {
			Thread.sleep( time * 60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void testeStatic() {
		System.out.println("método static");
	}
	
	private void testePrivate() {
		System.out.println("método private");
	}
	
}