package ex03;

public class Complexo {
	private double a;
	private double b;
	
	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complexo soma(Complexo complexo2) {
		double parteReal = this.a + complexo2.a;
		double parteImaginaria = this.b + complexo2.b;
		return new Complexo(parteReal, parteImaginaria);
	}
	
	public Complexo multiplica(Complexo complexo2) {
		double parteReal = (a * complexo2.a) - (b * complexo2.b);
		double parteImaginaria = (a * complexo2.b) + (b * complexo2.a);
		return new Complexo(parteReal, parteImaginaria);
	}
	
	public void toMyString() {
		System.out.println("Número complexo: " + a + " + " + b + "i");
	}
	
	public double modulo() { //√((a^2) + (b^2))
		double elevadoReal = Math.pow(a, 2);
		double elevadoImaginaria = Math.pow(b, 2);
		return Math.pow(elevadoReal + elevadoImaginaria, 1/2);
	}
	
	public double argumentoPrincipal() {
		return Math.toDegrees(Math.atan(a / b));
	}
	
	public void mostrar() {
		System.out.printf("Módulo: %.2f\n", modulo());
		System.out.printf("Argumento: %.2fº\n", argumentoPrincipal());
	}
	
}