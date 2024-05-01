package packagesActivity;

public class packagesTest {
    public static void main(String[] args) {
        person person1 = new person();
        person1.name = "Christian";
        person1.age = 18;
        //person1.job = "Student";
        //person1.address = "Beyerl Hall";

        System.out.println(person1.getName() + " " + person1.getAge());
        person1.printDetails();
    }
}
