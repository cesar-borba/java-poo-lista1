package ex02;

/*Exerc´ıcio 2. Implemente uma classe Lˆampada com os seguintes componentes
e fa¸ca um teste ao final: Atributos: estado(Enum) M´etodos:
• click(): ao chamar este m´etodo a lˆampada ´e colocada no estado ”apagada” caso esteja ”acesa” e ´e colocado no estado ”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lˆampada foi acesa (DICA:
este m´etodo deve ser chamada no m´etodo acima).
• checaEstado(): retorna o estado atual da Lˆampada.*/

public class Main {

	public static void main(String[] args) {
		Lâmpada lamp1 = new Lâmpada();
		Estado estado = lamp1.checaEstado();
		System.out.println(estado);
		System.out.println(lamp1.qtdAcendimentos);
		for(int i=0; i<8; i++) {
			lamp1.click();
			estado = lamp1.checaEstado();
			System.out.println(estado);
		}
		System.out.println(lamp1.qtdAcendimentos);
		}
}
