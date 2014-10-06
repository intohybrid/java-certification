package cl.hybrid.certification.cap9;

import java.lang.Thread;
import java.lang.Runnable;

public class JoinTest {

	public static void main(String[] args){
	
		Thread hilo1 = new Thread(new MiRunnable());
		Thread hilo2 = new Thread(new MiRunnable());
		
		hilo1.setName("Hilo1");
		hilo2.setName("Hilo2");
		
		hilo1.setPriority(10);
		hilo2.setPriority(1);
		
		hilo1.start();
		hilo2.start();
		
	}
	
	
	
}


class MiRunnable implements Runnable{
	public void run(){

		for (int i = 0; i< 50; i++) {
			System.out.println(Thread.currentThread().getName() + " i = "+i);
		}
	
	}
}

