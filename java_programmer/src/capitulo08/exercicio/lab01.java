package capitulo08.exercicio;

import java.util.Arrays;

public class lab01 {
	
	public static int getBiggerNumber(int... values) {
//		int bigger = 0;
//		
//		for (int val : values) {
//			if (bigger < val) {
//				bigger = val;
//			}
//		}
		
		Arrays.sort(values);	 
		return values[values.length-1];
	}
	
	public static void main(String[] args) {
		int[] number = {2, 8, 54, 16, 22, 87, 118, 47};
		
		int lastNumber = getBiggerNumber(number);
		System.out.println(lastNumber);
	}
}
