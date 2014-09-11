package cl.hybrid.certification.cap7;

import java.util.Comparator;
import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args){
		
		String[] textos = {"uno","dos","tres"};
		System.out.println(textos.toString());
		Arrays.sort(textos,new Ordenar());
		System.out.println(textos.toString());
		
		
		
		
	}
	
	
	private <T>void imprimir(T[] arreglo){
		for(){
			
		}
	}
}


class Ordenar implements Comparator<String>{
	public int compare(String a, String b){
		return b.compareTo(a);
	}
}