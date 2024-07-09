package org.prince.in;

public class AnotherStudent {

	private Mathcheat cheat;
	
	public AnotherStudent() {
		System.out.println("AnotherStudent Constructor called.......");
	}

	public Mathcheat getCheat() {
		return cheat;
	}

	public void setCheat(Mathcheat cheat) {
		System.out.println("AnotherStudent setCheat method called....");
		this.cheat = cheat;
	}


	@Override
	public String toString() {
		return "AnotherStudent [mathcheat=" + cheat + "]";
	}
	
}
