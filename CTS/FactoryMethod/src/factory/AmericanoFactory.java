package factory;

import coffee.Americano;
import coffee.Coffee;

public class AmericanoFactory implements CoffeeTypeFactory {
    @Override
    public Coffee createCoffe(int groundCoffeeAmount, int milkAmount) {
        return new Americano(milkAmount, groundCoffeeAmount);
    }
}
