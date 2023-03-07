package TwoSum;

import java.util.HashMap;

public class HashMapTwoSum {
    public static int[] TwoSum(int number[], int target){
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i = 0; i < number.length; i++){
            int sum = target - number[i];
            if(num.containsKey(sum)){
                return new int[] {num.get(sum), i};
            }
            else{
                num.put(number[i], i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int number[] = {2,7,11,15};
        int target = 9;
        System.out.println(TwoSum(number, target));
    }
}
