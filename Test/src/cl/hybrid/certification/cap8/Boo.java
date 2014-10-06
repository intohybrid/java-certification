package cl.hybrid.certification.cap8;

public class Boo {
	
	Boo(){}
	Boo(String s){}

	static class Bar extends Boo {
		Bar(){}
		Bar(String s){}
		
		void zoo(){
			Boo.Bar f = new Boo.Bar(){
				
			};
		}
	}
}