package packagesActivity;

public class person {
    public String name;
    public int age;
    private String job;
    private String address;
    private void Person(String name, int age, String job, String address){
        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    private String getJob(){
        return job;
    }
    private String getAddress(){
        return address;
    }
    public void setName(){
        this.name = name;
    }
    public void setAge(){
        this.age = age;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void setAddress(String address){
        this.address = address;
    }
    protected void printDetails(){
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }
}
