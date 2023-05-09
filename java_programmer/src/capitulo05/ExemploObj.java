package capitulo05;

public class ExemploObj {
	public static void main(String[] args) {
		Cachorro obj = new Cachorro(); //INSTANCIA
		
		obj.nome = "Spock";
		obj.raca = "Yorkshire";
		obj.porte = "Pequeno";
		obj.sexo = 'M';
		obj.dono = new Pessoa();
		obj.dono.nome = "Diego";
		obj.dono.idade = 34;
		
//		System.out.println(obj.nome);
//		System.out.println(obj.raca);
//		System.out.println(obj.porte);
//		System.out.println(obj.sexo);
//		
//		System.out.println(obj.dono.nome);
//		System.out.println(obj.dono.idade);
		
		obj.mostrarInformacoes();
		
	}
}
