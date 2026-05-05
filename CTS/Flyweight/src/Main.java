public class Main {

    public static void main(String[] args) {
        CharacterStyle style1 = TextStyleFactory.getStyle("Arial", 12, "Black");
        CharacterStyle style2 = TextStyleFactory.getStyle("Arial", 12, "Black");
        CharacterStyle style3 = TextStyleFactory.getStyle("Times New Roman", 14, "Blue");
        style1.display("A", 1);
        style2.display("B", 2);
        style3.display("C", 3);

        System.out.println("Numar obiecte TextStyle create: " +
                TextStyleFactory.getNumberOfStyles());
        System.out.println(style1 == style2);

    }

}