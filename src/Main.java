import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup("N108"));
        stream1.addGroup(new StudyGroup("N106"));
        stream1.addGroup(new StudyGroup("N117"));
        stream1.addGroup(new StudyGroup("N167"));
        stream1.addGroup(new StudyGroup("N202"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup("N068"));
        stream2.addGroup(new StudyGroup("N096"));
        stream2.addGroup(new StudyGroup("N034"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        Controller controller = new Controller();
        controller.setStreams(streams);
        controller.sortStreams();

        for (Stream stream : streams) {
            System.out.println("Stream: " + stream);
            System.out.println("Groups Size: " + stream.GroupsSize());
        }
    }
}