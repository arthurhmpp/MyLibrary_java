package capitulo15;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> alunos = new TreeSet<>();
		
		alunos.add("Luciono");
		alunos.add("Renan - O Pedreiro");
		alunos.add("Paulo");
		alunos.add("Nicolas");
		alunos.add("Lucas");
		alunos.add("Arthur");
		alunos.add("Matheus");
		alunos.add("Hiuri");
		alunos.add("Rosemeire");
		alunos.add("Shirley");
		alunos.add("Viviane");
		alunos.add("Diego");
		alunos.add("Diego");
		alunos.add("Diego");
		alunos.add("Diego");
		alunos.add("Diego");
		alunos.add("Diego");
		alunos.add("Diego");
// 		NAO PERMITE PARAMETRO REPETITIVOS 
		
		alunos.forEach(System.out::println);
		System.out.println(alunos.size());
		System.out.println(alunos.contains("Paulo"));
	}
}
