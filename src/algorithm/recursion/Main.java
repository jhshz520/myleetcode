package recursion;

public class Main {
    public static void main(String[] args){
        System.out.println("fib:"+fib(10));
        int n = 10;
        int[] arr  = new int[n+1];
        arr[0] = arr[1] = 1;
        System.out.println("fib_array"+fib_array(n,arr));
        System.out.println("fib_full_array"+fib_full_array(n));

        System.out.println("fib_roll_array:"+fib_roll_array(n));
        System.out.println("fib_var:"+fib_var(n));
        System.out.println("fib_formula:"+fib_formula(n));
    }
    public static int fib(int n){
        if(n<=2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static int fib_array(int n,int []array){
        if(n<=2) return 1;
        if(array[n]==0){
            array[n] = fib_array(n-1,array)+fib_array(n-2,array);
        }
        return array[n];
    }

    public static int fib_full_array(int n){
        if(n<=2) return 1;
        int[] arr = new int[n+1];
        arr[2] = arr[1] = 1;
        for(int i = 3;i<=n;i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
    }

    public static int fib_roll_array(int n){
        if(n<=2) return 1;
        int[] arr = new int[2];
        arr[1] = arr[0] = 1;
        for(int i = 3;i<=n;i++){
            arr[i%2] = arr[(i-2)%2] + arr[(i-1)%2];
        }
        return arr[n%2];
    }

    public static int fib_var(int n){
        if(n<=2) return 1;
        int a = 1;
        int b = 1;
        for(int i = 3;i<=n;i++){
            b = a + b;
            // 此时的b是b为原来a和b的和，所以原来的b就是现在的b与现在的a的差
            a = b - a ;
        }
        return b;
    }

    public static int fib_formula(int n){
        double c = Math.sqrt(5);
        return (int)((Math.pow((1+c)/2,n)-Math.pow((1-c)/2,n))/c);
    }
}
