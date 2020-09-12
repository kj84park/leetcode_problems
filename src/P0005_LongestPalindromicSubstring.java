import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P0005_LongestPalindromicSubstring {
    public static void main(String[] args) throws Exception {

    }

    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }

        boolean allIsPalindrome = true;
        for (int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                allIsPalindrome = false;
                break;
            }
        }
        if(allIsPalindrome) {
            return s;
        }

        List<String> memo = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0 ; i < s.length() ; i++){
            for (int j = i ; j <=s.length() ; j++){
                String candidate = s.substring(i,j);
                if((maxLength < candidate.length() ) &&  isPalindrome(candidate)){
                    memo.add(candidate);
                    maxLength = candidate.length();
                }
            }
        }

        return memo.stream().max(Comparator.comparing(String::length)).orElse("");
    }

    public boolean isPalindrome(String s){

        if(s.equals("")){
            return false;
        }

        for (int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
