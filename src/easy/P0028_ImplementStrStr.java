package easy;

public class P0028_ImplementStrStr {

    public static void main(String[] args) throws Exception {
        System.out.println(strStr("aaa", "a"));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (haystack.equals(needle) ) {
            return 0;
        }

        for (int i = 0; i+needle.length() <= haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                for (int j = 0; j < needle.length() && i+j < haystack.length(); j++) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }
                    if(j == needle.length()-1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
