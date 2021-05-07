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
    public static void add(int[] arrA,int[] arrB,List<Integer> resultArr,int arrA_len,int arrB_len,int A_currPtr,int B_currPtr)
    {
        if(A_currPtr<arrA_len && B_currPtr< arrB_len)
        {
            int sum =arrA[A_currPtr]+arrB[B_currPtr];
            splitNum(resultArr,sum);
            add(arrA,arrB,resultArr,arrA_len,arrB_len,A_currPtr+1,B_currPtr+1);
        }
        else if(A_currPtr<arrA_len)
        {
            splitNum(resultArr,arrA[A_currPtr]);
            add(arrA,arrB,resultArr,arrA_len,arrB_len,A_currPtr+1,B_currPtr+1);
        }
        else if(B_currPtr<arrB_len)
        {
            splitNum(resultArr,arrB[B_currPtr]);
            add(arrA, arrB, resultArr, arrA_len, arrB_len, A_currPtr+1, B_currPtr+1);
        }
        }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of element in Array A");
        int arrA_len = scan.nextInt();
        System.out.println("Enter Array A elements");
        int[] arrA = new int[arrA_len];
        for(int i=0;i<arrA_len;i++)
        {
            arrA[i] = scan.nextInt();
        }
        System.out.println("Enter the number of element in Array B");
        int arrB_len = scan.nextInt();
        System.out.println("Enter Array B elements");
        int[] arrB = new int[arrB_len];
        for(int i=0;i<arrB_len;i++)
        {
            arrB[i]=scan.nextInt();
        }
        List<Integer> resultArr = new ArrayList<>();
        int A_currPtr=0,B_currPtr=0;
        add(arrA,arrB,resultArr,arrA_len,arrB_len,A_currPtr,B_currPtr);
        System.out.println(resultArr);
    }

}
