import java.util.Arrays;

public class MinOperations {
    public static int minOperations(int n) {
        if (n<=3) return n;
        if (n%2==0) return Math.min(1+minOperations(n/2), 1+minOperations(n-1));
        return 1+minOperations(n-1);
    }

    public static int topDown(int n, int[] arr) {
        if (arr[n]!=0) return arr[n];
        if (n%2==0) return arr[n] = Math.min(1+topDown(n/2, arr), 1+topDown(n-1, arr));
        return arr[n] = (1+topDown(n-1, arr));
    }

    public static int bottomUp(int n, int[] arr) {
        if(n<=3) return arr[n];

        for(int i=4; i<=n; i++) {
            if (i%2 == 0) arr[i] = Math.min(1+arr[i/2], 1+arr[i-1]);
            else arr[i] = 1 + arr[i-1];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(minOperations(n));
        int[] arr = new int[n+1];
        for(int i=0;i<=3;i++) arr[i] = i;
        System.out.println(topDown(n, arr));
        System.out.println(bottomUp(n, arr));
    }
}