public class Utils {
	public static double[] media(ProdutoLivraria[] compra) {
		double[] i = new double[1];

		for(int cont = 0; cont < 2; cont ++) {
			i [0] += compra[cont].getPrecoFinal();
			i [1] += compra[cont].getPreco();
			}
		i[0] = i[0] / compra.length;
		i[1] = i[1] / compra.length;
		return i;
		}
}
