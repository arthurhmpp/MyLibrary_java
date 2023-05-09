package capitulo15;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	private String categoria;
	private boolean necessario;

	public Produto(String nome, double preco, String categoria, boolean necessario) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.necessario = necessario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isNecessario() {
		return necessario;
	}

	public void setNecessario(boolean necessario) {
		this.necessario = necessario;
	}
	
	public void detalharProduto() {
		System.out.println(String.format("%s | %s | %.2f\n", this.getNome(), this.getCategoria(), this.getPreco()));
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + ", necessario=" + necessario
				+ "]";
	}

	@Override
	public int compareTo(Produto other) {
		if (this.getPreco() > other.getPreco())
			return -1;
		if (this.getPreco() < other.getPreco())
			return 1;
		
			return 0;
		
//		return this.getNome().compareTo(other.getNome());
	}
}
