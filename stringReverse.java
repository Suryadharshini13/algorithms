import java.io.BufferedReader;
import java.io.*;

public class stringReverse {

    public static String reverse(String str,int currentPosition,String revStr)
    {
        if(currentPosition<0)
        return revStr;
        else
        {
            revStr = revStr+str.charAt(currentPosition);
            revStr = reverse(str, currentPosition-1, revStr);
        }
        return revStr;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String:");
        String str = br.readLine();
        String revStr = "";
        int currentPosition = str.length()-1;
        String result = reverse(str,currentPosition,revStr);
        System.out.println(result);

    }
}
