public class Main {
    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Composite Playlist ---");
        
        // 1. Create simple files (Leafs)
        MediaPlayer songA = new MediaFile("Track A (Local)", "C:/music/a.mp3");
        MediaPlayer songB = new MediaFile("Track B (Local)", "C:/music/b.mp3");

        // 2. Use the Adapter for a new source (HLS Stream)
        MediaPlayer streamC = new HlsStreamAdapter("http://hls.live/streamC.m3u8");

        // 3. Create a sub-playlist
        Playlist subMix = new Playlist("Chill Mix");
        subMix.add(songB);
        subMix.add(streamC);

        // 4. Create the main composite playlist
        Playlist mainAlbum = new Playlist("Best Hits 2024");
        mainAlbum.add(songA);
        mainAlbum.add(subMix);
        
        mainAlbum.play();


        System.out.println("\n=======================================================\n");
        System.out.println("--- Scenario 2: Decorator and Proxy Integration ---");
        
        // Use the Proxy for a remote stream (expensive resource)
        MediaPlayer remoteVideo = new MediaStreamProxy("https://remote.server/video.mp4");
        
        // 1. Decorate the Proxy with multiple features (Plugins)
        // Order matters: Watermarking happens before Subtitles
        MediaPlayer decoratedVideo = new WatermarkingDecorator(
            new SubtitleDecorator(remoteVideo) // Subtitle feature
        );

        System.out.println("First Play (Proxy loads & caches, Decorators apply):");
        decoratedVideo.play();
        
        System.out.println("\nSecond Play (Proxy uses cached data):");
        decoratedVideo.play();
    }
}