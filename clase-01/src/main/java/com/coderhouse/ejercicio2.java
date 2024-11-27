package com.coderhouse;

import java.util.Scanner;

public class ejercicio2 {
	//2. Definir una constante para el numero de dias en una semana.
	private static final int LUNES= 1;
	private static final int MARTES = 2;
	private static final int MIERCOLES = 3;
	private static final int JUEVES = 4;
	private static final int VIERNES = 5;
	private static final int SABADO = 6;
	private static final int DOMINGO = 7;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese el dia de la semana");
		System.out.println(LUNES + ". Lunes");
		System.out.println(MARTES + ". Martes");
		System.out.println(MIERCOLES +". Miercoles");
		System.out.println(JUEVES + ". Jueves");
		System.out.println(VIERNES + ". Viernes");
		System.out.println(SABADO +". Sabado");
		System.out.println(DOMINGO + ". Domingo");
		
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case LUNES:
			System.out.println("Ingreso el dia 1 que es LUNES");
			break;
		case MARTES:
			System.out.println("Ingreso el dia 2 que es MARTES");
			break;
		case MIERCOLES:
			System.out.println("Ingreso el dia 3 que es MIERCOLES");
			break;
		case JUEVES:
			System.out.println("Ingreso el dia 4 que es JUEVES");
			break;
		case VIERNES:
			System.out.println("Ingreso el dia 5 que es VIERNES");
			break;
		case SABADO:
			System.out.println("Ingreso el dia 6 que es SABADO");
			break;
		case DOMINGO:
			System.out.println("Ingreso el dia 7 que es DOMINGO");
			break;
		default:
			System.out.println("No ingreso un día correcto");
			scanner.close();
				
		}
		
		

	}



}
