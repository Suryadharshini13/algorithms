public class BalancedParanthesis {
    public static void balancedParanthesis(int n, int ob, int cb, String seq) {
        if (n == 0) {
            System.out.println(seq);
            return;
        }

        if (ob > 0) {
            balancedParanthesis(n-1, ob-1, cb, seq+"(");
        }

        if (cb > 0 && cb > ob) {
            balancedParanthesis(n-1, ob, cb-1, seq+")");
        }
    }

    public static void main(String[] args) {
        int n = 4;
        balancedParanthesis(n, n/2, n/2, "");
    }
}