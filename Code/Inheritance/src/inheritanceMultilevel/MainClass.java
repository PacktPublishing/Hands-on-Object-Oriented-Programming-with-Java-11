package inheritanceMultilevel;

public class MainClass {

	public static void main(String[] args) {
		
		TwoWheeler twoWheelerObj = new TwoWheeler();
		twoWheelerObj.name="hero";
		twoWheelerObj.color="black";

		System.out.println("no of Wheels: "+ twoWheelerObj.noOfWheels);
		System.out.println("name : "+ twoWheelerObj.name);
		System.out.println("color : "+ twoWheelerObj.color);
	}
}
