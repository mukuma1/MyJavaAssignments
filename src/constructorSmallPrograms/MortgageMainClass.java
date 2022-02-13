package constructorSmallPrograms;

public class MortgageMainClass {

	public static void main(String[] args) {
	Mortgage obj1= new Mortgage(3.5, 530000);
	System.out.println("Interest accured on borrowed money monthly for person1: "+obj1.monthlyInterestCalculation());
	Mortgage obj2= new Mortgage(4.3, 470000);
	System.out.println("Interest accured on borrowed money monthly for person2: "+obj2.monthlyInterestCalculation());
	}

}
