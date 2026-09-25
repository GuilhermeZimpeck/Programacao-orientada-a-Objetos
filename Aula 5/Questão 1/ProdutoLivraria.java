public class ProdutoLivraria {
	private String codigo;
	private double preco;
	public ProdutoLivraria(String codigo, double preco) {
		this.codigo = codigo;
		this.preco = preco;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	public double getPrecoFinal() {
		return getPreco() * 1.1;
	}
	public String toString() {
		return codigo+ "#" + preco;
	}
}
