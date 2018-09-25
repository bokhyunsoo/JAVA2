package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.setName("김유신");
		personKim.setWeight(85.5f);
		personKim.setHeight(180.0f);
		Person personLee = new Person("이순신",175,75);
		
		System.out.println(personKim.toString());
		System.out.println(personLee.toString());
	}

}
