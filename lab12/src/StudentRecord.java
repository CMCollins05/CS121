import java.util.ArrayList;
import java.util.HashMap;

public class StudentRecord {
    private ArrayList<Student> studentArrayList = new ArrayList<>();
    private HashMap<String, Student> studentHashMap = new HashMap<>();

    public void addStudent(String id, Student student) {
        studentHashMap.put(id, student);
    }

    public void removeStudent(String id) {
        studentHashMap.remove(id);
    }

    public Student getStudent(String id) {
        Student foundStudent = null;
            if (studentHashMap.containsKey(id)) {
                foundStudent = studentHashMap.get(id);
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();
        studentHashMap.forEach( (id, student) -> {
            studentStringBuilder.append(student.toString());
        });
        return studentStringBuilder;
    }
}
