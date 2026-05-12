class ImagineReala implements Imagine {

    private String fisier;

    public ImagineReala(String fisier) {
        this.fisier = fisier;
        incarcaDinMemorie();

    }

    private void incarcaDinMemorie() {
        System.out.println("Se incarca imaginea: " + fisier);

    }

    public void afiseaza() {
        System.out.println("Se afiseaza imaginea: " + fisier);
    }

}