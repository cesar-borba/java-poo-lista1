package ex02;

public class Lâmpada {
	Estado estado;
	int qtdAcendimentos;
	
	//CONSTRUTOR -> estado inicial da Lâmpada, número de acendimentos zerado e estado APAGADA
	public Lâmpada() {
		this.qtdAcendimentos = 0;
		this.estado = Estado.APAGADA;
	}
	public void click() {
		if (checaEstado() == Estado.APAGADA) {
			qtdAcendimentos = qtdAcendimentos() + 1;
			estado = Estado.ACESA;
		}
		else
			estado = Estado.APAGADA;
	}
	
	public int qtdAcendimentos() {
		return qtdAcendimentos;
	}
	
	public Estado checaEstado() {
		return estado;
	}
}
