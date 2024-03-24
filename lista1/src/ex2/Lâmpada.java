package ex2;

public class Lâmpada {
	Estado estado;
	int qtdAcendimentos;
	
	//CONSTRUTOR -> estado inicial da Lâmpada, número de acendimentos zerado e estado APAGADA
	public Lâmpada() {
		this.qtdAcendimentos = 0;
		this.estado = Estado.APAGADA;
	}
	/*public void click() {
		if (estado = Estado.ACESA)
	}*/
	
	public int qtdAcendimentos() {
		return qtdAcendimentos;
	}
}
