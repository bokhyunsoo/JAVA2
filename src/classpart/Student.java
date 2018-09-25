package classpart;

public class Student {
	private int studentID; // 학번
	private String studentName; // 학생이름
	private int grade; // 학년
	private String address; // 사는 곳
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", grade=" + grade + ", address=" + address + "]";
	}
	
//	public static void main(String[] args) {
//		Student studentAhn = new Student();
////		studentAhn.studentName = "안명수";
//		studentAhn.setStudentName("안명수");
//		
//		System.out.println(studentAhn.getStudentName());
//		System.out.println(studentAhn.studentName);
//	}
}
