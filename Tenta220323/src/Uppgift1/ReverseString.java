package Uppgift1;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Olle";
		
		System.out.println(reverse(s));
		
	}
	
	public static String reverse(String s) {
		return(s.length() == 1 ? s :  Character.toString(s.charAt(s.length()-1)) + reverse(s.substring(0, s.length()-1)));
	}


}
