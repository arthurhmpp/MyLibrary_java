package capitulo15.exercicio;

public class Estudante {
	String nome;
	double notaMatematica;
	double notaPortugues;
	double media;
	
	
	public Estudante(String nome, double notaMatematica, double notaPortugues) {
		super();
		this.nome = nome;
		this.notaMatematica = notaMatematica;
		this.notaPortugues = notaPortugues;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
}
