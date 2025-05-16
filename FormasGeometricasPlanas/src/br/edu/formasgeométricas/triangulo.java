

package br.edu.formasgeométricas;

public class triangulo {

	private double base;
	private double altura;
	private double area;

	public triangulo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	
	public void recebaAltura(double altura) {
		this.altura = altura; 
	}
	
	public void recebaBase(double base) {
		this.base = base; 
	}
	
	
	public void calcArea() {
		area = (base * altura)/2;
	}
	public void mostrarArea () {
		System.out.println("A área do Triângulo é: " + area);
	}
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}



}

