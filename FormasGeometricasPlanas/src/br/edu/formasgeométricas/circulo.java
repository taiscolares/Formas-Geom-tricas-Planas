
package br.edu.formasgeométricas;

public class circulo {
	
	private double raio;
	private double area;

	public circulo() {
		raio = 0;
		area = 0;
	}
	
	public void recebaRaio(double raio) {
		this.raio = raio; 
	}
	
	public void calcArea() {
		area = Math.PI * raio * raio;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Círculo é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}


}