public class Acessorios extends ItemPet{
	public Acessorios(String codigo, double preco){
		super(codigo, preco);
	}
	@Override
	public double getPrecoFinal(){
		return getPreco() + 7.5;
	}
}
