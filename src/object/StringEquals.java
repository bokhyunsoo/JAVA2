package object;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		int j1 = 100;
		int j2 = 100;
		if(j1 == j2) System.out.println("j1과 j2는 같습니다.");
		else System.out.println("j1과 j2는 같지 않습니다.");
	}
	
}
