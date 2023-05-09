package capitulo09.exercicio;

public class RG {
	private int numero;
	private String dataNasc;
	
	public RG(int numero, String dataNasc) {
		super();
		this.numero = numero;
		this.dataNasc = dataNasc;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void SetNumero(int numero) {
		this.numero = numero;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
}
