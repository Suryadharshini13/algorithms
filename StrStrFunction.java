public class StrStrFunction {
    public static int strstrFunction(String text1, String text2, int index) {
        if (text1.length() == index+1) return -1;
        if (text1.charAt(0) == text2.charAt(index)) {
            if (text1.equals(text2.substring(index, index+text1.length()))) {
                return index;
            }  
        } 
        return strstrFunction(text1, text2, index+1);
    }
    
    public static void main(String[] args) {
        System.out.println(strstrFunction("ond", "Wonderful", 0));
    }
    
}