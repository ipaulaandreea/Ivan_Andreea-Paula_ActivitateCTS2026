public abstract class DecoratorCafea implements Cafea {
    protected Cafea cafea;

    public DecoratorCafea(Cafea cafea) {
        this.cafea = cafea;
    }

    @Override
    public double cost() {
        return cafea.cost();
    }

    @Override
    public String descriere() {
        return cafea.descriere();
    }

}