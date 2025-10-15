package lab5;
import java.util.Random;
public class Node {
    Random r = new Random();//For random Ids
    int id;
    String data;
    Node next;
    
    public Node(String value){
        int Id = (r.nextInt()/100000);
        if (Id<0){Id*=-1;}//To turn it to a positive integer :3
        data = value;
        next = null;
        id = Id;//Division to control digits
    }
}
