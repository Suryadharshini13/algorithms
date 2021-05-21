public class BinarySequenceForK {
    public static void binarySequence(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        binarySequence(n-1, s+"0");
        if (s.length() < 1 || s.charAt(s.length()-1) != '1') {
            binarySequence(n-1, s+"1");
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        binarySequence(n, "");
    }
}