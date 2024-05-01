public class testClass {
    public static void main(String[] args) {
        String characterName = "Paul";
        String race = "Human";
        String classType = "Rogue";
        int health = 12;
        String city = "Ravendeep";
        String militia = "Myrkul Defense Force";
        int people = 1729;
        int soldiers = 192;
        Class1 character = new Class1(characterName, race, classType, health);
        Class2 storyTeller = new Class2(city, militia, people, soldiers);
        System.out.println("Your " + character.getRace() + "'s name is " + character.getCharacter() + " and is a " + character.getClassType() + " with health of " + character.getHealth());
    }
}
