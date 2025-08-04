
public class CoreJavaArrayAssignment {

	public static void main(String[] args) {
		
		//Create a new array called array4 to store 5 numerical values of your choice (they can be whole numbers or decimals)
		int[] array4 = new int[5];
		array4[0] = 10;
		array4[1] = 15;
		array4[2] = 20;
		array4[3] = 25;
		array4[4] = 30;
		
		//Print the first element of the array4 array.
		System.out.println(array4[0] +" is the first element of the array");
		
		//Print the last element of the array4 array
		System.out.println(array4[array4.length-1] +" is the last element of the array");
		
		//Using a loop print the elements of array4 in reverse order
		for(int i = array4.length-1; i >= 0; i--) {
			System.out.println(array4[i]);
		}
		
		//Calculate total number of elements in array4
		System.out.println(array4.length);
		
	}

}
