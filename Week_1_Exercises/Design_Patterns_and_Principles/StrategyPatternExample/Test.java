public class Test{
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Amar Singh");
        PaymentContext context = new PaymentContext(creditCardPayment);
        context.executePayment(1500.00);

        PaymentStrategy payPalPayment = new PayPalPayment("amar.singh@example.com");
        context = new PaymentContext(payPalPayment);
        context.executePayment(2000.00);
    }
}