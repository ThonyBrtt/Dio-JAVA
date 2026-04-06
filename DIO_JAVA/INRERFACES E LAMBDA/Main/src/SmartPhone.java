public class SmartPhone implements VideoPlayer, MusicPlayer {


    @Override
    public void playVideo() {
        System.out.println("smartphone exibindo video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("smartphone pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("smartphone fechando video");
    }

    @Override
    public void playMusic() {
        System.out.println("smartphone tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("smartphone pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("smartphone parando musica");
    }
}
