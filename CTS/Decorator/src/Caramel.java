class Caramel extends DecoratorCafea {

    public Caramel(Cafea cafea) {
        super(cafea);
    }

    @Override
    public double cost() {
        return cafea.cost() + 4;
    }

    @Override
    public String descriere() {
        return cafea.descriere() + ", caramel";
    }

}