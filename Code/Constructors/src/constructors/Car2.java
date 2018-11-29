//Default constructor(No argument Constructor)
package constructors;

public class Car2 {
	String name;
	Car2(){
		name= "BMW";
	}
	
	public static void main(String[] args) {
		Car2 carObj = new Car2();
		System.out.println(carObj.name);
	}
}
