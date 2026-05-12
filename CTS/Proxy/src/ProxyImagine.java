class ProxyImagine implements Imagine {

    private ImagineReala imagineReala;
    private String fisier;

    public ProxyImagine(String fisier) {
        this.fisier = fisier;
    }

    public void afiseaza() {
        if (imagineReala == null) {
            imagineReala = new ImagineReala(fisier);
        }
        imagineReala.afiseaza();
    }
}