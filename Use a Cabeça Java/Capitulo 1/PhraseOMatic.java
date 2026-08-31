public class PhraseOMatic{
    public static void main(String[] args) {
        String[] wordListOne = {"Você " , "Joao " , "Pedro " , "Guilherme " , "ele " , "ela "};
        String[] wordListTwo = {"deu" , "é" , "corre" , "vai" , "come" , "foi" ,"ama" , "disse"};
        String[] wordListThree = {" feio" , " rapido" , " esquisito" , " bonito"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        String phrase = wordListOne[randOne] +""+ wordListTwo[randTwo] +""+ wordListThree[randThree];
        System.out.print(phrase);
    }
}
