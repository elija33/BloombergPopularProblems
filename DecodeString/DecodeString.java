package DecodeString;

public class DecodeString {
    public static String DecodeString(String s){
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while(i < s.length() && s.charAt(i) != ']')
            if(Character.isDigit(s.charAt(i))){
                int k = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i)))
                k = k * 10 + (s.charAt(i++) - '0');
                ++i;
                String deconString = DecodeString(s);
                    ++i;
                    while(k-- > 0)
                        builder.append(deconString);
            }
            else{
                builder.append(s.charAt(i++));
            }
            return builder.toString();
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(DecodeString(s));
    }
}
