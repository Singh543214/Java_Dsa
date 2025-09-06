import java.util.*;
import java.lang.*;
class List{
    int weight;
    int profit;
    List(int weight,int profit){
        this.weight=weight;
        this.profit=profit;
    }
}
public class KnapSack {
    static double CreateMakimumProfit(List[] list,int capacity){
        double totalProfit=0.0;
        int currweight=0;
        Arrays.sort(list,(a,b)-> Double.compare((double)b.profit/b.weight, (double)a.profit/a.weight));
        for(List li:list){
            if(currweight+li.weight <= capacity){
                currweight+=li.weight;
                totalProfit+=li.profit;
            }else{
                int remaining=capacity-currweight;
                if(remaining>0){
                totalProfit+=(((double)remaining/li.weight)*li.profit);
                }
                break;
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        List[] list={
            new List(18, 25),
            new List(15,24),
            new List(10, 15)
        };
        int capacity=20;
        System.out.println(CreateMakimumProfit(list, capacity));
    }
}
