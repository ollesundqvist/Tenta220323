package Uppgift5;


public class Main {

	public static void main(String[] args) {
		BlackBox<String> BB = new BlackBox<String>();
		
		BB.add("då!");
		BB.add("&");
		BB.add("Hej");
		
		System.out.println(BB.toString());

	}

}
