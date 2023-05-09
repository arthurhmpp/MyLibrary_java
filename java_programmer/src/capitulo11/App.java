package capitulo11;

public class App {
	public static void main(String[] args){
		int n = 0;
		
		try {
			n = Util.formatNumber("15");	
		} catch (Exception e) {
			System.out.println("erro " + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("valor de n: " + n);
		}
		
		
		System.out.println(n);
		System.out.println();
		
		try {
			int[] values = Util.formatNumbers(new String[]{"10", "20a","30", "40"});
			for(int v : values) {
				System.out.println(values[v]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		
	}
}
