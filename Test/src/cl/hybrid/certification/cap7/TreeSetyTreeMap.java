package cl.hybrid.certification.cap7;

import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetyTreeMap {

	public static void main(String[] args) {

		Set<Integer> treeSet = null;
		TreeMap<Integer, String> treeMap =  new TreeMap<Integer, String>();
		
		//treeSet.add(1);treeSet.add(2);treeSet.add(3);treeSet.add(4);treeSet.add(5);
		
		treeMap.put(1, "uno");
		treeMap.put(2, "dos");
		treeMap.put(3, "tres");
		treeMap.put(4, "cuatro");
		treeMap.put(5, "cinco");
		treeMap.put(10, "diez");
		
		System.out.println(treeMap.ceilingEntry(3)); //el más cercano hacia arriba o igual
		System.out.println(treeMap.higherEntry(3)); // el más cercano hacia arriba NO igual
		System.out.println(treeMap.higherKey(3));//Solo la llave 
		System.out.println(treeMap.floorEntry(5));
		System.out.println("floor " + treeMap.floorKey(5));
		System.out.println(treeMap.lowerEntry(5));//al igual que higher, no se cuenta si es igual
		
		System.out.println(treeMap);
		
		treeMap.pollFirstEntry();
		System.out.println(treeMap);
		
		treeMap.pollLastEntry();
		System.out.println(treeMap);
		
		NavigableMap<Integer, String> navigableMap = treeMap.descendingMap(); 
		
		System.out.println(navigableMap);
		
		treeSet = new TreeSet(treeMap.keySet());
		
		System.out.println(treeSet);

		
		TreeSet<Dog> perros = new TreeSet<Dog>();
		//perros.add(new Dog(1));
		//perros.add(new Dog(2));
		//perros.add(new Dog(1));

	}

}


class Dog extends Object{
	int edad;
	Dog(int e){
		edad = e;
	}
}