package constructor;

public class Person {
	private String name;
	private float height;
	private float weight;
	
	public Person() {
	}

	public Person(String pname) {
		name = pname;
	}

	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight + 10;
	}

	@Override
	public String toString() {
		return "이름은" + name + "입니다. 그리고 키는" + height + "이고 몸무게는" + weight + "입니다.";
	}
	
}
