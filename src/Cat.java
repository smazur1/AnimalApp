
public class Cat extends Animal {

	protected boolean purrs;
	protected boolean runs;

	public Cat() {

		super();
		purrs = true;
		runs = true;
		System.out.println("A cat is created .... ");

	}

	public void eat() {

		System.out.println("A cat eats mice ....");
	}

	public void sleep() {

		System.out.println("A cat sleeps on a chair ....");
	}

}
