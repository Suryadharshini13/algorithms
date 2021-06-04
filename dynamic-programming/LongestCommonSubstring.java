public class LongestCommonSubstring {
    public static int longestSubString(String a, String b, int m, int n, int count) {
        if (n == 0 || m == 0) return count;
        if (a.charAt(m-1) == b.charAt(n-1)) return longestSubString(a, b, m-1, n-1, count+1);
        count = Math.max(count, Math.max(longestSubString(a, b, m-1, n, count), longestSubString(a, b, m, n-1, count)));
        return count;
    }

    public static int bottomUp(String a, String b) {
        int[][] table = new int[a.length()+1][b.length()+1];
        int count = 0;
        for (int i=0; i<=a.length(); i++) {
            for (int j=0; j<=b.length(); j++) {
                if (i == 0 || j == 0) table[i][j] = 0;
                else if (a.charAt(i-1) == b.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                    count = Integer.max(count, table[i][j]);
                }
                else table[i][j] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = "el";
        System.out.println(longestSubString(a, b, a.length(), b.length(), 0));
        System.out.println(bottomUp(a, b));
    }
}