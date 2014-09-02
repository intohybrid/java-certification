package cl.hybrid.certification.cap6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions {

	public static void main (String[] args){
		
		Pattern p = Pattern.compile(args[0]);
		Matcher m = p.matcher(args[1]);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		while(m.find()){
			System.out.println(m.start() + " - " + m.end() + " - "+ m.group());
		}
		
	}
	
}
