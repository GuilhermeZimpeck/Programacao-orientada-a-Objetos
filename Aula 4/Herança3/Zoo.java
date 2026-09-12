
public class Zoo {

	public static void main(String[] arg) {
		Animal A[] = new Animal[3];
		A[0] = new Leao();
		A[1] = new Urso();
		A[2] = new Elefante();
		
		for(int i = 0; i < A.length; i++) {
			A[i].correr();
			System.out.println(A[i].toString());
		}
		
		
	}
}
