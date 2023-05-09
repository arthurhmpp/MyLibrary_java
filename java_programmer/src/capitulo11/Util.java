package capitulo11;

public class Util {
	public static int formatNumber(String number) throws MyNumberFormatException{
		return Integer.parseInt(number);
	}
	
	public static int[] formatNumbers(String ... numbers) throws MyNumberFormatException{
		int[] formatedNumbers = new int[numbers.length];
		
		for(int i = 0 ; i < formatedNumbers .length; i++) {
			try {
				formatedNumbers[i] = formatNumber(numbers[i]);	
			} catch (NumberFormatException e) {
				throw new MyNumberFormatException("errrou!!!", e);
			}		
		}
		return formatedNumbers;
	}
}
