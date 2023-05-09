package capitulo12.exercicio;

/**
 * Classe que representa um documento no dom�nio de interesse do problema
 * an�lisado
 * 
 * @author DSousa
 * @version 1.0
 *
 */
public class Documento {

	private String titulo;
	private String codBarra;
	private double valor;

	/**
	 * Construtor da classe Documento
	 * 
	 * @param titulo Titulo do documento
	 * @param codBarra Codigo de barras para pagamento
	 * @param valor Valor original do documento
	 */
	public Documento(String titulo, String codBarra, double valor) {
		super();
		this.titulo = titulo;
		this.codBarra = codBarra;
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * 
	 * Metodo que realiza o pagamento do documento por Cart�o = 1, Pix = 2, D�bito = 3
	 * 
	 * @return Codigo de autoriza��o do pagamento
	 */
	public String baixarDocumento() {
		return "124aAcDZeaX145";
	}
}
