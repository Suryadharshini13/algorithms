import java.util.*;

public class SumTwoArrays {
    public static void splitNumber(int num, List<Integer> digits) {
        if (num>0) {
            splitNumber(num/10, digits);
            digits.add(num%10);
        }
    }

    public static void sumTwoArrays(int[] arr1, int[] arr2, int arr1_len, int arr2_len, int index, List<Integer> arr3) {
        if (index < arr1_len && index < arr2_len) {
            int sum = arr1[index] + arr2[index];
            if (sum > 9) splitNumber(sum, arr3);
            else arr3.add(sum);
            sumTwoArrays(arr1, arr2, arr1_len, arr2_len, index+1, arr3);
        }
        else if (index >= arr1_len-1 && index < arr2_len) {
            if (arr2[index] > 9) splitNumber(arr2[index], arr3);
            else arr3.add(arr2[index]);
            sumTwoArrays(arr1, arr2, arr1_len, arr2_len, index+1, arr3);
        }
        else if (index >= arr2_len-1 && index < arr1_len) {
            if (arr1[index] > 9) splitNumber(arr1[index], arr3);
            else arr3.add(arr1[index]);
            sumTwoArrays(arr1, arr2, arr1_len, arr2_len, index+1, arr3); 
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {23,5,2,7,87};
        int[] arr2 = new int[] {4,67,2,8};
        List<Integer> sum = new ArrayList<Integer>();
        sumTwoArrays(arr1, arr2, arr1.length, arr2.length, 0, sum);
        System.out.println(sum.toString());
    }
}
