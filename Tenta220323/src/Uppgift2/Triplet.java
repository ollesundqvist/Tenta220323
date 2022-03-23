package Uppgift2;

public class Triplet<A, B, C> {
	private A fst;
	private B snd;
	private C trd;
	
	public Triplet(A fst, B snd, C trd) {
		this.fst = fst;
		this.snd = snd;
		this.trd = trd;
	}
	
	public A fst() {
		return this.fst;
	}
	
	public B snd() {
		return this.snd;
	}
	
	public C trd() {
		return this.trd;
	}
	
	public Triplet<C,B,A> mirror(){
		return new Triplet<C,B,A>(this.trd, this.snd, this.fst);
	}
	
	public String toString() {
		return "(" + this.fst.toString() + "," + this.snd.toString() + ", " + this.trd.toString() + ")";
	}
}
