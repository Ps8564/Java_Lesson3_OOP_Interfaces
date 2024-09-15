import java.util.List;

// Controller for managing streams
public class Controller {
    private final StreamService streamService = new StreamService();
    private List<Stream> streams;

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    public void sortStreams() {
        streamService.sortStreams(streams);
    }
}