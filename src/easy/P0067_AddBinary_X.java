package easy;

public class P0067_AddBinary_X {
    public static void main(String[] args) throws Exception {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {

        int sum = convertToInt(a) + convertToInt(b);

        return convertToBinary(sum);
    }

    public static int convertToInt(String binary) {
        int result = 0;
        for (int i = binary.length()-1; i > -1; i--) {
            if (binary.charAt(i) == '1') {
                if (i == 0) {
                    result += 1;
                } else if (i == 1) {
                    result += 2;
                } else if (i == 2) {
                    result += 4;
                } else if (i == 3) {
                    result += 8;
                } else if (i == 4) {
                    result += 16;
                }
            }
        }
        return result;
    }
    public static String convertToBinary(int num) {
        int result = 0;
        while(num/2 != 0) {
            result = num/2;
            num = num/2;
        }

        return "";
    }
}