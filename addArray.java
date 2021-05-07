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
    public static void add(int[] a,int[] b,List<Integer> c,int alen,int blen,int af,int bf)
    {
        if(af<alen && bf< blen)
        {
            int t =a[af]+b[bf];
            splitNum(c,t);
            add(a,b,c,alen,blen,af+1,bf+1);
        }
        else if(af<alen)
        {
            splitNum(c,a[af]);
            add(a,b,c,alen,blen,af+1,bf+1);
        }
        else if(bf<blen)
        {
            splitNum(c,b[bf]);
            add(a, b, c, alen, blen, af+1, bf+1);
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in Array A");
        int alen = sc.nextInt();
        System.out.println("Enter Array A elements");
        int[] a = new int[alen];
        for(int i=0;i<alen;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number of element in Array B");
        int blen = sc.nextInt();
        System.out.println("Enter Array B elements");
        int[] b = new int[blen];
        for(int i=0;i<blen;i++)
        {
            b[i]=sc.nextInt();
        }
        List<Integer> c = new ArrayList<>();
        int af=0,bf=0;
        add(a,b,c,alen,blen,af,bf);
        System.out.println(c);
    }

}
