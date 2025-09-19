import java.util.*;
class start<t extends Number>{
    t[] nums;
    start(t[] nums){
        this.nums=nums;
    }
    double average(){
        double sum=0;
        for(t num:nums){
            sum+=num.doubleValue();
        }
        return sum/nums.length;
    }
}
public class GenericExtends {
    public static void main(String[] args) {
        Integer[] num={1,2,3,4,5};
        start<Integer> s=new start<>(num);
        System.out.println(s.average());
    }
}
