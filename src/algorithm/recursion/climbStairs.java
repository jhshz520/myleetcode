package recursion;

public class climbStairs {
    public static void main(String[] args){
        int n = 10;
        System.out.println(climb(n));
    }
    public  static int climb(int n){
        if(n<=2) return n;
        return climb(n-1)+climb(n-2);
    }

}
