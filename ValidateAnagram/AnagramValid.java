package ValidateAnagram;

import java.util.Arrays;

public class AnagramValid {
    public static boolean isAnagram(String s, String t){
        int word1 = s.length();
        int word2 = t.length();

        if(word1 != word2){
            return false;
        }

        char sword[] = s.toCharArray();
        char tword[] = t.toCharArray();

        Arrays.sort(sword);
        Arrays.sort(tword);


        return Arrays.equals(sword, tword);
    }
    public static void main(String[] args) {
        String sword = "anagram";
        String tword = "nagaram";
        System.out.println(isAnagram(sword, tword));
    }
}
