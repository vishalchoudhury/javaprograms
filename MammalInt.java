package Animals;

public class MammalInt implements Animal {
	public void eat() {
		System.out.println("Animals can eat");
	}

	public void travel() {
		System.out.println("Animals can travel");
	}

	public static void main(String args[]) {
		MammalInt mammal = new MammalInt();
		mammal.eat();
		mammal.travel();
	}
}
