import java.lang.*;
public class Random {
    
    public static void main(String[] args) {
        String[] name={"Prince","Krish","Adarsh"};
        int idx=((int)Math.floor(Math.random()*3));
        System.out.println(name[idx]);
    }
}
