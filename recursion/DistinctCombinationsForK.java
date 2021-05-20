import java.util.Arrays;

public class DistinctCombinationsForK {
    public static void distinctCombinations(int[] arr, int index, int k, int[] sequence, int seq_index) {
        if (k == 0) {
            System.out.println(Arrays.toString(sequence));
            return;
        }
        for (int i=index; i<arr.length-1; i++) {
            if (seq_index == 0) {
                sequence[seq_index] = arr[i];
                distinctCombinations(arr, i, k-1, sequence, seq_index+1);
            } else {
                sequence[seq_index] = arr[i+1];
                distinctCombinations(arr, i+1, k-1, sequence, seq_index+1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        int[] seq = new int[2];
        distinctCombinations(arr, 0, 2, seq, 0);
    }
}