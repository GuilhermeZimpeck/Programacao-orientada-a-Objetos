public class GuessGame{
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRigth = false;
        boolean p2IsRigth = false;
        boolean p3IsRigth = false;

        int targetNumber = (int) (Math.random() * 10.0);
        System.out.println("estou pensando entre um numero entre 0 e 9...");

        while (true) {
            System.out.println("O numero para adivinhar é: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("O jogador 1 escolheu: "+ guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador 2 escolheu: "+ guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador 3 escolheu: "+ guessp3);

            if ( guessp1 == targetNumber){
                p1IsRigth = true;
            }
            if ( guessp2 == targetNumber){
                p2IsRigth = true;
            }
            if ( guessp3 == targetNumber){
                p3IsRigth = true;
            }

            if(p1IsRigth || p2IsRigth || p3IsRigth){
                System.out.println("Temos um vencedor!!!");
                if(p1IsRigth){
                    System.out.println("O jogador 1 venceu!!!");
                }
                if(p2IsRigth){
                    System.out.println("O jogador 2 venceu!!!");
                }
                if(p3IsRigth){
                    System.out.println("O jogador 3 venceu!!!");
                }
                System.out.println("O jogo acabou");
                break;
            }else{
                System.out.println("Ninguem acertou, O jogo continua");
                targetNumber = (int) (Math.random() * 10.0);
                System.out.println("estou pensando entre um numero entre 0 e 9...");

            }
        }
    }  
}
