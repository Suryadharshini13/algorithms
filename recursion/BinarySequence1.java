public class BinarySequence1 {
    public static void withoutConsecutive1s(int n,String result) {
        if(n==0) {
            System.out.println(result);
            return;
        }
        if(n!=0) {
            withoutConsecutive1s(n-1, result+"0");
            if(result.length()==0 ||result.charAt(result.length()-1)!='1')
            withoutConsecutive1s(n-1, result+"1");
        }
    }
    public static void main(String[] args) {
        int n=3;
        withoutConsecutive1s(n,"");
    }
}
