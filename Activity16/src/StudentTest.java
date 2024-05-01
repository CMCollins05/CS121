public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Christian", "Freshman", 3.5, 'B', false);

        System.out.println(student1.getName() + " " + student1.getGradeLevel() + " " + student1.getGpa() + " " + student1.getGrade() + " " + student1.getDriver());
        student1.setName("Apollo");
        student1.setGradeLevel("Senior");
        student1.setGpa(3.8);
        student1.setGrade('A');
        student1.setDriver(true);
        System.out.println(student1.getName() + " " + student1.getGradeLevel() + " " + student1.getGpa() + " " + student1.getGrade() + " " + student1.getDriver());

    }
}
