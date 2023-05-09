package capitulo02;

public class ExemploCast {
	public static void main(String[] args) {

		// CAST IMPLICITO (NATURAL)
		byte b = 127;
		int i = b; 
		float f  = i; 
		double d = f;
		 
		// CAST EXPLICITO (FORCADO)
		byte b1 = (byte) d;
		
		double d1 = 1302.0;
		byte b2 = (byte) d1;
		float f1 = (float) d1;
		
		System.out.println(d);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(f1);
		
	}
	
}
