package coffee;

public class Americano extends Coffee {

    public Americano(int milkAmount, int groundCoffeeAmount) {
        super(milkAmount, groundCoffeeAmount);


    }

    @Override
    public void prepare() {
        System.out.println("Preparing Americano with ground coffee amount: "
                + groundCoffeeAmount
                + " and milk amount: "
                + milkAmount);
    }
}
