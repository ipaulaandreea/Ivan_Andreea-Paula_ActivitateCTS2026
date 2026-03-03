import coffee.Coffee;
import factory.AmericanoFactory;
import factory.CappuccinoFactory;
import factory.CoffeeTypeFactory;
import factory.LatteFactory;

public static void printCoffee(CoffeeTypeFactory factory, int milkAmount, int groundCoffeeAmount){
    Coffee coffee = factory.createCoffee(groundCoffeeAmount, milkAmount);
    coffee.prepare();
}

void main() {
    printCoffee(new CappuccinoFactory(), 100, 18);
    printCoffee(new AmericanoFactory(), 150, 0);
    printCoffee(new LatteFactory(), 18, 250);
}