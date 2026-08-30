public class Beersong {
    public static void main(String[] args) {
        byte i;
        for(i = 99; i > 0 ; i--){ 
            if (i == 1){
                System.out.println(i +" garrafa de cerveja na parede");
                System.out.println(i +" garrafa de cerfeja");
                System.out.println("pegue uma passe adiante");
                break;
            }
            System.out.println(i +" garrafas de cerveja na parede");
            System.out.println(i +" garrafas de cerfeja");
            System.out.println("pegue uma passe adiante");
        }
        System.out.print("\nCompre mais 99 garrafas");
    }
}
