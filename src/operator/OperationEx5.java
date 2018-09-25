package operator;

public class OperationEx5 {

	public static void main(String[] args) {
//		정수형  앞자리에 넣는 값으로 진수를 표현한다고 합니다.  
//		int a =123; 이러면  10진수 123
//		int a =0123; 이러면  8진수 123
//		int a =0x123; 이러면  16진수 123
//		int a =0b0101; 이러면  2진수 0101
//		8421
//		0101
		int num = 0B000000101;
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num <<= 2;
		// num = num << 2;  // num <<= 2
		// num = num + 1; // num += 1
		System.out.println(num);
	}

}
