

public class Bird extends Animal {

	protected boolean sings;
	protected boolean flies;

	public Bird() {

		super();
		sings = true;
		flies = true;

	}

	public void eat() {

		System.out.println("A birt eats insects ....");
	}

	public void sleep() {

		System.out.println("A bird sleeps in a nest ....");
	}

	public void fly() {

		System.out.println("A bird flies through the air ....");
	}	

	public String toString() {

		return " toString in bird ";
	}
}


