
public class CoreJava_Basics1_Array {

	public static void main(String[] args) {
		
		//Declaring variables
		String name = "Sherinminta Jose";
		int age = 28;
		char letter = 'A';
		boolean value = true;
		double height = 150.90;
		
		//Printing the values
		System.out.println("Value stored in name variable is "+name);
		System.out.println("Value stored in age variable is "+age);
		System.out.println("Value stored in letter variable is "+letter);
		System.out.println("Value stored in value variable is "+value);
		System.out.println("Value stored in height variable is "+height);
		
		//Creating and initializing array - Method 1 - If values are not known initially
		int[] array1 = new int[5];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		
		//Creating and initializing array - Method 2 - If values are known initially
		String[] array2 = {"Eva", "Ron", "Haezal", "Norah"};
		
		//Accessing third element from array1
		System.out.println("Third value of array1 is "+array1[2]);
		
		//Printing all the elements in array2
		for(int i = 0; i < array2.length; i++) {
			
			System.out.println("The value at index "+i+ " is " +array2[i]);
			
		}
		
		//Printing all the elements from array1 using enhanced for loop
		for(int a : array1) {
			
			System.out.println(a);
			
		}
		

	}

}
