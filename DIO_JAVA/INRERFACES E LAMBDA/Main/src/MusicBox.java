public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Caixa de musica esta tocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Caixa de musica esta pausando musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("Caixa de musica esta parando musica");
    }
}
