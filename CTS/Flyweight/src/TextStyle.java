public class TextStyle implements CharacterStyle{

    private final String font;
    private final int size;
    private final String color;

    public TextStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public void display(String character, int position) {
        System.out.println(
                "Caracter: " + character +
                        ", pozitie: " + position +
                        ", font: " + font +
                        ", marime: " + size +
                        ", culoare: " + color
        );
    }
}
