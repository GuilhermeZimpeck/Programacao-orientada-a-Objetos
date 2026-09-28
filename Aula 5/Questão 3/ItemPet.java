public class ItemPet{
	private String codigo;
	private double preco;
	public ItemPet(String codigo, double preco){
		this.codigo = codigo;
		this.preco = preco;
	}
	public double getPrecoFinal(){
		return preco * 1.1;
	}
	public String getCodigo(){
		return codigo;
	}
	public double getPreco(){
		return preco;
	}
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public String toString(){
		return codigo + "#" + preco;
	}
}
