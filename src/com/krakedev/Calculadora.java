package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2){
		int resultado;//Declaro la variable
		resultado = valor1 + valor2;
		return resultado;
	}
	public double restar(int valor1, int valor2) {
		double resultado;//Declaro la variable
		resultado = valor1 - valor2;
		return resultado;
	}
	public double multiplicar(double valor1, double valor2) {
		double resultado;//Declaro la variable
		resultado = valor1 * valor2;
		return resultado;
	}
	public double dividir(double dividendo, double divisor) {
		double resultado;//Declaro la variable
		resultado = dividendo / divisor;
		return resultado;			
	}
	public double promediar(double valor1, double valor2, double valor3) {
		double resultado1;//Declaro la variable
		resultado1 = valor1 + valor2 + valor3;
		double resultado2;//Declaro la variable
		resultado2 = resultado1 / 3;
		return resultado2;
	}
	public void mostrarResultado(){
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
