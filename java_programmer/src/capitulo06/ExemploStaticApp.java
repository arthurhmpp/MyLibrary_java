package capitulo06;

public class ExemploStaticApp {
	public static void main(String[] args) {
		ExemploStatic obj = new ExemploStatic();
		ExemploStatic obj2 = new ExemploStatic();
		
		obj.text = "ABC";
		obj.number = 1010;
		
		obj2.text = "ZXY";
		obj2.number = 1010;
		
		ExemploStatic.number = 1515;
		
		System.out.println(obj.text);
		System.out.println(ExemploStatic.number);
		System.out.println(obj.emitirApresentacao());
		System.out.println(obj.emitirApresentacaoStatic());
		System.out.println(obj2.text);
		System.out.println(obj2.number);
		System.out.println(obj2.emitirApresentacao());
		System.out.println(obj2.emitirApresentacaoStatic());
	}
}
