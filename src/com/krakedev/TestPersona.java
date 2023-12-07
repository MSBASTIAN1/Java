package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		
		Persona p;//1. Declaro una variable llamada p de tipo Persona
		p = new Persona();//2. Instanciar un objeto Persona, referenciarlo con p
		//3. Accedo a los atributos
		System.out.println("Nombre:"+ p.nombre);
		System.out.println("Edad:"+ p.edad);
		System.out.println("Estatura:"+ p.estatura);
		//P1
		System.out.println("----------------");
		Persona p1 = new Persona();
		p1.nombre = "Juan";
		p1.edad = 13;
		p1.estatura = 1.69;
		System.out.println("Nombre:"+p1.nombre);
		System.out.println("Edad:"+p1.edad);
		System.out.println("Estatura:"+p1.estatura);
		//P2
		System.out.println("----------------");
		Persona p2 = new Persona();
		p2.nombre = "Pepe";
		p2.edad = 20;
		p.estatura = 1.80;
		System.out.println("Nombre:"+p2.nombre);
		System.out.println("Edad:"+p2.edad);
		System.out.println("Estatura:"+p2.estatura);
		
	}

}
