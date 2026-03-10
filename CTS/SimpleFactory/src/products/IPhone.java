package products;

public class IPhone extends AppleProduct{

    public IPhone(int latestVersion, double price) {
        super(latestVersion, price);
    }

    @Override
    public String displaySpecs() {
            return "iPhone{" +
                    "latestVersion=" + latestVersion +
                    ", price=" + price +
                    '}';
        }
    }
