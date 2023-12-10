package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Reto1
		//auto1
		Auto auto1 = new Auto();
		auto1.setMarca("Mercedez Benz");
		auto1.setAnio(2004);
		auto1.setPrecio(12.555);
		System.out.println("Auto 1: ");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		//auto2
		System.out.println("----------------------");
		System.out.println("Auto 2:");
		Auto auto2 = new Auto();
		auto2.setMarca("Toyota");
		auto2.setAnio(2010);;
		auto2.setPrecio(16.345);
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getAnio());
		
	}

}
