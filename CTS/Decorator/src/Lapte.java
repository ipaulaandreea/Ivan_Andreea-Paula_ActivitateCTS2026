public class Lapte extends DecoratorCafea {

    public Lapte(Cafea cafea) {
        super(cafea);
    }

    @Override
    public double cost() {
        return cafea.cost() + 2;
    }

    @Override
    public String descriere() {
        return cafea.descriere() + ", lapte";
    }

}