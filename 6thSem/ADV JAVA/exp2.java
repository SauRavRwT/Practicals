//2. wap to demonstrate multiple implementstions using interfaces.

interface Walkable {
	void walk();
}

interface Swimmable {
	void swim();
}

class Duck implements Walkable, Swimmable {
	public void walk() {
		System.out.println("Duck is walking.");
	}

	public void swim() {
		System.out.println("Duck is swimming.");
	}
}

class exp2 {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.walk();
		duck.swim();
	}
}
