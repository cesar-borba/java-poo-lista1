package ex01;

public class Churrasco {
	double qtdCarne;
	
	public void verificarConsumo(Pessoa pessoa) {
		if (pessoa.idade < 4 || pessoa.vegetariana == true) {
			qtdCarne = 0;
			System.out.println("Não consome carne.\nConsumação média de carne = " + qtdCarne + "kg.\n");
		}
		else if (pessoa.idade < 13) {
			qtdCarne = 1;
			System.out.println("Consome carne.\nConsumação média de carne = " + qtdCarne + "kg.\n");
		}
		else {
			qtdCarne = 2;
			System.out.println("Consome carne.\nConsumação média de carne = " + qtdCarne + "kg.\n");
		}
	}
}
