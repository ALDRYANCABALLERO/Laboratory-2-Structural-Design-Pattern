// Abstract Decorator that wraps a MediaPlayer
public abstract class MediaFeatureDecorator implements MediaPlayer {
    protected MediaPlayer decoratedPlayer;

    public MediaFeatureDecorator(MediaPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }

    @Override
    public String getSourceInfo() {
        return decoratedPlayer.getSourceInfo();
    }
}