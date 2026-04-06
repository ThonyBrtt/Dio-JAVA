public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("Computer exibindo video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Computer pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Computer fechando video");
    }

    @Override
    public void playMusic() {
        System.out.println("Computer tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Computer pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("Computer parando musica");
    }
}
