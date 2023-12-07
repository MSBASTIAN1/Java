package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Reto1
		//Producto A
		System.out.println("Producto A");
		Producto productoA = new Producto();
		productoA.nombre = "Protector Solar";
		productoA.descripcion = "Sustancia que ayuda a proteger la piel de los rayos solares.";
		productoA.precio = 10.5;
		productoA.stockActual = 50;
		System.out.println("Nombre: "+ productoA.nombre);
		System.out.println("Descripción: "+ productoA.descripcion);
		System.out.println("Precio: $"+ productoA.precio);
		System.out.println("Unidades: "+ productoA.stockActual);
		System.out.println("---------------------------------------------------------------------------------------");
		
		//Producto B
		System.out.println("Producto B");
		Producto productoB = new Producto();
		productoB.nombre = "Paracetamol";
		productoB.descripcion = "Analgésico y antipirético eficaz para el control del dolor leve o moderado.";
		productoB.precio = 0.5;
		productoB.stockActual = 100;
		System.out.println("Nombre: "+ productoB.nombre);
		System.out.println("Descripción: "+ productoB.descripcion);
		System.out.println("Precio: $"+ productoB.precio);
		System.out.println("Unidades: "+ productoB.stockActual);
		System.out.println("---------------------------------------------------------------------------------------");		
		//Producto C
		System.out.println("Producto C");
		Producto productoC = new Producto();
		productoC.nombre = "Protex";
		productoC.descripcion = "Protex Jabón en Barra Fourpack Avena";
		productoC.precio = 2;
		productoC.stockActual = 40;
		System.out.println("Nombre: "+ productoC.nombre);
		System.out.println("Descripción: "+ productoC.descripcion);
		System.out.println("Precio: $"+ productoC.precio);
		System.out.println("Unidades: "+ productoC.stockActual);
		

	}

}
