public class Calculo {

	public static void main(String[] arg) {
		double d = (int) (Math.random() * 100.0); //Math pode ser usado sem criar um new Math porque ele é static
		System.out.println(d);
		System.out.println(Calc.media(10, 20));
		
	}
}
