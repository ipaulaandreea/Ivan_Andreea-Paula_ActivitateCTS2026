
public class EagerInitGameSettings {

    public static final EagerInitGameSettings instance =
            new EagerInitGameSettings(10, true);
    private int volume;
    private boolean fullscreenEnabled;

    private EagerInitGameSettings(int volume, boolean fullscreenEnabled){
        this.fullscreenEnabled = fullscreenEnabled;
        this.volume = volume;
    }

    public static EagerInitGameSettings getInstance(){
        return instance;
    }
}