public class Conta {
	private double saldo;
	public void debitar(double val) {
			if(val <= saldo) {
				saldo -= val;
				System.out.println("debito efetuado #saldo " + saldo);
			}else {
				System.out.println("saque não realizado #val = " + val);
				throw new RuntimeException();
			}
	}
	public void depositar(double val) {
		saldo += val;
		System.out.println("deposito efetuado");
		System.out.println("você tem " + saldo + " Reais de saldo");
	}
}
