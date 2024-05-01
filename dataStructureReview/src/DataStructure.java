import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    public void addStudent(String name){
        studentList.add(name);
    }

    public void addAge(int age){
        for(int i = 0; i < ageList.length; i++){
            ageList[i] = age;
        }
    }

    public void addMajor(String major, double gpa){
        majorGpaMap.put(major, gpa);
    }

    public void addNationality(String nationality){
        nationalityList.add(nationality);
    }

    public void addHometown(String hometown){
        hometownStack.push(hometown);
    }

    public void addHomeState(String state){
        homeStateQueue.add(state);
    }

    public void removeStudent(String name){
        studentList.remove(name);
    }

    public void removeAge(int age){

    }

    public void removeMajor(String major, double gpa){
        majorGpaMap.remove(major, gpa);
    }

    public void removeNationality(String nationality){
        nationalityList.remove(nationality);
    }

    public void removeHometown(String hometown){
        hometownStack.pop();
    }

    public void removeState(String state){
        homeStateQueue.remove(state);
    }

    public void printStudent(){
        System.out.println(studentList);
    }

    public void printAge(){

    }

    public void printMajor(){

    }

    public void printNationality(){
        for(String nationality : nationalityList){
            System.out.println("Nationality: " + nationality);
        }
    }

    public void printHometown(){
        for(String hometown : hometownStack){
            System.out.println("Hometown: " + hometown);
        }
    }

    public void printState(){
        for(String state: homeStateQueue){
            System.out.println("The State Name: " + state);
        }
    }
}
