public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Pregatire pentru film");
        lights.dim(20);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Oprire sistem home theater");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
