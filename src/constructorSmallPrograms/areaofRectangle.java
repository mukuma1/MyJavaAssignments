package constructorSmallPrograms;

public class areaofRectangle {
	int length;
	int bredth;
	int area;
	

	public areaofRectangle() {
		
	}
	
	public areaofRectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}


	int calculateArea() {
		area=length * bredth;
		return area;
	}

}
