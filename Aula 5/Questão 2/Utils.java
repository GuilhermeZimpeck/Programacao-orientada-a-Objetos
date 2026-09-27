public class Utils{
  public static boolean[] recomendar(double[] relevancias){
		boolean[] x = new boolean[relevancias.length];
		for(int i = 0; i < relevancias.length ; i++){
			if(relevancias[i] > 0.5){
			x[i] = true;
			}
		}
		return x;
	}	
}
