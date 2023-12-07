package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Reto1
		//auto1
		Auto auto1 = new Auto();
		auto1.marca = "Mercedez Benz";
		auto1.anio = 2004;
		auto1.precio = 12.555;
		System.out.println("Auto 1: ");
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		//auto2
		System.out.println("----------------------");
		System.out.println("Auto 2:");
		Auto auto2 = new Auto();
		auto2.marca = "Toyota";
		auto2.anio = 2010;
		auto2.precio = 16.345;
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		
	}

}
