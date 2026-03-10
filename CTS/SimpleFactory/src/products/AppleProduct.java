package products;

public abstract class AppleProduct {

    protected int latestVersion;
    protected double price;

    public AppleProduct(int latestVersion, double price){
        this.latestVersion = latestVersion;
        this.price = price;
    }

    public abstract String displaySpecs();

}
