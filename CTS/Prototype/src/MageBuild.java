public class MageBuild implements EldenRingCharacterPrototype {

    private String name;
    private int intelligence;

    public MageBuild(String name, int intelligence) {
        this.name = name;
        this.intelligence = intelligence;
    }

    @Override
    public EldenRingCharacterPrototype clone() {
        return new MageBuild(name, intelligence);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void displayBuild() {
        System.out.println("Mage Build");
        System.out.println("Name: " + name);
        System.out.println("Intelligence: " + intelligence);
    }
}