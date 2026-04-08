public class MediaAdapter implements MediaPlayer{
    private VlcPlayer vlcPlayer;

    public MediaAdapter(){
        this.vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Unsupported format: " + audioType);
        }
    }
}
