import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		System.out.println("insira uma linha: ");
		Scanner scanner = new Scanner(System.in);
		String lendolinha = scanner.nextLine();
		System.out.println("A linha entrada foi: "+lendolinha);
		
		System.out.println("insira uma idade: ");
		int lendoInteiro = scanner.nextInt();
		System.out.println("A idade é: " +lendoInteiro);
		
		scanner.close();
	}

}
