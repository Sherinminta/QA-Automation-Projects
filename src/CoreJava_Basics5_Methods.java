
public class CoreJava_Basics5_Methods {
	
	//Create method with void return type
	public void method1() {
		System.out.println("Inside method1");
	}
	
	//Create method with int return type
	public int method2() {
		int a = 10;
		int b = 20;
		return a+b;
	}
	
	//Create method using static keyword
	public static int method3() {
		int c = 30;
		int d = 10;
		return c * d;
	}

	public static void main(String[] args) {
		
		//Access method1
		CoreJava_Basics5_Methods m1 = new CoreJava_Basics5_Methods();
		m1.method1();
		
		//Access method2
		CoreJava_Basics5_Methods m2 = new CoreJava_Basics5_Methods();
		int sum = m2.method2();
		System.out.println(sum);
		
		//Access method3
		int product = method3();
		System.out.println(product);
		
		//Access method4 from CoreJava_Basics6_Methods class
		CoreJava_Basics6_Methods m4 = new CoreJava_Basics6_Methods();
		String s = m4.method4();
		System.out.println(s);
	}

}
