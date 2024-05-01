import java.util.Scanner;
public class Class1 {
        private String characterName;
        private String race;
        private String classType;
        private int health;
        public Class1(String n, String r, String c, int h){
            characterName = n;
            race = r;
            classType = c;
            health = h;
        }
        public String getCharacter(){
            return characterName;
        }
        public String getRace(){
            return race;
        }
        public String getClassType(){
            return classType;
        }
        public int getHealth(){
            return health;
        }
}
