import java.util.*;
class sort{
    public boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
public class FrogProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sort s=new sort();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(s.isSorted(arr)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
