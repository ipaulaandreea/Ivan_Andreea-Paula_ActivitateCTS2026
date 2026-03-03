package factory;

import coffee.Americano;
import coffee.Coffee;

public class AmericanoFactory implements CoffeeTypeFactory {
    @Override
    public Coffee createCoffee(int groundCoffeeAmount, int milkAmount) {
        return new Americano(milkAmount, groundCoffeeAmount);
    }
}
