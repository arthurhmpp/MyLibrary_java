package capitulo09;

public class Zoo {
	public static void main(String[] args) {
		Leao l = new Leao();
		
		l.comer();
		
		Animal a = new Leao();
		System.out.println(a instanceof Leao);
		Leao leao = (Leao) a;
		leao.rugir();
	}
}
