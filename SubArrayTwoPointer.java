import java.util.*;
public class SubArrayTwoPointer {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5};
        int i=0,j=0,n=arr.length-1;
        while(i!=n && j!=n){
            if(j==n){
                System.out.println();
                i++;
                j=i;
            }
            for(int x=i;x<=j;x++){
                System.out.print(arr[x]);
            }
            System.out.println();
            j++;

        }
    }
}
