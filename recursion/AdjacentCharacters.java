public class AdjacentCharacters {
    public static String removeAdjacentCharacters(String text) {
        if (text.length() == 1) return text;
        if (text.charAt(0)==text.charAt(1)) return removeAdjacentCharacters(text.substring(1));
        return text.charAt(0) + removeAdjacentCharacters(text.substring(1));
    }
    
    public static void main(String[] args) {
        System.out.println(removeAdjacentCharacters("AAABBBCDDDAAAARRRREEEECDD"));
    }
    
}