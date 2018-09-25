package thisex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.toString());
		
		Person p = noName.returnItSelf();
		System.out.println(p.toString());
	}

}
