package ex03;

/*Exerc´ıcio 3. Implemente uma classe chamada Complexo para representar
n´umeros imagin´arios e esta deve possuir:
• Atributos: dois doubles a (Parte real) e b (Parte imagin´aria).
• M´etodos:*/

public class Main {

	public static void main(String[] args) {
		Complexo cpx1 = new Complexo(1, 1);
		Complexo cpx2 = new Complexo(3,2);
		cpx1.toMyString();
		cpx1.mostrar();
		cpx2.toMyString();
		cpx2.mostrar();
		Complexo soma = cpx1.soma(cpx2);
		Complexo multiplicacao = cpx1.multiplica(cpx2);
		soma.toMyString();
		multiplicacao.toMyString();
	}

}
