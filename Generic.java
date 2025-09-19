import java.util.*;
class Obj<t>{
    t var;
    void set(t x){
        this.var=x;
    }
    t get(){
        return var;
    }
}

public class Generic {
     <t> void printArr(t[] arr){
        for(t item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Obj<String> str=new Obj<>();
        str.set("Hello");
        System.out.println(str.get());
        Integer[] arr={1,2,3,4,5,6};
        String[] atr={"Hello","Hy"};
        Generic g=new Generic();
        g.printArr(arr);
        g.printArr(atr);
    }
}
