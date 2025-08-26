import java.util.*;
import java.lang.*;
import java.io.*;
class Student{
    int r;
    String n,a;
    public Student(int r,String n,String a){
        this.r=r;
        this.n=n;
        this.a=a;
    }
    public String toString(){
        return this.r+" "+this.n+" "+this.a;
    }
  
}
class Sortbyroll implements Comparator<Student>{
    public int compare(Student x,Student y){
        return x.r-y.r;
    }
}
public class newcode {
    public static void main(String[] args) {
    Student[] x= {new Student(5,"Ram","UP"),
    new Student(2,"Shyam","Bihar"),new Student(3,"Prince","MP")};
    Arrays.sort(x,new Sortbyroll());
    for(int i=0;i<x.length;i++){
        System.out.println(x[i]);
    }

    }
}
