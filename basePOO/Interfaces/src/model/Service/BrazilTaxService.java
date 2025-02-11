package model.Service;

public class BrazilTaxService implements TaxService {

	public double tax(double amount) {
		double taxHour = 0.2;
		double taxDay = 0.15;
		
		return amount = (amount <= 100.00) ? amount * taxHour : amount * taxDay;
	}

}
