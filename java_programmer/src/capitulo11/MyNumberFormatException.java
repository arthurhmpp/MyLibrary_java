package capitulo11;

public class MyNumberFormatException  extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyNumberFormatException(String message) {
		super(message);
	}

	public MyNumberFormatException(Throwable cause) {
		super(cause);
	}
	
	public MyNumberFormatException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
