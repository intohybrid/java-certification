package cl.hybrid.certification.cap8;

public class Car {

	class Engine{
		Engine(){System.out.println("constr");;}
		{ Car.this.drive();}
	}
	
	public static void main(String[] args){
		new Car().go();
	}
	
	void go(){
		new Engine();
	}
	
	void drive(){
		System.out.println("hi");
	}
}
