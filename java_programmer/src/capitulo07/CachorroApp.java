package capitulo07;

public class CachorroApp {
	public static void main(String[] args) {
		Cachorro x = new Cachorro();
		Cachorro c = new Cachorro("bilu", 2);
		
		System.out.println(x.nome);
		System.out.println(x.idade);
		System.out.println(x.porte);
		System.out.println();
		System.out.println(c.nome);
		System.out.println(c.idade);
		System.out.println(c.porte);
		
		System.out.println(c);
		
	}
}
