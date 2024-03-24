package ex12;

public class Cliente {
	private String nome;
	private String cpf;
	private Telefone telefone;
	
	public Cliente(String nome, String cpf, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone.obterDDD() + telefone.obterNumero());
	}
	
	public void adicionarTelefone(Telefone novoTelefone) {
		this.telefone = novoTelefone;
	}
}
