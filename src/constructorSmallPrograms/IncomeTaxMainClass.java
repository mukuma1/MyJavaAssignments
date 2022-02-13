package constructorSmallPrograms;

public class IncomeTaxMainClass {

	public static void main(String[] args) {
	IncomeTax person1=new IncomeTax(56000);
	System.out.println("Income Tax of person1: "+ person1.taxCalculataion());
	
	IncomeTax person2=new IncomeTax(47000);
	System.out.println("Income Tax of person1: "+ person2.taxCalculataion());
	}

}
