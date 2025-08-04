
public class CoreJavaBasics2 {

	public static void main(String[] args) {
		
		int[] array3 = {28, 39, 44, 77, 56, 85, 88};
		
		//Find multiples of 2 from an array
		for(int i = 0; i<array3.length; i++) {
			if(array3[i] % 2 == 0) {
				System.out.println(array3[i]+ " is a multiple of 2");
			}
			else {
				System.out.println(array3[i]+ " is not a multiple of 2");
			}
		}
		
		//Check whether the array has a multiples of 2
		for(int i = 0; i<array3.length; i++) {
			if(array3[i] % 2 == 0) {
				System.out.println(array3[i]+ " is the first multiple of 2 found from the array");
				break;
			}
			else {
				System.out.println(array3[i]+ " is not a multiple of 2");
			}
		}

	}

}
