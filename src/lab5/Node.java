
package lab5;
import java.util.Random;
public class Node {
    Random r = new Random();
    int id;
    String data;
    Node next;
    
    public Node(String value){
        data = value;
        next = null;
        id = (r.hashCode()/100000);//Division to control digits
    }
}
