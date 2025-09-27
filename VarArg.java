import java.util.*;
public class VarArg {
   static void print(String... s){
    for(String i:s){
        System.out.println(i);
    }
   }
   public static void main(String[] args) {
    print("Ram","Shyam","Ganesh","Shiv");
   } 
}
