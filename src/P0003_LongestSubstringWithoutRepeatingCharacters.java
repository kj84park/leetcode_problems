public class P0003_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) throws Exception {

    }

    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0 ; i < s.length() ; i++){
            String result = "";

            if(s.length()-i <= max){
                return max;
            }

            for (int j = i ; j < s.length() ; j++){
                char ch = s.charAt(j);
                if(!result.contains(String.valueOf(ch))){
                    result += ch;
                } else {
                    break;
                }
            }
            max = Math.max(result.length(),max);
        }
        return  max;
    }
}
