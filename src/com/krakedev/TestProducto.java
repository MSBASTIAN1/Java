package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Reto1
		//Producto A
		System.out.println("Producto A");
		Producto productoA = new Producto();
		productoA.setNombre("Protector Solar");
		productoA.setDescripcion("Sustancia que ayuda a proteger la piel de los rayos solares.");
		productoA.setPrecio(10.5);
		productoA.setStockActual(50);
		System.out.println("Nombre: "+ productoA.getNombre());
		System.out.println("Descripción: "+ productoA.getDescripcion());
		System.out.println("Precio: $"+ productoA.getPrecio());
		System.out.println("Unidades: "+ productoA.getStockActual());
		System.out.println("---------------------------------------------------------------------------------------");
		
		//Producto B
		System.out.println("Producto B");
		Producto productoB = new Producto();
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("Analgésico y antipirético eficaz para el control del dolor leve o moderado.");
		productoB.setPrecio(0.5);
		productoB.setStockActual(100); 
		System.out.println("Nombre: "+ productoB.getNombre());
		System.out.println("Descripción: "+ productoB.getDescripcion());
		System.out.println("Precio: $"+ productoB.getPrecio());
		System.out.println("Unidades: "+ productoB.getStockActual());
		System.out.println("---------------------------------------------------------------------------------------");		
		//Producto C
		System.out.println("Producto C");
		Producto productoC = new Producto();
		productoC.setNombre("Protex");
		productoC.setDescripcion("Protex Jabón en Barra Fourpack Avena");
		productoC.setPrecio(2);
		productoC.setStockActual(40); 
		System.out.println("Nombre: "+ productoC.getNombre());
		System.out.println("Descripción: "+ productoC.getDescripcion());
		System.out.println("Precio: $"+ productoC.getPrecio());
		System.out.println("Unidades: "+ productoC.getStockActual());		
	}
}
