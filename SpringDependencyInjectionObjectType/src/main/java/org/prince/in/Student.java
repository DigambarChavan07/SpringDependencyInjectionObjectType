package org.prince.in;

public class Student {

	private int id;
	private Mathcheat mathcheat;
	
	public Student() {
		System.out.println("Student Constructor is created........");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		System.out.println("Student setId method called....");
		this.id = id;
	}

	public void setMathcheat(Mathcheat mathcheat) {
		System.out.println("Student setMathcheat method called....");
		this.mathcheat = mathcheat;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", mathcheat=" + mathcheat + "]";
	}
		
}

