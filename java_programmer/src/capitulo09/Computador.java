package capitulo09;

public class Computador {
	private String modelo;
	private String processador;
	
	public Computador(String modelo, String processador) {
		this.modelo = modelo;
		this.processador = processador;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void ligar() {
		System.out.println("Notebook ligado");
	}
	
	public void desligar() {
		System.out.println("Notebook desligado");
	}
	
	@Override
	public String toString() {
		return String.format("Modelo: %s | Processador: %s", this.getModelo(), this.getProcessador());
	}
	
}