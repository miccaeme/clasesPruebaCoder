package com.coderhouse;

import java.util.Scanner;

public class ejercicio1 {
	//Ejercicios sobre variables y tipos de variables
	
	//1. Crear una variable entera que almacene la edad de un usuario
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* System.out.println("Hola, por favor ingrese su Nombre");
		
		String nomUser = scanner.toString(); */
		
		
		
		System.out.println("Por favor ingrese su edad");
		
		int edadUser = scanner.nextInt();
		
		System.out.println("Bienvenido " + "su edad es " +edadUser);
		
		
		
		scanner.close();

	}
	
	

}
