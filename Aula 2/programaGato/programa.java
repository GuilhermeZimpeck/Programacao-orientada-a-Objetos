import java.util.Scanner;

public class porgrama {

	public static void main(String[] arg) {
		float soma = 0;
		Gato g[] = new Gato[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < g.length; i++) {
			g[i] = new Gato();
			System.out.print("Digite o nome  do gato: ");
			g[i].nome = scanner.nextLine();
			System.out.print("Digite a idade do gato: ");
			g[i].idade = scanner.nextInt();
			scanner.nextLine();
		}
		for (int i = 0; i < 3; i++) {
			soma = soma + g[i].idade;
		}
		soma = soma / g.length;
		System.out.print("a media é: " + soma);
	}
}
