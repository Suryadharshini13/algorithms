public class MinimumOperation {
    static int n = 7;
    static int arr1[] = new int[n+1];
    static int arr2[] = new int[n+1];
    
    public static int minimumOperationRec(int n) {
        if(n <= 3) return n;
        if(n%2 != 0) return minimumOperationRec(n-1)+1;
        return Math.min(minimumOperationRec(n-1),minimumOperationRec(n/2))+1;
    }
    
    public static int minimumOperationMemoization(int k) {
        if(k <= 3) return k;
        if(arr1[k] != 0) return arr1[k];
        if(k%2 != 0) arr1[k] = minimumOperationMemoization(k-1)+1;
        else arr1[k] = Math.min(minimumOperationMemoization(k-1),minimumOperationMemoization(k/2))+1;

        return arr1[k];
    }
    public static int minimumOperationTabulation(int n) {
        if(n <= 3) return n;
        for(int i=0; i <= n; i++) {
            if(i <= 3) arr2[i] = i;
            else if(i%2 != 0) arr2[i] = arr2[i-1]+1;
            else arr2[i] = Math.min(arr2[i/2], arr2[i-1])+1;
        }
        return arr2[n];
    }
    public static void main(String[] args) {
        System.out.println(minimumOperationRec(n));
        System.out.println(minimumOperationMemoization(n));
        System.out.println(minimumOperationTabulation(n));
    }
}
