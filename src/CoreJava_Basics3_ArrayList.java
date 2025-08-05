import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava_Basics3_ArrayList {

	public static void main(String[] args) {
		
		//Creating ArrayList of String Data type
		ArrayList <String> a = new ArrayList<String>();
		
		//Adding elements to an ArrayList
		a.add("Learning");
		a.add("Selenium");
		a.add("Basics");
		a.add("Is");
		a.add("Very");
		a.add("Interesting");
		
		//Getting element from an arraylist
		a.get(2);
		System.out.println(a.get(2));
		
		//Iterating through arraylist using for loop
		System.out.println("Iterating through arraylist using simple for loop");
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));			
		}
		
		System.out.println("Iterating through arraylist using enhanced for loop");
		for(String s : a) {
			System.out.println(s);
		}
		
		//Check whether Selenium is present in the arrayList
		System.out.println(a.contains("Selenium"));
		
		//Create an array, convert it to arraylist and check whether the string Java is present
		String[] array5 = new String[5];
		array5[0] = "This";
		array5[1] = "Is";
		array5[2] = "A";
		array5[3] = "Java";
		array5[4] = "Program";
		List <String> Array5ToList = Arrays.asList(array5);
		System.out.println(Array5ToList.contains("Java"));
	
	}

}
