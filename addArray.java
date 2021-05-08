import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class addArray {

    public static void splitNum(List<Integer> resultArr,int sum)
    {
        if(sum>0)
        {
            splitNum(resultArr,sum/10);
            resultArr.add(sum%10);
        }
    }
    public static void add(int[] array_A,int[] array_B,List<Integer> resultArr,int array_A_len,int array_B_len,int A_currPtr,int B_currPtr)
    {
        if(A_currPtr<array_A_len && B_currPtr< array_B_len)
        {
            int sum =array_A[A_currPtr]+array_B[B_currPtr];
            splitNum(resultArr,sum);
            add(array_A,array_B,resultArr,array_A_len,array_B_len,A_currPtr+1,B_currPtr+1);
        }
        else if(A_currPtr<array_A_len)
        {
            splitNum(resultArr,array_A[A_currPtr]);
            add(array_A,array_B,resultArr,array_A_len,array_B_len,A_currPtr+1,B_currPtr+1);
        }
        else if(B_currPtr<array_B_len)
        {
            splitNum(resultArr,array_B[B_currPtr]);
            add(array_A, array_B, resultArr, array_A_len, array_B_len, A_currPtr+1, B_currPtr+1);
        }
        }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of element in array A");
        int array_A_len = scan.nextInt();
        System.out.println("Enter array A elements");
        int[] array_A = new int[array_A_len];
        for(int i=0;i<array_A_len;i++)
        {
            array_A[i] = scan.nextInt();
        }
        System.out.println("Enter the number of element in array B");
        int array_B_len = scan.nextInt();
        System.out.println("Enter array B elements");
        int[] array_B = new int[array_B_len];
        for(int i=0;i<array_B_len;i++)
        {
            array_B[i]=scan.nextInt();
        }
        List<Integer> resultArr = new ArrayList<>();
        int A_currPtr=0,B_currPtr=0;
        add(array_A,array_B,resultArr,array_A_len,array_B_len,A_currPtr,B_currPtr);
        System.out.println(resultArr);
    }

}
