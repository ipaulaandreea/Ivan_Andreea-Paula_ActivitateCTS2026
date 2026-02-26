
public class DoubleCheckedGameSettings {
    private static volatile DoubleCheckedGameSettings instance;
    private int volume;
    private boolean fullscreenEnabled;

    private DoubleCheckedGameSettings(int volume, boolean fullscreenEnabled) {
        this.volume = volume;
        this.fullscreenEnabled = fullscreenEnabled;
    }

    public static DoubleCheckedGameSettings getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedGameSettings.class){
                if(instance == null){
                    instance = new DoubleCheckedGameSettings(20, false);
                }
            }
        }
        return instance;
    }
}