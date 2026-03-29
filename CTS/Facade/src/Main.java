//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    DVDPlayer dvdPlayer = new DVDPlayer();
    Projector projector = new Projector();
    SoundSystem soundSystem = new SoundSystem();
    Lights lights = new Lights();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

    homeTheater.watchMovie("Inception");
    System.out.println();
    homeTheater.endMovie();
}
