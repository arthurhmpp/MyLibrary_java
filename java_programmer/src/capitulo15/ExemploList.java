package capitulo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> alunosList = new ArrayList<>();
		
		alunosList.add("Luciono");
		alunosList.add("Renan - O Pedreiro");
		alunosList.add("Paulo");
		alunosList.add("Nicolas");
		alunosList.add("Lucas");
		alunosList.add("Arthur");
		alunosList.add("Matheus");
		alunosList.add("Hiuri");
		alunosList.add("Rosemeire");
		alunosList.add("Shirley");
		alunosList.add("Viviane");
		alunosList.add(0,"Diego");
		
		
		System.out.println(alunosList.contains("Viviane"));
		System.out.println(alunosList.get(0));
		System.out.println(alunosList.get(alunosList.size()-1));
		System.out.println(alunosList.size());
		alunosList.remove(alunosList.size()-1);
		System.out.println(alunosList);
		System.out.println(alunosList.contains("Viviane"));
		alunosList.removeIf((i) -> i.length() > 5);
		Collections.sort(alunosList);
		System.out.println(alunosList);
	}
}
