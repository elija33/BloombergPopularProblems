package TwoSum;

public class NavieTwoSum {
    public static int[] TwoSum(int number[], int target){
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                if(number[i] + number[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int numb[] = {2,7,11,15};
        int target = 9;
        System.out.println(TwoSum(numb, target));
    }
}
