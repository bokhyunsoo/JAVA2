package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum()); // 1001
		System.out.println(studentLee.getStudentName() + " 학번: " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum()); // 1002
		System.out.println(studentSon.getStudentName() + " 학번: " + studentSon.studentID);
	}

}
