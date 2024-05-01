
public class StringArrayTest {
    public static void main(String[] args) {
        StringArrayList groceries = new StringArrayList();
        
        groceries.addElement("Apple");
        groceries.addElement("Banana");
        groceries.addElement("Carrot");
        groceries.addElement("Dip");
        System.out.println(groceries.getSize());
        System.out.println(groceries.getElement(1));
        groceries.displayList();
        groceries.showList();
    }
}
