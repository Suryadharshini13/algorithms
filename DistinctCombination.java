import java.util.Arrays;

public class DistinctCombination {
    public static void distinctCombination(int[] arr, int k, int index,int[] seq,int seq_index) {
        if (k==0) {
            System.out.println(Arrays.toString(seq));
            return;
        }
        
        for (int i=index; i<arr.length-1 ; i++) {
            if(seq_index==0) {
                seq[seq_index] = arr[i];
                distinctCombination(arr, k-1, i, seq,seq_index+1);
            }
            else{
                seq[seq_index] = arr[i+1];
                distinctCombination(arr, k-1, i+1, seq,seq_index+1);
            }
        }
    }
    public static void main(String[] args) {
       int[] arr = {1,2,1,4};
       int k = 3;
       int[] seq = new int[k];
       distinctCombination(arr,k,0,seq,0);
   } 
}