package capitulo15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploListStream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Luciono");
		list.add("Renan - O Pedreiro");
		list.add("Paulo");
		list.add("Nicolas");
		list.add("Lucas");
		list.add("Arthur");
		list.add("Matheus");
		list.add("Hiuri");
		list.add("Rosemeire");
		list.add("Shirley");
		list.add("Viviane");
		list.add("Diego");

		System.out.println();
		System.out.println("----- ARRAYLIST NORMAL ------");
		
		System.out.println(list.stream().filter(e -> e.length() > 6).count());
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		System.out.println("----- STREAM NORMAL ------");
		
		Stream<String> streamList = list.stream().filter(e -> e.length() > 6);
		List<String> otherList = streamList.collect(Collectors.toList());
		otherList.forEach(System.out::println);
		
//		CASO PRECISE UTILIZAR NOVAMENTE UM STREAM SERA NECESSARIO IMPLANTAR UM SUPPLIER 
		
		System.out.println();
		System.out.println("----- SUPPLIER ------");
		Supplier<Stream<String>> streamList2 = () -> list.stream().filter(e -> e.length() > 6);
		
		List<String> otherList1 = streamList2.get().collect(Collectors.toList());
		otherList1.forEach(System.out::println);
		
		System.out.println();
		System.out.println("----- REUTILIZANDO ------");
		
		List<String> otherList2 = streamList2.get().collect(Collectors.toList());
		otherList2.forEach(System.out::println);
		
		
//		list.stream()
//				.filter(e -> e.length() > 6)
//				.skip(3)
//				.sorted()
//				.forEach(System.out::println);
		
//		QUANDO NAO SABE O TIPO DO REGISTRO		
//		Stream<?> streamList = list.stream();
//		Stream<String> streamList = list.stream();
		
	}
}
