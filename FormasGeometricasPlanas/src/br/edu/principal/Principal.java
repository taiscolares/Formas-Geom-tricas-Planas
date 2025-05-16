
package br.edu.principal;

import br.edu.formasgeométricas.*;


public class Principal {

	public static void main(String[] args) {
		triangulo fg1 = new triangulo();
		fg1.recebaBase(10);
		fg1.recebaAltura(6);
		fg1.calcArea();
		fg1.mostrarArea();
		double recebaArea = fg1.mostrarAreaComRetorno();
		System.out.println("");
		
		
		quadrado  fg2 = new quadrado();
		fg2.recebaLado(8);
		fg2.calcArea();
		fg2.mostrarArea();
		recebaArea = fg2.mostrarAreaComRetorno();
		System.out.println("");
		
		
		circulo  fg3 = new circulo();
		fg3.recebaRaio(9);
		fg3.calcArea();
		fg3.mostrarArea();
		recebaArea = fg3.mostrarAreaComRetorno();
		System.out.println("");
		
		
		trapezio fg4 = new trapezio();
		fg4.recebaBaseMaior(9.6);
		fg4.recebaBaseMenor(5);
		fg4.recebaAltura(8);
		fg4.calcArea();
		fg4.mostrarArea();
		recebaArea = fg4.mostrarAreaComRetorno();
		System.out.println("");
		
		
		retangulo fg5 = new retangulo();
		fg5.recebaBase(4);
		fg5.recebaAltura(9);
		fg5.calcArea();
		fg5.mostrarArea();
		recebaArea = fg5.mostrarAreaComRetorno();
		System.out.println("");
		
		
		losango fg6 = new losango();
		fg6.recebaBaseMaior(7);
		fg6.recebaBaseMenor(9);
		fg6.calcArea();
		fg6.mostrarArea();
		recebaArea = fg6.mostrarAreaComRetorno();
		System.out.println("");
		
		
		paralelogramo fg7 = new paralelogramo();
		fg7.recebaBase(12);
		fg7.recebaAltura(9);
		fg7.calcArea();
		fg7.mostrarArea();
		recebaArea = fg7.mostrarAreaComRetorno();
		System.out.println("");
		
		
		pentagono fg8 = new pentagono();
		fg8.recebaLado(5);
		fg8.calcApotema();
		fg8.calcArea();
		fg8.mostrarArea();
		recebaArea = fg8.mostrarAreaComRetorno();
		System.out.println("");
		
		
		hexagono  fg9 = new hexagono();
		fg9.recebaLado(4);
		fg9.calcArea();
		fg9.mostrarArea();
		recebaArea = fg9.mostrarAreaComRetorno();
		System.out.println("");
		

	}

}