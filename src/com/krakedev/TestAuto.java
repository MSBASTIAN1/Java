package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Reto1
		//auto1
		Auto auto1 = new Auto("Mercedez Benz",2004,12.555);
		System.out.println("Auto 1: ");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		//auto2
		System.out.println("----------------------");
		System.out.println("Auto 2:");
		Auto auto2 = new Auto("Toyota",2010,16.345);
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getAnio());
		
	}

}
