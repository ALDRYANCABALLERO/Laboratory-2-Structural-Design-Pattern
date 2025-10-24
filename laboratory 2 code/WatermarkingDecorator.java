// Concrete Decorator for watermarking
public class WatermarkingDecorator extends MediaFeatureDecorator {
    public WatermarkingDecorator(MediaPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        applyWatermark(); // Add behavior before/during playback
        super.play();
    }

    private void applyWatermark() {
        System.out.println("    [Feature]: Applying Watermark to: " + decoratedPlayer.getSourceInfo());
    }
}