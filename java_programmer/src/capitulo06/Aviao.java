package capitulo06;

public class Aviao {
	
	public double altitude;
	public String destino;
	
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public double getAltitude() {
		return this.altitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public void decolar() {
		this.setAltitude(800);
		System.out.println("avião decolou");
		this.recolherTremDePouso();
	}
	
	public void pousar() {
		this.abrirTremDePouso();
		System.out.println("avião pousou");
	}
	
	public void abrirTremDePouso() {
		System.out.println("Trem de pousou desceu");
	}
	
	public void recolherTremDePouso() {
		System.out.println("Trem de pousou recolhido");
	}
	
}