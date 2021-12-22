
public class IncrementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;

		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);

		System.out.println(a++);
		System.out.println(a++);

		System.out.println(a--);
		System.out.println(a--);

		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a--);

		if (a > 0) {
			System.out.println("Final value of a=" + a + " and is greater than zero.");
		}
		if (a < 0) {
			System.out.println("Final value of a=" + a + " and less than zero.");
		}
		if (a == 0) {
			System.out.println("a is equal to zero.");
		}

		// Using boolean

		boolean comparison = (a > 0);
		System.out.println("Final value of a is greater than zero:" + comparison);

	}

}
