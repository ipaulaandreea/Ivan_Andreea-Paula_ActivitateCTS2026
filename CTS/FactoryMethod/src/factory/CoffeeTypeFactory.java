package factory;

import coffee.Coffee;

public interface CoffeeTypeFactory {
    Coffee createCoffee(int groundCoffeeAmount, int milkAmount);
}
