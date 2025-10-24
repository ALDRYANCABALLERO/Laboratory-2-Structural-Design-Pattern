// This is the incompatible interface (Adaptee)
class HlsStreamer {
    public void startHlsStream(String url) {
        System.out.println("HLS Streaming Library initialized for URL: " + url);
    }
    public String getStreamMetadata() {
        return "HLS Stream";
    }
    public void stop() {
        // ... cleanup
    }
}