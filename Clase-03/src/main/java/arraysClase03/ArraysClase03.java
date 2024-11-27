package arraysClase03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClase03 {

	public static void main(String[] args) {
		int [] numerosEnteros = new int [6];
		
		numerosEnteros [0]= 3;
		numerosEnteros [1]= 10;
		numerosEnteros [3]= 6;
		
		
		System.out.println(" "+ numerosEnteros[2]);
		System.out.println("tenemos " + numerosEnteros.length + " de elementos");
		System.out.println("imprimos todo el array " + Arrays.toString(numerosEnteros));

		//declaramos otro array de palabras
		
		String [] palabras = {
				"Hola",
				"como va",
				"estamos en clase"
				
		};
		
		System.out.println("Cantidad de elementos" + palabras.length);
		System.out.println(" Impriimo todo el array: " + Arrays.toString(palabras));
		
		
		// arrayList
		
		List<String> listaDeNombres = new ArrayList<>();
		List<String> listaDeNombres2 = new ArrayList<>();
		
		listaDeNombres.add("Micaela");
		listaDeNombres.add("Luca");
		listaDeNombres.add("Aljandro");
		listaDeNombres.add("Sara");
		
		listaDeNombres2.add("Rodrigo");
		listaDeNombres2.add("Alejandra");
		listaDeNombres2.add("Milagros");
		listaDeNombres2.add("Carmen");
		
		System.out.println("cantidad De Elementos del array List " + listaDeNombres.size());
		System.out.println("Mostrar el contenido");
		
		listaDeNombres.addAll(listaDeNombres2);
		
		System.out.println("cantidad De Elementos de los dos array List " + listaDeNombres.size());
		
		
		//recorrer la lista
		
		for (String nombre : listaDeNombres ) {
			System.out.println("Nombre: " + nombre);
		}
	}

}
