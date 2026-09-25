import java.util.Scanner;

public class LivrariaPaginasAbertas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		ProdutoLivraria[] x = new ProdutoLivraria[5];
		for(int i = 0 ; i < 5 ; i++) {
			if(i < 3) {
				System.out.print("Digite o codigo do livro: ");
				String codl = scanner.nextLine();
				System.out.print("Digite o preco do livro: ");
				double valorl = scanner.nextDouble();
				x[i] = new Livro(codl , valorl);
			}
			else {
				System.out.print("Digite o codigo do Material: ");
				String codm = scanner.nextLine();
				System.out.print("Digite o preco do Material: ");
				double valorm = scanner.nextDouble();
				x[i] = new Livro(codm , valorm);
			}
			scanner.nextLine();
		}
	double media [] = Utils.media(x);
	System.out.println("MPF: " + media[0] + "MP: " + media[1] + "dif: " + (media[0] - media[1]));
	}

}
