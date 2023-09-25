
public class CreditCardPayment implements PaymentStrategy {


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid by credit card: " + amount);
	}

}
