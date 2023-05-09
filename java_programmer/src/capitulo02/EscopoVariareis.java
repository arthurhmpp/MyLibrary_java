package capitulo02;

public class EscopoVariareis {
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("x = " + x);
		
		//ESCOPO PARA TESTE
		{
			x = 155;
			
			System.out.println("escopo interno -> x = " + x);
			
			int y = 10;
			
			System.out.println("escopo interno -> y = " + y);
			
		}
				
		System.out.println("escopo principal -> x = " + x);
//		System.out.println("escopo principal -> y = " + y);// --- VARIAVEL FORA DO ESCOPO
	}
}
