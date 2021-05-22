public class MaximumSubset {
    public static int maximumSubset(int[] arr, int pos, int product) {
        if (pos == arr.length) return product;
        return Math.max(maximumSubset(arr, pos+1, product), maximumSubset(arr, pos+1, arr[pos]*product));
    }

    public static void main(String[] args) {
        int[] arr1 = {-6,4,-5,8,-10,0,8};
        int[] arr2 = {4,-8,0,8};
        System.out.println(maximumSubset(arr1, 0, 1));
        System.out.println(maximumSubset(arr2, 0, 1));
    }
}
