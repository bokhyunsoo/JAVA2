package polymorphism;

interface Animal {
	public void move();
}

class Human implements Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger implements Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle implements Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
//		aTest.moveanimal(new Animal());
		aTest.moveanimal(new Human());
		Tiger tiger = new Tiger();
		aTest.moveanimal(tiger);
		aTest.moveanimal(new Eagle());
	}

	public void moveanimal(Animal animal) {
		animal.move();
	}
}
