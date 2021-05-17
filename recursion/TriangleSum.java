import java.util.Arrays;

public class TriangleSum {

    public static void printTriangleSum(int[] arr) {
        if (arr.length < 1) return;

        int[] temp = new int[arr.length-1];
        for (int i=0; i<temp.length; i++) {
            temp[i] = arr[i] + arr[i+1];
        }
        
        printTriangleSum(temp);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        printTriangleSum(arr);
    }
}
