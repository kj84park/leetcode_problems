import java.util.ArrayList;
import java.util.List;

public class P0012_IntegerToRoman {
    public static void main(String[] args) throws Exception {

        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {

        List<String> list = new ArrayList<>();
        convertToRoman(num,list);

        StringBuilder result = new StringBuilder();
        for(String a : list){
            result.append(a);
        }
        return result.toString();
    }

    public static void convertToRoman(int num, List<String> list){
        if(num <= 0){
            return;
        }
        else if(num < 4){
            num -= 1;
            list.add("I");
        } else if(num == 4){
            num -= 4;
            list.add("IV");
        }else if(num < 9){
            num -= 5;
            list.add( "V");
        }else if(num == 9){
            num -= 9;
            list.add( "IX");
        }else if(num < 40){
            num -= 10;
            list.add( "X");
        }else if(num < 50){
            num -= 40;
            list.add( "XL");
        }else if(num < 90){
            num -= 50;
            list.add( "L");
        }else if(num < 100){
            num -= 90;
            list.add( "XC");
        }else if(num < 400){
            num -= 100;
            list.add( "C");
        }else if(num < 500){
            num -= 400;
            list.add("CD");
        }else if(num < 900){
            num -= 500;
            list.add( "D");
        }else if(num < 1000){
            num -= 900;
            list.add("CM");
        }else {
            num -= 1000;
            list.add( "M");
        }
        convertToRoman(num,list);
    }
}
