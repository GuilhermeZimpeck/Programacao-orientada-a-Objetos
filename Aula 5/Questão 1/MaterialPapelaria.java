public class MaterialPapelaria extends ProdutoLivraria{
	public MaterialPapelaria (String codigo, double preco) {
		super(codigo,preco);
	}
	public double getPrecoFinalMaterial() {
		return super.getPrecoFinal() + 7.5;
	}
}
