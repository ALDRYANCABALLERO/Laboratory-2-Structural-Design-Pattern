// A simple media file component (Leaf)
public class MediaFile implements MediaPlayer {
    private String name;
    private String content; // Represents actual media content/URL

    public MediaFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public void play() {
        System.out.println("Playing file: " + name + " (" + content + ")");
        // Actual media playback logic goes here
    }

    @Override
    public String getSourceInfo() {
        return "File: " + name;
    }
}