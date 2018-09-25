package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		int size = 0;
		
		data[size++] = 10.0;
		data[size++] = 20.0;
		data[size++] = 30.0;
		
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}

}
