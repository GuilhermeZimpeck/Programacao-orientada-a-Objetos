public class Livro extends ProdutoLivraria{
	public Livro(String codigo, double preco) {
		super(codigo,preco);
	}
	public double getPrecoFinalLivro() {
		return super.getPrecoFinal() * 1.03;
	}
}
