package capitulo06;

public class MetodosApp {
	public static void main(String[] args) {
		ExemploMetodos o = new ExemploMetodos();
		String[] s = new String[3];
		
		s[0] = "Arthur";
		s[1] = "Cris";
		s[2] = "Debora";
		
		o.exibirMsg();
		System.out.println(o.calcula(10, 20));
		o.listarNome(s);
		o.exibirValores(7,8,9,6,92,2);
	}
}
