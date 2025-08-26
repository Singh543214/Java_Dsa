import java.util.*;
public class ArrayListexample{
    public static void main(String[] args){
        ArrayList<Character> li=new ArrayList<>();
        li.add('k');
        li.add('r');
        li.add('i');
        li.add('s');
        //li.remove(3);
        // li.set(1,5);
         Collections.sort(li);
        for(Character s:li){
            System.out.print(s+"");
        }
        System.out.println(li+" "+li.size());
        
    }
}