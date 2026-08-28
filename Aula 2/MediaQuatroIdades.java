import java.util.Scanner;

public class porgrama {

	public static void main(String[] args) {
		int i1;
		float cont = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++){
		System.out.println("insira quatro idade: ");

		i1 = scanner.nextInt();
		cont += i1;
		
		}
		cont =cont/ 4;
		System.out.println("A media das idades é: "+ cont);
	}

}
