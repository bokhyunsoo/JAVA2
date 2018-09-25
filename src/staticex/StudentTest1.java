package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.serialNum);
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.serialNum);
	}

}
