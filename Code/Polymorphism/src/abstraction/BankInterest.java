/*********POLYMORPHISM **********/
package abstraction;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class BankInterest {
	public static void main(String args[]) {
		Bank bank;
		bank = new SBI();
		System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + " %");
		bank = new PNB();
		System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + " %");
	}
}
