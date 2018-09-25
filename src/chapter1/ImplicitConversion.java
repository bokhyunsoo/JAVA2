package chapter1;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum = fNum + iNum2;
		System.out.println(dNum);
		
		System.out.println("\n============================");
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
	
}
