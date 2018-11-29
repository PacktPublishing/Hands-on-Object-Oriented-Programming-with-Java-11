package abstraction;

abstract class Calculator {

	abstract void add();
	
	void multiply() {
		System.out.println("2 x 5 = "+2*5);
	}
}

class MyCalc extends Calculator {

	@Override
	void add() {
		System.out.println("2 + 5 = "+2+5);
	}

}

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal = new MyCalc();
		cal.add();
		cal.multiply();
		
	
	}
}
