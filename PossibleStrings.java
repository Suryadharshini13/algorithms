public class PossibleStrings {
    public static void possibleStrings(String str,int k,String result){
        if(k==0){
            System.out.println(result);
        }
        if(k>0){
            for(int i=0;i<str.length();i++){
                possibleStrings(str, k-1, result+str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String str = "ab";
        possibleStrings(str,3,"");
    }
}
