package methodoverloading;
public class Calculator {

	/* diff no of parameeters*/
	void addNumbers(int a , int b) {
		int x = a+b;
		System.out.println("a + b = "+x);
	}
	
	void addNumbers(int a , int b, int c) {
		int x = a+b+c;
		System.out.println("a + b = "+x);
	}
	
	
	/* diff Types of parameters*/
	void multiplyNumbers(int a , int b) {
		int x = a+b;
		System.out.println("a + b = "+x);
	}
	
	void multiplyNumbers(double a , double b) {
		double x = a+b;
		System.out.println("a + b = "+x);
	}
	
}
