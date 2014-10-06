package cl.hybrid.certification.cap7;

import java.util.TreeMap;
import java.util.SortedMap;


public class TreeMapMethods {

	public static void main(String[] args){
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("a","a");
		map.put("d","d");
		map.put("f","f");
		map.put("p","p");
		
		System.out.println(map.higherKey("f")); // aca deberia mostrar P
		System.out.println(map.ceilingKey("f")); // aca F porque ceiling contempla >=
		System.out.println(map.floorKey("f")); // aca f tambien porque floor deberia ser <=
		
		SortedMap<String,String> sorted = map.tailMap("f");
		System.out.println(sorted.firstKey()); // el map debe estar compuesto por FP la first key deberia ser f
		
	}
	
}
