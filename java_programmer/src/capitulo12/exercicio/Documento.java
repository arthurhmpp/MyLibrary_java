package capitulo12.exercicio;

/**
 * Classe que representa um documento no domínio de interesse do problema
 * análisado
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
	 * Metodo que realiza o pagamento do documento por Cartão = 1, Pix = 2, Débito = 3
	 * 
	 * @return Codigo de autorização do pagamento
	 */
	public String baixarDocumento() {
		return "124aAcDZeaX145";
	}
}
