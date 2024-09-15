import java.util.Collections;
import java.util.List;

// Service for sorting streams
public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }
}