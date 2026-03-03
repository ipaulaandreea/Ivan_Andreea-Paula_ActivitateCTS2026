package coffee;

public abstract class Coffee {

    protected int milkAmount;
    protected int groundCoffeeAmount;

    public Coffee(int milkAmount, int groundCoffeeAmount){
        this.groundCoffeeAmount = groundCoffeeAmount;
        this.milkAmount = milkAmount;
    }

    public abstract void prepare();
}
