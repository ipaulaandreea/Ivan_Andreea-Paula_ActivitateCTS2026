public class Frisca extends DecoratorCafea {

    public Frisca(Cafea cafea) {
        super(cafea);
    }

    @Override
    public double cost() {
        return cafea.cost() + 3;
    }

    @Override
    public String descriere() {
        return cafea.descriere() + ", frișcă";
    }

}