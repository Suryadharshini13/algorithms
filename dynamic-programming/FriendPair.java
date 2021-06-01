public class FriendPair {
    static int n = 5;
    static int arr[] = new int[n-2];
    static int arr1[] = new int[n+1];
    public static int friendPairRec(int n) {
        if(n <= 2) {
            return n;
        }
        else {
            return friendPairRec(n-1) + friendPairRec(n-2)*(n-1); 
        }
    }
    public static int friendPairMemoization(int n) {
        if(n<=2) {
            return n;
        }
        if(arr[n-3]>0) {
            return arr[n];
        }
        else {
            arr[n-3] = friendPairRec(n-1) + friendPairRec(n-2)*(n-1);
        }
        return arr[n-3];
    }

    public static int friendPairTabulation(int n) {
        if(n<3) {
            return n;
        }
        int a = 1;
        int b = 2;
        int t = 0;
        for(int i=3;i<=n;i++) {
            t = b + a*(i-1);
            a = b;
            b = t; 
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(friendPairRec(n));
        System.out.println(friendPairMemoization(n));
        System.out.println(friendPairTabulation(n));
    }
}
