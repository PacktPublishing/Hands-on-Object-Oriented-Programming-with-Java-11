package methodoverloading;

public class MainClass {

	public static void main(String[] args) {
		Calculator calcObj = new Calculator();
		
		calcObj.addNumbers(5, 6);
		calcObj.addNumbers(1, 2, 3);
		
		calcObj.multiplyNumbers(2, 3);
		calcObj.multiplyNumbers(2.2, 5.5);
	
	}
}
