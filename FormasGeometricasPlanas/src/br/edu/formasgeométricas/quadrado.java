

package br.edu.formasgeométricas;

public class quadrado {
	
	private double lado;
	private double area;

	public quadrado() {
		lado = 0;
		area = 0;
	}
	

	public void recebaLado(double lado) {
		this.lado = lado; 
	}
	
	public void calcArea() {
		area = (lado * lado);
	}
	
	public void mostrarArea () {
		System.out.println("A área do Quadrado é: " + area);
	}

	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

}
