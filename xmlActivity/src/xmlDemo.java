import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlDemo {
    public static void main(String[] args) {
        try{
            File input = new File("src/students.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(input);

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

            NodeList studentList = document.getElementsByTagName("student");
            for (int i = 0; i < studentList.getLength(); i++) {
                Node node = studentList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Year: " + element.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println("Major: " + element.getElementsByTagName("major").item(0).getTextContent());
                    System.out.println("GPA: " + element.getElementsByTagName("GPA").item(0).getTextContent());
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
