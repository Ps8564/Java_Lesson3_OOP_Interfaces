// Class representing a study group
public record StudyGroup(String name) {

    @Override
    public String toString() {
        return name;
    }
}