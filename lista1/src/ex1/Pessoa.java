package ex1;

public class Pessoa {
	String nome;
	String sexo;
	int idade;
	boolean vegetariana;
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.vegetariana = vegetariana;
	}
	
	public void MostrarAtributos() {
		String veget;
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		if (vegetariana == true)
			veget = "sim";
		else
			veget = "não";
		System.out.println("Vegetariana? " + veget + "\n");
	}
}
