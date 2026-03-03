package coffee;

public class Latte extends Coffee{
    public Latte(int milkAmount, int groundCoffeeAmount) {
        super(milkAmount, groundCoffeeAmount);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Latte with ground coffee amount: "
                + groundCoffeeAmount
                + " and milk amount: "
                + milkAmount);
    }
}
