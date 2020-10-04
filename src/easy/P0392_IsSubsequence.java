package easy;

public class P0392_IsSubsequence {
    public static void main(String[] args) throws Exception {
        System.out.println(isSubsequence("",""));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s == null | s.length() == 0){
            return true;
        }
        if(t == null | t.length() == 0 ){
            return false;
        }

        int j = 0;

        for(int i = 0; i < t.length();i++){
            if(t.charAt(i)== s.charAt(j)){
                j++;
                if(j == s.length()){
                    return true;
                }
            }
        }

        return false;
    }
}
