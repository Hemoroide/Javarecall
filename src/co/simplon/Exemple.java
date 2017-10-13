package co.simplon;

public class Exemple {
	
	public static String helloWorld(String name) {
		String message;
		if (name == "")
			message = "Hello World";
		else 
			message = "Hello " + name;
		return message;
	}
	
	
}
