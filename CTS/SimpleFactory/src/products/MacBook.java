package products;

public class MacBook extends AppleProduct{

    public MacBook(int latestVersion, double price) {
        super(latestVersion, price);
    }

    @Override
    public String displaySpecs() {
            return "MacBook{" +
                    "latestVersion=" + latestVersion +
                    ", price=" + price +
                    '}';
    }
}
