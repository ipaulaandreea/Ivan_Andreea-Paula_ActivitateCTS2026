
public class Main {

    public static void main(String[] args) {
        Cafea cafea = new Espresso();
        cafea = new Lapte(cafea);
        cafea = new Frisca(cafea);
        cafea = new Caramel(cafea);
        System.out.println(cafea.descriere());
        System.out.println("Cost: " + cafea.cost() + " lei");

    }

}