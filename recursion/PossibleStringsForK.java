public class PossibleStringsForK {
    public static void possibleStringsForK(String arr, String output, int k, int index) {
        if (k == 0) {
            System.out.println(output);
        }
        if (k > 0) {
            for (int i=0; i<arr.length(); i++) {
                possibleStringsForK(arr, output+arr.charAt(i), k-1, i);
            }   
        }
    }
    
    public static void main(String[] args) {
        String arr = "ab";
        possibleStringsForK(arr, "", 3, 0);
    }
}
