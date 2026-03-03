package factory;

import coffee.Coffee;
import coffee.Latte;

public class LatteFactory implements CoffeeTypeFactory{
    @Override
    public Coffee createCoffee(int groundCoffeeAmount, int milkAmount) {
        return new Latte(milkAmount,groundCoffeeAmount);
    }
}
