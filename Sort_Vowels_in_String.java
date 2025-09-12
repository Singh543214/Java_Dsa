import java.util.*;
import java.util.List;
public class Sort_Vowels_in_String {
    public static void main(String[] args) {
        String s="lEetcOde";
        String original="";
        String vowel="AEIOUaeiou";
        String[] ch=s.split("");
        List<Character> li=new ArrayList<>();
        for(int i=0,j=0;i<s.length();i++,j++){
            if(vowel.contains(Character.toString(s.charAt(i)))){
                li.add(s.charAt(i));
            }
        }
        Collections.sort(li);
        int lidx=0;
        for(int i=0;i<s.length();i++){
            if(vowel.contains(Character.toString(s.charAt(i)))){
                original+=li.get(lidx++);
            }
            else{
                original+=s.charAt(i);
            }
        }
        System.out.println(original);
    }
}
