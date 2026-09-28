public class Racao extends ItemPet{
	public Racao(String codigo, double preco){
		super(codigo, preco);
	}
	@Override
	public double getPrecoFinal(){
		return getPreco() * 1.03;
	}
}
