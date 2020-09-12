public class P0007_ReverseInteger {
    public static void main(String[] args) throws Exception {

    }

    public int reverse(int x) {
        String numString = String.valueOf(x);
        String reverseString = "";
        if(numString.charAt(0) == '-'){
            reverseString = '-' + new StringBuffer(numString.substring(1,numString.length())).reverse().toString();
        } else {
            reverseString =  new StringBuffer(numString.substring(0,numString.length())).reverse().toString();
        }
        try {
            int result = Integer.parseInt(reverseString);
            return result;
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
