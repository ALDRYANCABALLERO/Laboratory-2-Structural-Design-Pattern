// The Adapter makes the HlsStreamer compatible with our MediaPlayer interface
public class HlsStreamAdapter implements MediaPlayer {
    private HlsStreamer hlsStreamer;
    private String url;

    public HlsStreamAdapter(String url) {
        this.url = url;
        this.hlsStreamer = new HlsStreamer();
    }

    @Override
    public void play() {
        // Translate the MediaPlayer.play() call to the HlsStreamer's specific method
        hlsStreamer.startHlsStream(url);
        System.out.println("Playing via HLS Adapter: " + url);
    }

    @Override
    public String getSourceInfo() {
        return hlsStreamer.getStreamMetadata() + " at " + url;
    }
}