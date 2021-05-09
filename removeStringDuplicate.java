import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
//import jdk.internal.org.jline.utils.InputStreamReader;

public class removeStringDuplicate {

    public static String remDuplicate(String str,int currPtr,int nextPtr,String newStr)
    {
        if(nextPtr==str.length())
        {
            newStr = newStr + str.charAt(currPtr);
            return newStr;
        }
        else if(str.charAt(currPtr)!=str.charAt(nextPtr) && currPtr<str.length() && nextPtr<str.length())
        {
            newStr= newStr + str.charAt(currPtr);
            newStr = remDuplicate(str, currPtr+1, nextPtr+1,newStr);
        }
        else if(str.charAt(currPtr)==str.charAt(nextPtr) && currPtr<str.length() && nextPtr<str.length())
        {
            newStr = remDuplicate(str, currPtr+1, nextPtr+1,newStr);
        }
        return newStr;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str = br.readLine();
        int currPtr=0,nextPtr=1;
        String newStr = "";
        String result = remDuplicate(str,currPtr,nextPtr,newStr);
        System.out.println(result);
    }
}
