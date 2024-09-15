import java.util.*;

// Class representing a stream that contains study groups
public class Stream implements Iterable<StudyGroup> {
    private final List<StudyGroup> studyGroups = new ArrayList<>();

    public void addGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public int GroupsSize() {
        return studyGroups.size();
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (StudyGroup group : studyGroups) {
            sb.append(group.name()).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(" ");
        return sb.toString();
    }
}