package cl.hybrid.certification.cap7;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class Colas {

	public static void main(String[] args){
		
		
		
		Queue<Integer> cola = new PriorityQueue<Integer>(2, new Comparator<Integer>() {
			public int compare(Integer a, Integer b){
				return a.compareTo(b);
			}
		});

		cola.offer(30);
		cola.add(5);
		cola.add(10);
		cola.add(25);
		cola.add(20);
		cola.add(15);
		cola.offer(30);
		
		while (cola.peek() != null){
			System.out.println(cola.poll());
		}
		
		/*
		Iterator<Integer> iterador = cola.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
		*/
		
	}
	
}


