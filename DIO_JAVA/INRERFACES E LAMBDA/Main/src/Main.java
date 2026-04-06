import java.awt.color.CMMException;

public class Main {

    public static void main(String[] args){
        runVideo(new Computer());
        runMusic(new Computer());
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }

}
