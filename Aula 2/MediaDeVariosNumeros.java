import java.util.Scanner;

public class porgrama {

	public static void main(String[] args) {
		int i1;
		float cont = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite quantos digitos você calculara na media: ");
		int qtd = scanner.nextInt();
		for(int i = 0; i < qtd; i++){
		System.out.println("insira quatro idade: ");

		i1 = scanner.nextInt();
		cont += i1;
		
		}
		cont =cont/ qtd;
		System.out.println("A media das idades é: "+ cont);
	}

}
