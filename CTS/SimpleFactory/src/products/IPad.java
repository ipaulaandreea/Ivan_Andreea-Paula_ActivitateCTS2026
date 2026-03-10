package products;

public class IPad extends AppleProduct{

    public IPad(int latestVersion, double price) {
        super(latestVersion, price);
    }

    @Override
    public String displaySpecs() {
            return "iPad{" +
                    "latestVersion=" + latestVersion +
                    ", price=" + price +
                    '}';
        }
    }
