package Dollar;

public class dollar {

	double priceDollar;
	double quantityDollar;
	
	public static double dollarConversion(double priceDollar, 
			double quantityDollar) {
		return (priceDollar * quantityDollar) 
				+ (priceDollar * quantityDollar * 0.06);
	}

}
