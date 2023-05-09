package capitulo11;

public class ExemploTryCatch {
	public static void main(String[] args) {
		String[] arr = {"10a" ,"5" ,"7"};
		
		try {
			System.out.println(Integer.parseInt(arr[0]));
			System.out.println(arr[8]);
			System.out.println(arr[arr.length-1]);
			System.out.println("Depois da exception");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Opa! deu erro!");
			e.getStackTrace();
		} catch (NumberFormatException e) {
			// TODO: handle exception
		} catch (NullPointerException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(arr[1]);
		System.out.println("final");
		
		int i = 10;
		
		try {
			System.out.println(i / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro ao dividir numero: " + e.getMessage());
		}
	}
}