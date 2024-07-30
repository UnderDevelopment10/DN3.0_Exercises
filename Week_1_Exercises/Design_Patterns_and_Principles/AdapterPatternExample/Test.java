public class Test {
    public static void main(String[] args) {
        Paytm payPal = new Paytm();
        PhonePe stripe = new PhonePe();

        PaymentProcessor payPalAdapter = new PaytmAdapter(payPal);
        PaymentProcessor stripeAdapter = new PhonePeAdapter(stripe);

        payPalAdapter.processPayment(100.00);
        stripeAdapter.processPayment(200.00);
    }
}
