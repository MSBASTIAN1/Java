package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora calcu = new Calculadora();
		
		int resultadoSuma;
		resultadoSuma = calcu.sumar(5, 8);
		
		double resultadoResta;
		resultadoResta = calcu.restar(30, 20);
		
		double resultadoMultiplicacion;
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		
		double resultadoDivision;
		resultadoDivision = calcu.dividir(10, 2);
		
		double resultadoPromediar;
		resultadoPromediar = calcu.promediar(10, 8, 9);
		
		System.out.println("Resultado de la suma : "+resultadoSuma);
		System.out.println("Resultado de la resta: "+ resultadoResta);
		System.out.println("El producto de la multiplicación: "+ resultadoMultiplicacion);
		System.out.println("El cociente de la división: "+ resultadoDivision);
		System.out.println("El total del promedio: "+ resultadoPromediar);
		calcu.mostrarResultado();
	}

}
   