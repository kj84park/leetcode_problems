package easy;

import java.util.ArrayList;
import java.util.List;

public class P0119_PascalsTriangle2 {
    public static void main(String[] args) throws Exception {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList();
        if(rowIndex < 1){
            return ret;
        }

        for (int i = 0 ; i < rowIndex+1 ; i++ ){
            ret.add(0,1);
            for (int j = 1 ; j < ret.size()-1 ; j++){
                ret.set(j , ret.get(j+1)+ret.get(j));
            }
        }
        return ret;
    }
}
