import java.util.Scanner;
public class PetShopPatasFelizes{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ItemPet[] array = new ItemPet[5];
		for(int i = 0; i < 5 ; i++){
			if(i < 3){
				System.out.println("digite o codigo: ");
				String cod1 = scanner.nextLine();
				System.out.println("digite o preco: ");
				double pre1 = scanner.nextDouble();
				array[i] = new Racao(cod1 , pre1);
			}else{
				System.out.println("digite o codigo: ");
				String cod2 = scanner.nextLine();
				System.out.println("digite o preco: ");
				double pre2 = scanner.nextDouble();
				array[i] = new Acessorios(cod2 , pre2);
			}
			scanner.nextLine();	
		}
        double[] media = Utils.media(array);
        System.out.println(media[0] + " " + media[1]);
	}
}
