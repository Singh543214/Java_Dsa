import java.lang.*;
import java.util.*;
public class FactorPair {
    static List<Integer> pair(int a){
       int min=Integer.MAX_VALUE;
       List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(a)+1;i++){
            if(a%i==0){
                arr.add(i);
                arr.add(a/i);
                System.out.println(i+" x "+a/i);
                //min=Math.min(min, Math.abs(i-(a/i)));
            }
        }
        //System.out.println(min);
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr=pair(100);
       // System.out.println(arr);
       int[] array2 = arr.stream().mapToInt(Integer::intValue).toArray();
        Collections.sort(arr);
        System.out.println(arr);
        for(int i=0;i<array2.length;i++){
            
        }
    }
}
