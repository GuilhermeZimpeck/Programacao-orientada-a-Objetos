
public class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	private String corOlhos;
	
	public String getCorOlhos() {
		return corOlhos;
	}
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void correr() {
		System.out.println("correndo");
	}
	
	
}
