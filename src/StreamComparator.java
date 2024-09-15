import java.util.Comparator;

// Comparator for comparing streams by the number of groups
public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.GroupsSize(), o2.GroupsSize());
    }
}