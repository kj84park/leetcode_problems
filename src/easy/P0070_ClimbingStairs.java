package easy;

public class P0070_ClimbingStairs {
    public static void main(String[] args) throws Exception {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int[] mem = new int[n+1];

        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if (n == 3) {
            return 3;
        }
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;
        mem[3] = 3;
        for(int i = 4 ; i <= n ; i++){
            mem[i] = mem[i-1]+mem[i-2];
        }

        return mem[mem.length-1];
    }
}
