package br.edu.formasgeométricas;

public class trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		altura = 0;
		area = 0;
	}
	
	public void recebaBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior; 
	}
    
	public void recebaBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor; 
	}
	
	public void recebaAltura(double altura) {
		this.altura = altura; 
	}
	
	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura)/2;
	}
	
	public void mostrarArea() {
		System.out.println("A área do Trapézio é: " + area);
	}
	
	
	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}

}