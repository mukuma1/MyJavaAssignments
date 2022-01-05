
public class IfElseQ6 {

	public static void main(String[] args) {
		// Purchase discount calculation with or without promocode
		double MRP = 1355.67;
		int promoCode = 20;

		if (promoCode >= 0 & promoCode <= 5) {
			if (promoCode == 5) {
				System.out.println("Purchase Price after regular 50% discount & promo discount of 5%= "
						+ (MRP - 0.50 * MRP - 0.05 * MRP));
			} else
				System.out.println("Invalid PromoCode, Purchase Price after regular 50% discount= " + 0.50 * MRP);
		} else if (promoCode == 10) {
			System.out.println("Purchase Price after regular 50% discount & promo discount of 10% = "
					+ (MRP - 0.50 * MRP - 0.10 * MRP));
		} else if (promoCode == 20) {
			System.out.println("Purchase Price after regular 50% discount & promo discount of 20% = "
					+ (MRP - 0.50 * MRP - 0.20 * MRP));
		} else
			System.out.println("Invalid PromoCode, Purchase Price after regular 50% discount= " + 0.50 * MRP);

	}

}
