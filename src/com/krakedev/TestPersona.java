package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// Esto es un comentario
		
		Persona p;//1. Declaro una variable llamada p de tipo Persona
		p = new Persona();//2. Instanciar un objeto Persona, referenciarlo con p
		//3. Accedo a los atributos
		System.out.println("Nombre:"+ p.getNombre());
		System.out.println("Edad:"+ p.getEdad());
		System.out.println("Estatura:"+ p.getEstatura());
		//P1
		System.out.println("----------------");
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setEdad(13);
		p1.setEstatura(1.68);
		System.out.println("Nombre:"+p1.getNombre());
		System.out.println("Edad:"+p1.getEdad());
		System.out.println("Estatura:"+p1.getEstatura());
		//P2
		System.out.println("----------------");
		Persona p2 = new Persona();
		p2.setNombre("Pepe");
		p2.setEdad(20);
		p2.setEstatura(1.80);
		System.out.println("Nombre:"+p2.getNombre());
		System.out.println("Edad:"+p2.getEdad());
		System.out.println("Estatura:"+p2.getEstatura());
		
		System.out.println("----------------");
		Persona p4 = new Persona("Rocio",15,1.40);
		System.out.println("Nombre:"+p4.getNombre());
		System.out.println("Edad:"+p4.getEdad());
		System.out.println("Estatura:"+p4.getEstatura());
		
	}

}
