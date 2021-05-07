import java.io.BufferedReader;

import javax.lang.model.util.ElementScanner14;

import jdk.dynalink.beans.StaticClass;

import java.io.*;
//import jdk.internal.org.jline.utils.InputStreamReader;

class stringpalindrome{

    static Boolean palindrome(String str,int first,int last)
    {
        if(first == last)
        return true;
        else if(str.charAt(first)==str.charAt(last) && last-first>1)
        {
            return palindrome(str, first+1, last-1);
        }
        else if(str.charAt(first)==str.charAt(last) && last-first<=1)
        return true;
        return false;
    }
    public static void main(String[] args) throws  IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        String str = bf.readLine();
        int strlen = str.length();
        if(palindrome(str,0,strlen-1))
        System.out.println("The given string is palindrome");
        else
        System.out.println("The given string is not palindrome");

    }
}