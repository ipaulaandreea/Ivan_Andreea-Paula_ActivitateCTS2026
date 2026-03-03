package factory;

import coffee.Cappuccino;
import coffee.Coffee;

public class CappuccinoFactory implements CoffeeTypeFactory{
    @Override
    public Coffee createCoffe(int groundCoffeeAmount, int milkAmount) {
        return new Cappuccino(milkAmount, groundCoffeeAmount);
    }
}
