
public class ThreadSafeGameSettings {
    private static ThreadSafeGameSettings instance;
    private int volume;
    private boolean fullscreenEnabled;

    private ThreadSafeGameSettings(int volume, boolean fullscreenEnabled){
        this.fullscreenEnabled = fullscreenEnabled;
        this.volume = volume;
    }
    public static synchronized ThreadSafeGameSettings getInstance(){
        if (instance == null) {
            instance = new ThreadSafeGameSettings(50, false);
        }
        return instance;
    }

    //added synchronized for thread safety purposes
    public synchronized void setFullscreenEnabled(boolean enabled){
        this.fullscreenEnabled = enabled;
    }

    public synchronized boolean getFullscreenEnabled(){
        return this.fullscreenEnabled;
    }
}