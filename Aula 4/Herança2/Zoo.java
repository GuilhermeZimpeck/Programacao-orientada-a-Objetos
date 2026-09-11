import java.util.Scanner;

public class Zoo {

	public static void main(String[] arg) {
		Animal x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 , 2 ou 3");
		System.out.println("1 - LEAO");
		System.out.println("2 - URSO");
		System.out.println("3 - COELHO");
		
		int i = sc.nextInt();
		
		if(i == 1) {
			x = new Leao();
		}else if(i == 2) {
			x = new Urso();
		}else {
			x = new Coelho();
		}
		iniciar(x);
	}
	public static void iniciar(Animal k) {
		k.correr();
		if(k instanceof Leao) {
			Leao u = (Leao) k;
			u.rugir();
		}
	}
}
