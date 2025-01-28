package model.service;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		double fee = 0.02;
		return amount * fee;
	}

	@Override
	public double interest(double amount, int months) {
		double tax = 0.01 * months;
		return amount * tax;
	}
	
}
