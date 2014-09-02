package cl.hybrid.certification.cap7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConverArraysList {

	public static void main(String[] args) {
	
		Integer[] arreglo = {1,3,5,7,9};
		
		for (int i = 0; i < arreglo.length; i++ ) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("========================");
		
		List<Integer> lista = Arrays.asList(arreglo);
		for(Integer valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println("===========Cambio valor=============");
		
		arreglo[0]= 1000;
		
		for(Integer valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println("===========Cambio valor=============");
		lista.set(1, 3000);
		
		for (int i = 0; i < arreglo.length; i++ ) {
			System.out.println(arreglo[i]);
		}
		
		
		System.out.println("===========la lista a un nuevo areglo =======");
		
		Integer[] nuevoArreglo = (Integer[])lista.toArray();
		for (int i = 0; i < nuevoArreglo.length; i++ ) {
			System.out.println(nuevoArreglo[i]);
		}
		
		System.out.println("===========Cambio valor=============");
		
		nuevoArreglo[2] = 5000;
		
		for(Integer valor : lista) {
			System.out.println(valor);
		}
		
		Arrays.sort(nuevoArreglo, new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return a.compareTo(b);
			}
		});
		
		System.out.println("===========nuevo orden=============");
		for (int i = 0; i < nuevoArreglo.length; i++ ) {
			System.out.println(nuevoArreglo[i]);
		}
		System.out.println(Arrays.binarySearch(nuevoArreglo, 3000));
		
		
		
		
		

	}

}
