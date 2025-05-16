

package br.edu.formasgeométricas;

public class losango {
	private double diagMaior;
	private double diagMenor;
	private double area;
	
	public losango() {
		diagMaior = 0;
		diagMenor = 0;
		area = 0;
	}

	public void recebaBaseMaior(double diagMaior) {
		this.diagMaior = diagMaior; 
	}
    
	public void recebaBaseMenor(double diagMenor) {
		this.diagMenor = diagMenor; 
	}
	
	
	public void calcArea() {
		area = (diagMaior * diagMenor)/2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Losangulo é: " + area);
	}
	
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

}
