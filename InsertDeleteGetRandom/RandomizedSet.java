package InsertDeleteGetRandom;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> randomset;
    
    public RandomizedSet(){
        randomset = new HashSet<>();
    }

    public boolean insert(int val){
        if(randomset.contains(val)){
            return true;
        }
        randomset.add(val);
        return true;
    }

    public boolean remove(int val){
        if(randomset.contains(val)){
            randomset.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom(){
        Integer num[] = randomset.toArray(new Integer[randomset.size()]);
        Random rand = new Random();
        int randomN = rand.nextInt(randomset.size());
        return num[randomN];

    }
    public static void main(String[] args) {
        
    }
    
}
