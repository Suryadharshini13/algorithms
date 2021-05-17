public class StringReversal {
    public static String reverseString(String text) {
        if (text.length() == 1) return text;
        return reverseString(text.substring(1)) + text.charAt(0);
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("Rock"));
    }
}
