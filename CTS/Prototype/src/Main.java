//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
EldenRingCharacterPrototype strength = new StrengthBuild("Samurai", 90);
EldenRingCharacterPrototype mage = new MageBuild("Astrologer", 100);
StrengthBuild clone1 = (StrengthBuild) strength.clone();
clone1.setName("Hero");
clone1.setStrength(80);
strength.displayBuild();
clone1.displayBuild();

MageBuild clone2 = (MageBuild) mage.clone();
clone2.setName("Prisoner");
clone2.setIntelligence(90);

mage.displayBuild();
clone2.displayBuild();
}
