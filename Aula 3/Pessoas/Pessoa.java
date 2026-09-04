public class Pessoa {
	private String nome;
	private double salario;
	public Pessoa() { 	
		System.out.println("criando objeto");
	}
	public String getName() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setName(String n) {
		nome = n;
	}
	public void setSalario(double d) {
		salario = d;
	}
}
