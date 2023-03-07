package InsertDeleteGetRandom;

import java.util.ArrayList;
import java.util.HashSet;

public class HashRand {
    HashSet<Integer> num = new HashSet<>();

    public HashRand(){
        num = new HashSet<>();
    }

    public boolean insert(int val){
        if(num.contains(val)){
            return false;
        }
        num.add(null);
        return true;
    }

    public boolean remove(int val){
        if(num.contains(val)){
            num.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom(){
        ArrayList<Integer> nums = new ArrayList<>(num);
        int count = (int)Math.random()*(nums.size());
        return nums.get(count);
    }
    public static void main(String[] args) {
        
    }
}
