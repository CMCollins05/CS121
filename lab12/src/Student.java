import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String id;
    private ArrayList<Course> courseArrayList = new ArrayList<>();
    private HashMap<String, Course> courseHashMap = new HashMap<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // methods
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "ID: %s\n\n",
                name, id);
    }

    public void addCourse(String courseName, Course course) {
        courseHashMap.put(courseName,course);
    }

    public void removeMove(Course course) {
        courseHashMap.remove(course);
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
            if (courseHashMap.containsKey(courseName)) {
                foundCourse = courseHashMap.get(courseName);
            }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        courseHashMap.forEach((name,course) -> {
            courseStringBuilder.append(course.toString());
        });
        return courseStringBuilder;
    }
}
