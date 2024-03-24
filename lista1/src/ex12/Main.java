package ex12;

/*Exerc´ıcio 12. Implemente a classe Cliente que contenha os atributos: nome,
cpf (Strings) e telefone (Telefone). E que contenha os m´etodos: mostrarDados()
e adicionarTelefone() o primeiro deve mostrar todos os dados do cliente incluindo
o telefone e o ´ultimo deve associar um novo telefone ao cliente. Implemente a
classe Telefone que possua os atributos: ddd e n´umero (Strings) e os m´etodos:
obterNumero() e obterDDD().*/

public class Main {

	public static void main(String[] args) {
		Telefone telefoneAntigo = new Telefone("41", "28378301");
		Cliente cliente1 = new Cliente("Joao", "74545721974", telefoneAntigo);
		cliente1.mostrar();
		Telefone telefoneNovo = new Telefone("41", "32112531");
		cliente1.adicionarTelefone(telefoneNovo);
		cliente1.mostrar();
	}

}
