package easy;

public class P0009_PalindromeNumber {
    public static void main(String[] args) throws Exception {

    }
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);

        for(int i = 0 ; i < num.length() / 2 ; i++ ){
            if(num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
