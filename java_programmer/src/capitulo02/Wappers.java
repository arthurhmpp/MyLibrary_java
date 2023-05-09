package capitulo02;

public class Wappers {
	public static void main(String[] args) {
		byte p_byte = 10;
		short p_short = 100;
		int p_int = 1500;
		long p_long = 58450;
		
		float p_float = 158.99f;
		double p_double = 7894568.66;
		
		char p_char = 'A';
		
		boolean p_boolean = true;
		
		Byte b = p_byte;
		Short s = p_short;
		Integer i = p_int;
		Long l = p_long;
		
		Float f = p_float;
		Double d = p_double;
		
		Character c = p_char;
		
		Boolean teste = p_boolean;
		
		String numberText = "1024";
		int number = Integer.parseInt(numberText);
		
		System.out.println(number);
		
		char letra = 'B';
		System.out.println(Character.isLetter(letra));
		
	}	
}
