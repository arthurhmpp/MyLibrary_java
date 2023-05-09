package capitulo15.exercicio;

import java.util.ArrayList;

public class Cap15_Lab02 {
	public static void main(String[]  args) {
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		
		estudanteList.add(new Estudante("Joana", 8.5, 8.5));
		estudanteList.add(new Estudante("Antonio", 6.0, 9.0));
		estudanteList.add(new Estudante("Mariana", 7.5, 9.0));
		estudanteList.add(new Estudante("Ricardo", 7.0, 6.0));
		estudanteList.add(new Estudante("Gustavo", 9.5, 10.0));
		
		System.out.println("------ opção 1 -----");
		estudanteList.forEach(e -> e.setMedia((e.getNotaPortugues() + e.getNotaMatematica())/2));
		
		estudanteList.forEach(e -> System.out.println(e.getNome() + " - " + e.getMedia()));
		System.out.println();
		
		System.out.println("------ opção 2 -----");
		estudanteList.forEach(e -> {
			e.setMedia((e.getNotaPortugues() + e.getNotaMatematica())/2);
			System.out.println(e.getNome() + " - " + e.getMedia());
		});
		
		System.out.println("------ removeIf -----");
		
		estudanteList.removeIf(e -> e.getNome().equals("Ricardo"));
		
		estudanteList.forEach(e -> {
			e.setMedia((e.getNotaPortugues() + e.getNotaMatematica())/2);
			System.out.println(e.getNome() + " - " + e.getMedia());
		});
	}
}
