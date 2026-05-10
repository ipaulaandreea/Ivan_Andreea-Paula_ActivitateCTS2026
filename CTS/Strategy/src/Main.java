public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CardPayment());

        context.executePayment(100);

        context.setPaymentStrategy(new CashPayment());
        context.executePayment(50);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200);
    }
}