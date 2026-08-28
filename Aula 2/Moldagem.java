public class Moldagem {

	public static void main(String[] args) {
		short x = 256;
		int i = 52;
		byte f = (byte)i;
		byte m = (byte)x;
		System.out.println(m);
		System.out.println(f); //data leak
		long cpf = 19332002723L; //L no final
	}

}
