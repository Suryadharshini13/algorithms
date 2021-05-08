public class StringPalindrome {
    public static boolean checkPalindrome(String value, int start, int end) {
        if (value.charAt(start) != value.charAt(end)) return false;
        if (start>=end) return true;
        return checkPalindrome(value, start+1, end-1);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("Rubesh", 0, "Rubesh".length()-1));
        System.out.println(checkPalindrome("malayalam", 0, "malayalam".length()-1));
    }
}
