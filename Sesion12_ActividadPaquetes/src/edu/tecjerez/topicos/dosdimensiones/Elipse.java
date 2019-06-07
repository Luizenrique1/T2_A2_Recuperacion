package edu.tecjerez.topicos.dosdimensiones;

public class Elipse {

	public double areaElipse(double a, double b) {
		return (3.1416*a*b);
	}
	
	private double perimetroElipse(double a, double b) {
		return (2*3.1416)*(Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2))/2));
	}
}
