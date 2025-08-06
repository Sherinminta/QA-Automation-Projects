
public class CoreJava_Basics4_StringOperations {

	public static void main(String[] args) {
		
		//Create string using String literal
		String s1 = "Eva Jenis Theres";
		
		//Create string using new keyword
		String s2 = new String("Ron Kevin George");
		
		//Split string s1 at whitespace
		s1.split(" ");
		
		//Store the splitted string into array
		String[] splitteds1 = s1.split(" ");
		
		//Print the splitted array
		System.out.println("Splitted s1 array:");
		System.out.println(splitteds1[0]);
		System.out.println(splitteds1[1]);
		System.out.println(splitteds1[2]);
		
		//Split s2 at Kevin
		s2.split("Kevin");
		String[] splitteds2 = s2.split("Kevin");
		System.out.println("Splitted s2 array:");
		System.out.println(splitteds2[0]);
		System.out.println(splitteds2[1]);
		
		//Trim white space from the output
		System.out.println("splitteds2 after removing whitespace");
		splitteds2[0].trim();
		splitteds2[1].trim();
		System.out.println(splitteds2[0].trim());
		System.out.println(splitteds2[1].trim());
		
		//Iterate through string s1
		System.out.println("Iterating through s1:");
		for(int i = 0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));	
		}
		
		//Print string s2 in reverse order
		System.out.println("Printing s2 in reverse order:");
		for(int i = s2.length()-1; i >= 0; i--) {
			System.out.println(s2.charAt(i));
		}


	}

}
