package aula_22_10;

public class Pessoa1 {
	private String nome;
	private int idade;
	//Construtor padrão é criado mesmo que não explicitado
	public Pessoa1() {
		
	}
//Método construtor com argunto
	public Pessoa1(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
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
}
 