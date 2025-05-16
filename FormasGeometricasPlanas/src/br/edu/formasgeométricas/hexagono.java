
package br.edu.formasgeométricas;

public class hexagono {

		private double lado;
		private double area;
		
		public hexagono() {
			lado = 0;
			area = 0;
		}
		
		public void recebaLado(double lado) {
			this.lado = lado; 
		}
		
		public void calcArea() {
			area = (3 * Math.sqrt(3) * lado * lado) / 2;
		}
		
		public void mostrarArea () {
			System.out.println("A área do Hexagono é: " + area);
		}

		public double mostrarAreaComRetorno () {
			System.out.println(area);
			return area;
		}
	
	
}