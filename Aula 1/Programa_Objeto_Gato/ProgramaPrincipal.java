public class ProgramaPrincipal {

	public static void main(String[] args) {
		System.out.println("inicio:");
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		g1.idade = 4;
		g2.idade = 10;
		g1.nome = "Felipinho";
		g2.nome = "flautino";
		System.out.println("Gato 1: "+ g1.idade +" "+ g1.nome);
		System.out.println("Gato 2: "+ g2.idade +" "+ g2.nome);
		g1.miar();
	}
}
