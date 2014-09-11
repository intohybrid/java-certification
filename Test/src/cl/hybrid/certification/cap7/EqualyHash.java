package cl.hybrid.certification.cap7;

import java.util.Map;
import java.util.HashMap;

public class EqualyHash {

	public static void main (String[] args){
		
		Map<Indice, String> map = new HashMap<Indice,String>();
		map.put(new Indice(1), "a");
		map.put(new Indice(2), "b");
		map.put(new Indice(3), "c");
		map.put(new Indice(1), "d");
		
		System.out.println(map.size());
		
		
	}
	
	
}

class Indice{
	Integer indice;
	Indice(int i){
		indice = i;
	}
	public boolean equals(Object ind){
		return ((Indice)ind).indice.equals(indice);
	}
	
	public int hashCode(){
		return 9;
	}
}