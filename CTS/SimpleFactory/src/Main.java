import factory.AppleProductFactory;
import factory.AppleProductType;
import products.AppleProduct;

void main() {
    AppleProductFactory factory = AppleProductFactory.getInstance();
    AppleProduct iPhone = factory.getAppleProduct(AppleProductType.IPhone, 17, 599);
    AppleProduct MacBook = factory.getAppleProduct(AppleProductType.MacBook, 20, 1099);
    AppleProduct iPad = factory.getAppleProduct(AppleProductType.IPad, 25, 699);

    System.out.println(iPad.displaySpecs());
    System.out.println(iPhone.displaySpecs());
    System.out.println(MacBook.displaySpecs());
}

