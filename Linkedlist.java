package in.orangecounty.sajin.sajin;
import java.util.LinkedList;
/**
 * Created by sajin on 02/03/17.
 */
public class Linkedlist {
    public static void main(String[]args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add("Rajesh");
        linkedList.add("Kousalya");
        linkedList.add("Janu");
        System.out.println("Linked List"+linkedList );
        linkedList.addFirst("Suresh");
        linkedList.addLast("Sajin");
        System.out.println("After adding"+linkedList );
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After Removing"+linkedList);
        linkedList.add(0, "Sajin");
        linkedList.remove(2);
        linkedList.remove(1);
        System.out.println("Final List: " +linkedList);
    }
}