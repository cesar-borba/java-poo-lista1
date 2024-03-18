package ex1;

/*Exerc´ıcio 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. Fa¸ca agora uma classe Churrasco 
que possua: Atributos: qtdCarne(double); M´etodo: verificarConsumo():
Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne
*/

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Joao", "masculino", 7, false);
		Pessoa pessoa2 = new Pessoa("Maria", "feminino", 15, true);
		Pessoa pessoa3 = new Pessoa("César", "masculino", 20, false);
		Pessoa pessoa4 = new Pessoa("Juliana", "feminino", 7, true);
		Churrasco churras1 = new Churrasco();
		pessoa1.MostrarAtributos();
		churras1.verificarConsumo(pessoa1);
		pessoa2.MostrarAtributos();
		churras1.verificarConsumo(pessoa2);
		pessoa3.MostrarAtributos();
		churras1.verificarConsumo(pessoa3);
		pessoa4.MostrarAtributos();
		churras1.verificarConsumo(pessoa4);
	}
}
