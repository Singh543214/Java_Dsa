import java.util.*;
public class MergeSortedArray {
    static int[] sort(int[] a,int[] b){
        int i=0,j=0,k=0;
        int[] res=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                res[k++]=a[i++];
            }
            else{
                res[k++]=b[j++];
            }
        }
        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length){
            res[k++]=b[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1=new int[]{2,6,10,15};
        int[] arr2=new int[]{1,2,3,4,5};
        int[] res=sort(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
}
