import java.util.*;
public class LinkedListex {
    public static void main(String[] args) {
        LinkedList<Integer> li= new LinkedList<>();
        li.addFirst(20);
        li.add(400);
        li.addFirst(12);
        li.addLast(5);
        Collections.sort(li);
        li.set(1,50);
        li.clear();
        System.out.println(li);
    }
}
