import java.util.ArrayList;
public class StringArrayList {
    private ArrayList<String> groceries = new ArrayList<>();

    public void addElement(String element){
        this.groceries.add(element);
    }
    public void removeElement(String element){
        this.groceries.remove(element);
    }
    public int getSize(){
        return groceries.size();
    }
    public String getElement(int index){
        return groceries.get(index);
    }
    public void displayList(){
        for(int i = 0; i < groceries.size(); i++){
            System.out.println(groceries.get(i));
        }
    }
    public void showList(){
        for(String element : groceries){
            System.out.printf("%s\n", element);
        }
    }
}
