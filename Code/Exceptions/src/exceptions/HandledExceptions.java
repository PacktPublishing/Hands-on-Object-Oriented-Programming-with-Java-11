package exceptions;

public class HandledExceptions {

	public static void main(String[] args) {
		try {

			int data = 100 / 0;  //code that may raise exception
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
