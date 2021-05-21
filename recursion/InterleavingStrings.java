public class InterleavingStrings {
    public static void interleaving(String str1,String str2,String result){
        if(str1.length()<=0 && str2.length()<=0){
            System.out.println(result);
            return;
        }
        if(str1.length()>0) interleaving(str1.substring(1), str2, result+str1.charAt(0));
        if(str2.length()>0) interleaving(str1, str2.substring(1), result+str2.charAt(0));
        
    }
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "123";
        interleaving(str1,str2,"");

    }
}
