package factory;

import products.AppleProduct;
import products.IPad;
import products.IPhone;
import products.MacBook;

public class AppleProductFactory {

    private static AppleProductFactory instance = null;

    public static synchronized AppleProductFactory getInstance(){
        if(instance == null){
            instance = new AppleProductFactory();
        }
        return instance;
    }

    private AppleProductFactory(){};

    public AppleProduct getAppleProduct(AppleProductType type, int latestVersion, double price){
        return switch(type){
            case AppleProductType.IPad -> new IPad(latestVersion, price);
            case AppleProductType.IPhone -> new IPhone(latestVersion, price);
            case AppleProductType.MacBook -> new MacBook(latestVersion, price);
            default -> null;
        };
    }
}
