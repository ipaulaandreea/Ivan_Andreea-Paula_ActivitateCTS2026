public class StrengthBuild implements EldenRingCharacterPrototype {

    private String name;
    private int strength;

    public StrengthBuild(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    @Override
    public EldenRingCharacterPrototype clone() {
        return new StrengthBuild(name, strength);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void displayBuild() {
        System.out.println("Strength Build");
        System.out.println("Name: " + name);
        System.out.println("Strength: " + strength);
    }
}