package cl.hybrid.certification.cap7;

import java.util.PriorityQueue;

public class ColaPrioritaria {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("2");
		pq.add("4");
		System.out.println(pq.peek());

		pq.offer("1");
		pq.add("3");
		
		System.out.println(pq.toString());
		
		pq.remove("1");
		System.out.println(pq.poll());
		
		if(pq.remove("2")){
			System.out.println(pq.poll());
		}
		
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
		pq.remove("2");
		System.out.println(pq.toString());
	}

}
