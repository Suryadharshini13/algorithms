import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
//import jdk.internal.org.jline.utils.InputStreamReader;

public class removeStringDuplicate {

    public static String remDuplicate(String str,int current,int next,String result)
    {
        if(next==str.length())
        {
            result = result + str.charAt(current);
            return result;
        }
        else if(str.charAt(current)!=str.charAt(next) && current<str.length() && next<str.length())
        {
            result= result + str.charAt(current);
            result = remDuplicate(str, current+1, next+1,result);
        }
        else if(str.charAt(current)==str.charAt(next) && current<str.length() && next<str.length())
        {
            result = remDuplicate(str, current+1, next+1,result);
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str = br.readLine();
        int current=0,next=1;
        String result = "";
        String s = remDuplicate(str,current,next,result);
        System.out.println(s);
    }
}
