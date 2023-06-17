import java.util.*;

public class _01_Fractional_Knapsack_Problem_GreedyAlgorithm {

    // Item Value class.. 
    static class ItemValue{
        int profit, weight ;

        // Item value function.. 
        public ItemValue(int profit, int weight){
            this.profit = profit;
            this.weight = weight;
        }
    }


    // Function to get maximum value..
    public static double getMaxValue(ItemValue [] arr, int capacity){

        // 1. Sorting items by Progit/weight ratio.. 
        Arrays.sort(arr, new Comparator<ItemValue>(){
            
            @Override
            public int compare(ItemValue item1, ItemValue item2){
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);

                if(cpr1 < cpr2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        // 2. After sorting we can get maximum value..
        double totalValue = 0d;

        for(ItemValue item : arr){
            int currentWeight = (int)item.weight;
            int currentProfit = (int)item.profit;

            if(capacity - currentWeight >= 0){
                capacity = capacity - currentWeight;
                totalValue += currentProfit;
            }else{
                double fraction = ((double)capacity/(double)currentWeight);
                totalValue += (currentProfit * fraction);
                capacity = (int)(capacity - (currentWeight * fraction));
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        
        ItemValue [] arr = {
            new ItemValue(25,5),
            new ItemValue(75, 10),
            new ItemValue(100, 12),
            new ItemValue(50,4),
            new ItemValue(45, 7),
            new ItemValue(90, 9),
            new ItemValue(30, 3),            
        };

        int capacity = 37 ;

        double maxValue = getMaxValue(arr, capacity);

        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}