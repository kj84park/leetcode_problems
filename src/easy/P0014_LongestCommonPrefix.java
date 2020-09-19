package easy;

public class P0014_LongestCommonPrefix {

    public static void main(String[] args) throws Exception {

        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
    public static String longestCommonPrefix(String[] strs){

        if(strs.length == 0){
            return "";
        }

        String ret = strs[0];

            for (int i = 0 ; i < strs.length ; i++ ){
                for(int j = 0 ; j < ret.length(); j++) {
                    if ((strs[i].length() > j) && ret.charAt(j) == (strs[i].charAt(j))) {

                    } else {
                        if(j == 0){
                            return "";
                        } else {
                            ret = ret.substring(0,j);
                        }
                    }
                }
            }
            return ret;
    }
}
