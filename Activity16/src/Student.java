public class Student {
    private String name;
    private String gradeLevel;
    private double gpa;
    private char grade;
    private boolean driver;

    public Student(String name, String gradeLevel, double gpa, char grade, boolean driver){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.grade = grade;
        this.driver = driver;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGradeLevel(){
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    public boolean getDriver(){
        return driver;
    }
    public void setDriver(boolean driver){
        this.driver = driver;
    }
}
