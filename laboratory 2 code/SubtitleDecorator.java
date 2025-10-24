// Concrete Decorator for subtitle rendering
public class SubtitleDecorator extends MediaFeatureDecorator {
    public SubtitleDecorator(MediaPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play(); // Play the base media first
        renderSubtitles(); // Add the new behavior
    }

    private void renderSubtitles() {
        System.out.println("    [Feature]: Rendering Subtitles for: " + decoratedPlayer.getSourceInfo());
    }
}