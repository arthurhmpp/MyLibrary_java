package capitulo15;

import java.util.Comparator;

public class Brinquedo implements Comparable<Brinquedo>, Comparator<Brinquedo>{
	private String nome;
	private String descricao;
	private int altura;
	private int profundidade;
	private double preco;
	
	public Brinquedo() {}
	
	public Brinquedo(String nome, String descricao, int altura, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.altura = altura;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + altura;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + profundidade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brinquedo other = (Brinquedo) obj;
		if (altura != other.altura)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (profundidade != other.profundidade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Brinquedo [nome=" + nome + ", descricao=" + descricao + ", altura=" + altura + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(Brinquedo other) {
		return (int) (this.getPreco() - other.getPreco());
	}

	@Override
	public int compare(Brinquedo obj, Brinquedo other) {
		return obj.getAltura() - other.getAltura();
	}
	
}
