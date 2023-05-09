package capitulo09;

public class HerancaApp {
	public static void main(String[] args) {
		Programador p = new Programador("Arthur",  34, "Java", "Dell", "Celeron");
		
		p.mostrarInformacaoes();
		
		System.out.println("--");
		
		System.out.println(p.getNotebook());
		System.out.println(p.getModeloNotebook());
		
		p.setNotebook(new Computador("MacbookPRO 2023", "M2"));
		
		System.out.println(p.getModeloNotebook());
		
//		Programador p = new Programador();
//		p.setNome("Joao");
//		p.setIdade(28);
//		p.setLinguagem("Java");
//		p.toString();
		
//		System.out.println(p.getNome());		
//		System.out.println(p.getIdade());
//		System.out.println(p.getLinguagem());
//		System.out.println(p.toString());
		
//		Funcionario f = new Funcionario();
//		System.out.println(f.toString());

	}
}
