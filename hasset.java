import java.util.*;
public class hasset {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(2);
        h.add(3);
        System.out.println(h.contains(5));
    }
}
