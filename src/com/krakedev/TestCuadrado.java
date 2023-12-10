package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(7);
		Cuadrado c3 = new Cuadrado(13);
		
		double areaC1;
		double perimetroC1;
		double areaC2;
		double perimetroC2;		
		double areaC3;
		double perimetroC3;
		
		areaC1 = c1.calcularArea();
		perimetroC1 = c1.calcularPerimetro();
		
		areaC2 = c2.calcularArea();
		perimetroC2 = c2.calcularPerimetro();

		areaC3 = c3.calcularArea();
		perimetroC3 = c3.calcularPerimetro();
		
		System.out.println("El perímetro del cuadrado 1 es: "+perimetroC1+" y el área es: "+ areaC1);
		System.out.println("El perímetro del cuadrado 2 es: "+perimetroC2+" y el área es: "+ areaC2);
		System.out.println("El perímetro del cuadrado 3 es: "+perimetroC3+" y el área es: "+ areaC3);
	}

}
