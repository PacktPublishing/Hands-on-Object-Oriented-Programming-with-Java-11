package inheritanceHierarchical;

public class MainClass {

	public static void main(String[] args) {
		
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.name="Skoda";
		fourWheeler.color="black";

		System.out.println("no of Wheels: "+ fourWheeler.noOfWheels);
		System.out.println("name : "+ fourWheeler.name);
		System.out.println("color : "+ fourWheeler.color);
	}
}
