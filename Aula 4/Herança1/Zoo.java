
public class Zoo {

	public static void main(String[] arg) {
		Leao x = new Leao();
		x.setNome("jeferson");
		x.setIdade(10);
		x.setCorOlhos("azul");
		
		System.out.println(x.getNome() +" "+ x.getCorOlhos());
		x.rugir();
	}
}
