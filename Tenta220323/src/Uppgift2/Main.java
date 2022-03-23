package Uppgift2;


public class Main {
	
	public static void main(String[] args) {
		Triplet<String, String, Integer> fst = new Triplet<String, String, Integer>("Hej", "då", 20);
		Triplet<String, String, Integer> snd = new Triplet<String, String, Integer>("Då", "Hej", 23);
		
		System.out.println(fst.toString());
		System.out.println(snd.toString());
		System.out.println((fst.mirror().toString()));
	}
	
}
