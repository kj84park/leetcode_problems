package medium;

import java.util.ArrayList;
import java.util.List;

public class P0017_LetterCombinationsOfaPhoneNumber {
    public static void main(String[] args) throws Exception {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        String[] inputs = digits.split("");
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ret = new ArrayList<>();
        dfs(0,"",digits,map,ret);
        return ret;
    }

    public static void dfs(int index ,String result,String digits, String[] map, List<String> ret){
        if(result.length() == digits.length()){
            ret.add(result);
            return;
        }
        for (int i = index ; i < digits.length() ; i++){
            String str = map[Integer.parseInt(String.valueOf(digits.charAt(i)))];
            for (char ch : str.toCharArray()) {
                dfs(i+1,result+ch, digits, map, ret);
            }
        }
    }
}
