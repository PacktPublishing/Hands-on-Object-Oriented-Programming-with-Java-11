package encapsulation;

class Car {

	private String carName = "BMW";

	public String getCarName() {
		return this.carName;
	}
	
	public void setCarName(String name) {
		this.carName =name;
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("car name is :"+car.getCarName());

		car.setCarName("TVS");
		System.out.println("car name is :"+car.getCarName());
	}
}
