import java.util.*;
import java.lang.*;
public class math{
public static void main(String[] args) {
    int x=1;
    int y=0;
    for(int i=0;i<10;i++){
        System.out.print((int)Math.scalb(x,i)+" ");

    }
    System.out.println(Math.cbrt(1));
    System.out.println(Math.hypot(3,4));
}
}
