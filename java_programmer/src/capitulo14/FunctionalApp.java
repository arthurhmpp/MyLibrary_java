package capitulo14;

import java.util.ArrayList;
import java.util.List;

public class FunctionalApp {
	public static void main(String[] args) {
		Functional01 f01 = () -> System.out.println("Hello Functional");
		f01.execute();
		
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		
		l.forEach(System.out::println);
		l.forEach(t -> System.out.println("item: " + t));
		
	}
}