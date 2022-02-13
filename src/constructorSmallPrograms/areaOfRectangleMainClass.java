package constructorSmallPrograms;

public class areaOfRectangleMainClass {

	public static void main(String[] args) {

		areaofRectangle obj = new areaofRectangle();
		System.out.println("Area before assigning values to length & bredth: "+obj.calculateArea());
		areaofRectangle obj1=new areaofRectangle(10, 15);
		System.out.println("Area: "+obj1.calculateArea());
	}

}
