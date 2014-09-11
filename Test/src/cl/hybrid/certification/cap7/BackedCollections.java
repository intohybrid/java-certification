package cl.hybrid.certification.cap7;

import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Map;


public class BackedCollections {

	
	public static void main(String[] args){
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		SortedMap<Integer,String> subTreeMap = null;
		SortedMap<Integer,String> subTreeMapTail = null;
		SortedMap<Integer,String> subTreeMapHeader = null;
		
		treeMap.put(1,"uno");
		treeMap.put(2,"dos");
		treeMap.put(3,"tres");
		treeMap.put(4,"cuatro");
		treeMap.put(5,"cinco");
		treeMap.put(6,"seis");
		
		subTreeMap = treeMap.subMap(3, 10);
		
		imprime(subTreeMap);
		subTreeMap.put(7, "siete");
		imprime(subTreeMap,treeMap);
		treeMap.remove(4);
		imprime(subTreeMap,treeMap);
		
		
		subTreeMapHeader = treeMap.headMap(3,true);
		subTreeMapTail = treeMap.tailMap(6);
		imprime(subTreeMapHeader,subTreeMapTail,subTreeMap);

	}
	
	private static void imprime(Map<Integer, String>... maps){
		for(Map<Integer,String> map : maps){
			System.out.println(map);
		}
		
	}
}
