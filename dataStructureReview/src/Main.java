public class Main {
    DataStructure test = new DataStructure();

    public void run(){
        test.addStudent("Christian");
        test.addStudent("Jon");
        test.addStudent("Ben");
        test.addAge(18);
        test.addAge(17);
        test.addAge(19);
        test.addMajor("CompSci", 3.5);
        test.addMajor("English", 3.2);
        test.addMajor("Game Design", 3.6);
        test.addNationality("American");
        test.addNationality("Canadian");
        test.addNationality("European");
        test.addHometown("Franklin");
        test.addHometown("Louisville");
        test.addHometown("San Diego");
        test.addHomeState("Indiana");
        test.addHomeState("California");
        test.addHomeState("New York");
        test.printStudent();
        test.printAge();
        test.printMajor();
        test.printNationality();
        test.printHometown();
        test.printState();
        test.removeStudent("Ben");
        test.removeAge(17);
        test.removeMajor("Game Design", 3.6);
        test.removeState("New York");
        test.printStudent();
    }
}
