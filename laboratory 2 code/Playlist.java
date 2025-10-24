import java.util.ArrayList;
import java.util.List;

// A playlist that can contain other MediaPlayer components (Composite)
public class Playlist implements MediaPlayer {
    private String name;
    private List<MediaPlayer> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(MediaPlayer component) {
        components.add(component);
    }

    public void remove(MediaPlayer component) {
        components.remove(component);
    }

    @Override
    public void play() {
        System.out.println("\n--- Starting Playlist: " + name + " ---");
        for (MediaPlayer component : components) {
            component.play();
        }
        System.out.println("--- Finished Playlist: " + name + " ---\n");
    }

    @Override
    public String getSourceInfo() {
        return "Playlist: " + name;
    }
}