import java.util.*;

public class zad3 {
    public static void main(String[] args) {
        String s = "asdcxcvxcvcccvwefds";
        int i = 0, j = 0, max = 0;
        Set<Character> longestString = new HashSet<>();

        while(i < s.length()){
            if(!longestString.contains(s.charAt(i))){
                longestString.add(s.charAt(i++));
                max = Math.max(max, longestString.size());
            }else{
                longestString.remove(s.charAt(j++));
            }
        }

        System.out.println(max);
    }
}
