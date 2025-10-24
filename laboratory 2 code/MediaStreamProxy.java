// The Proxy acts as a placeholder and implements caching
public class MediaStreamProxy implements MediaPlayer {
    private RemoteStream remoteStream; // Reference to the Real Subject
    private String url;
    private boolean isCached = false; // Simple caching flag

    public MediaStreamProxy(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        // Load the real subject only when play() is called (Virtual Proxy behavior)
        if (remoteStream == null) {
            remoteStream = new RemoteStream(url);
        }

        // Add caching logic (Protection/Caching Proxy behavior)
        if (!isCached) {
            System.out.println("    [Proxy]: Caching stream data locally for faster access.");
            // Simulate data caching
            isCached = true;
        } else {
            System.out.println("    [Proxy]: Stream already cached. Playing from local copy.");
        }

        remoteStream.play();
    }

    @Override
    public String getSourceInfo() {
        return "Proxy for Remote Stream at " + url;
    }
}