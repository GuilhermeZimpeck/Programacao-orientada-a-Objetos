import java.util.Scanner;

public class CaixaAutomatico {

	public static void main(String[] arg) {
		Conta c1 = new Conta();
		Scanner sc = new Scanner(System.in);
		c1.depositar(100);
		System.out.println("Quanto você quer sacar?");
		double valor = sc.nextInt();
		c1.debitar(valor);
		System.out.println("Liberando " + valor + " Reais");
		System.out.println("até logo ");
		
	}
}
