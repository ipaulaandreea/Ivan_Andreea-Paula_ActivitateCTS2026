package factory;

import coffee.Coffee;

public interface CoffeeTypeFactory {
    Coffee createCoffe(int groundCoffeeAmount, int milkAmount);
}
