//Parameterized Constructors

package constructors;
public class Car3 {
	String name;
	Car3(String name){
		this.name= name;
	}	
	public static void main(String[] args) {
		Car3 carObj = new Car3("BMW");
		System.out.println(carObj.name);
	}
}