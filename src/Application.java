
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am very tired");
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		System.out.println(c.calculateArea());
		
		Circle c2 = new Circle(2.3);
		System.out.println(c2.toString());
		System.out.println(c2.calculateArea());
		
		Circle c3 = new Circle(-.76);
		System.out.println(c3.toString());
		System.out.println(c3.calculateArea());
		

	}//end main

}//end class
