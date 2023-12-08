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
				
		System.out.println("Resultado de la suma : "+resultadoSuma);
		System.out.println("Resultado de la resta: "+ resultadoResta);
		System.out.println("Resultado de la multiplicación: "+ resultadoMultiplicacion);
	}

}
   