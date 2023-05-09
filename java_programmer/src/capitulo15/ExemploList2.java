package capitulo15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploList2 {
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
		
		Collections.sort(alunosList);
		System.out.println(alunosList);
		
		String[] cursos = {"Java", "PHP", "JavaScript", "SQL"};
		
		List<String> listCopy = Arrays.asList(cursos);
//		listCopy.add("HTML"); NAO SERA POSSIVEL ADICIONAR QUANDO A LIST FAZ COPIA DE UM ARRAY 
		listCopy.set(0, "HTML");
		System.out.println(listCopy);
		
		String[] cursos2 = {"Java", "PHP", "JavaScript", "SQL"};
		List<String> listCopy2 = List.of(cursos2);
//		listCopy.add("HTML"); NAO SERA POSSIVEL ADICIONAR QUANDO A LIST FAZ COPIA DE UM ARRAY 
//		listCopy.set(0, "HTML"); totalmente imutavel
//      NAO PODE TRABALAR COM VALORES NULOS
		System.out.println(listCopy2);
		
		String[] arr = {"a","b", null};
		List<String> list = List.of(arr);
		
//		TRANSFORMA A LISTA EM IMUTAVEL
		Collections.unmodifiableCollection(list);	}
}
