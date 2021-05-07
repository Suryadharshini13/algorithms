import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class addArray {

    public static void splitNum(List<Integer> c,int n)
    {
        if(n>0)
        {
            splitNum(c,n/10);
            c.add(n%10);
        }
    }
    public static void add(int[] a,int[] b,List<Integer> c,int alength,int blength,int a_current,int b_current)
    {
        if(a_current<alength && b_current< blength)
        {
            int t =a[a_current]+b[b_current];
            splitNum(c,t);
            add(a,b,c,alength,blength,a_current+1,b_current+1);
        }
        else if(a_current<alength)
        {
            splitNum(c,a[a_current]);
            add(a,b,c,alength,blength,a_current+1,b_current+1);
        }
        else if(b_current<blength)
        {
            splitNum(c,b[b_current]);
            add(a, b, c, alength, blength, a_current+1, b_current+1);
        }
        }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of element in Array A");
        int alength = scan.nextInt();
        System.out.println("Enter Array A elements");
        int[] a = new int[alength];
        for(int i=0;i<alength;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the number of element in Array B");
        int blength = scan.nextInt();
        System.out.println("Enter Array B elements");
        int[] b = new int[blength];
        for(int i=0;i<blength;i++)
        {
            b[i]=scan.nextInt();
        }
        List<Integer> c = new ArrayList<>();
        int a_current=0,b_current=0;
        add(a,b,c,alength,blength,a_current,b_current);
        System.out.println(c);
    }

}
