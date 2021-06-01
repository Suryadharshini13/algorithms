import java.util.Arrays;

public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n<=2) return n;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static int bottomUp(int n) {
        int[] arr = new int[n+1];
        
        for(int i=0; i<=n; i++) {
            if (i<=2) arr[i] = i;
            else arr[i] = arr[i-1] + (i-1) * arr[i-2]; 
        }

        return arr[n];
    }

    public static int topDown(int n, int[] seq) {
        if (n<3) return seq[n];
        if (seq[n] != 0) return seq[n];
        return seq[n] = topDown(n-1, seq) + (n-1) * topDown(n-2, seq);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(friendsPairing(n));
        System.out.println(bottomUp(n));
        int[] seq = new int[n+1];
        for (int i=0; i<3; i++) seq[i] = i;
        System.out.println(topDown(n, seq));
    }
}
