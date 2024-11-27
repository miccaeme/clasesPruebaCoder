package com.coderhouse;

import java.util.Scanner;

public class ejercicio3 {
	//Declarar una variable de tipo double para almacenar el precio de un producto.
	
	private String nombreProducto;
	private Double precioProducto= 0.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de un producto");
		String nombreProducto = scanner.next();
		
		System.out.println("Ingrese el precio");
		
		Double precioProducto = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("El precio del producto " + nombreProducto + " es $ " + precioProducto);

	}

}
