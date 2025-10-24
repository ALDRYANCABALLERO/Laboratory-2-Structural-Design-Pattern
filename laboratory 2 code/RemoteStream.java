// The heavy-weight object that takes time to load (e.g., a high-res remote stream)
class RemoteStream implements MediaPlayer {
    private String url;

    public RemoteStream(String url) {
        this.url = url;
        loadRemoteStream(url); // Simulates a time-consuming initialization
    }

    private void loadRemoteStream(String url) {
        System.out.println("    [Proxy]: Initializing connection and downloading metadata from: " + url);
        try {
            Thread.sleep(1500); // Simulate network latency/load time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void play() {
        System.out.println("Playing high-resolution remote stream from: " + url);
    }

    @Override
    public String getSourceInfo() {
        return "Remote Stream at " + url;
    }
}