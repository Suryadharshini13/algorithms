public class StrStr {
    public static int strstr(String str,String substr,int str_index){
        if(substr.length()>str.length()) return -1;
        else if(str.substring(0, substr.length()).equals(substr)) return str_index;
        else return strstr(str.substring(1), substr, str_index+1);
    }
    public static void main(String[] args) {
        String str = "another string ";
        System.out.println(strstr(str,"string",0));
    }
    
    
}
