package coffee;

public class Cappuccino extends Coffee {
    public Cappuccino(int milkAmount, int groundCoffeeAmount) {
        super(milkAmount, groundCoffeeAmount);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino with ground coffee amount: "
                + groundCoffeeAmount
                + " and milk amount: "
                + milkAmount);
    }
}
