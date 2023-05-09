package capitulo08.exercicio;

public class Lab02 {
	public static void main(String[] args) {
		if (args.length > 0) {
			int soma = 0;
			String idadesTexto = "";
			
			for (int i = 0; i < args.length; i++) {
				idadesTexto += args[i] + " ";
				soma += Integer.parseInt(args[i]);
			}
			
			double media = soma / args.length;
			
			System.out.println("A media das idades: ");
			System.out.println(idadesTexto);
			System.out.println("é de: " + media);
		
		}else {
			System.out.println("Entre com valores validos para as idades");
		}
	}
}
