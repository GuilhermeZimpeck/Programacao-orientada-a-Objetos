public class Utils{
    public static double [] media(ItemPet [] ped){
        double[] media = new double[2];
        for(int i = 0; i < ped.length; i++){
            media[0] = media[0] + ped[i].getPreco();
            media[1] = media[1] + ped[i].getPrecoFinal();
         }
         media[0] = media[0] / ped.length;
         media[1] = media[1] / ped.length;
        return media;
    }
    
}
