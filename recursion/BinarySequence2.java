public class BinarySequence2 {
    public static void checkEqualSum(String seq,int left,int right,int leftsum,int rightsum) {
        if(left==0 && right==seq.length() && leftsum==rightsum) {
            System.out.println(seq); return;
        }
        if(left!=0) {
            leftsum += Integer.parseInt(String.valueOf(seq.charAt(left-1)));
            checkEqualSum(seq, left-1, right, leftsum, rightsum);
        }
        else if(right!=seq.length()) {
            rightsum += Integer.parseInt(String.valueOf(seq.charAt(right)));
            checkEqualSum(seq, left, right+1, leftsum, rightsum);
        }
    }
    public static void binarySequence(int n,int k,String seq) {
        if(k==0) {
            checkEqualSum(seq,n,n,0,0);return;
        }
        if(k!=0) {
            binarySequence(n,k-1, seq+"0");
            binarySequence(n,k-1, seq+"1");
        }
    }
    public static void main(String[] args) {
        int n=2;
        binarySequence(n,n*2,"");
        
    }
    
}
