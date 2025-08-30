import java.io.*;
import java.util.*;
public class CreateFile {
    public static void main(String[] args) {
        try{
           File myobj =new File("prince.txt");
           //myobj.createNewFile();
       myobj.delete();
        }
        catch(Exception e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
