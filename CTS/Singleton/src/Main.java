public class Main {

    public static void main(String[] args) {
        ThreadSafeGameSettings t1 = ThreadSafeGameSettings.getInstance();
        ThreadSafeGameSettings t2 = ThreadSafeGameSettings.getInstance();
        System.out.println("same instance? " + (t1 == t2));

        EagerInitGameSettings e1 = EagerInitGameSettings.getInstance();
        EagerInitGameSettings e2 = EagerInitGameSettings.getInstance();

        System.out.println("same instance? " + (e1 == e2));

        DoubleCheckedGameSettings d1 = DoubleCheckedGameSettings.getInstance();
        DoubleCheckedGameSettings d2 = DoubleCheckedGameSettings.getInstance();
        System.out.println("same instance? " + (d1 == d2));

        EnumBasedGameSettings enum1 = EnumBasedGameSettings.INSTANCE;
        EnumBasedGameSettings enum2 = EnumBasedGameSettings.INSTANCE;
        System.out.println("same instance? " + (enum1 == enum2));
    }
}