package ValidateAnagram;
import java.util.HashMap;

public class HashMapAnagramValid {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> anagram = new HashMap<>();
        int words = s.length();
        int wordt = t.length();

        if(words != wordt){
            return false;
        }
        for(char sword : s.toCharArray()){
            anagram.put(sword, anagram.getOrDefault(sword, 0) + 1);
        }
        for( char tword : t.toCharArray()){
            if(anagram.containsKey(tword)){
                anagram.put(tword, anagram.get(tword) - 1);

                if(anagram.get(tword) < 0){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String tword = "nagaram";
        String sword = "anagram";
        System.out.println(isAnagram(sword, tword));
    }
}
