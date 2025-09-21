
package lab5;

public class SinglyLinkedList{
    Node head;
    public void insertEnd(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void insertStart(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public String deleteName(String key){
        Node temp = head, prev = null;
        if (temp != null && temp.data.equalsIgnoreCase(key)){
            head = temp.next;
            return temp.data;
        }
        while (temp != null && !temp.data.equalsIgnoreCase(key)){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return "0";
        prev.next = temp.next;
        return temp.data;
    }
    
    public String deleteId(int key){
        Node temp = head, prev = null;
        if (temp != null && temp.id == key){
            head = temp.next;
            return temp.data;
        }
        while (temp != null && temp.id != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return "0";
        prev.next = temp.next;
        return temp.data;
    }
    
    public String display(){
        Node current = head;
        String display = "";
        int i = 1;
        while (current != null){
            display += (i + ". " + current.id + " " + current.data + "\n");
            current = current.next;
            i++;
        }
        return display;
    }
}
