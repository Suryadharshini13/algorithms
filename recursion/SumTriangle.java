public class SumTriangle {
    public static void sumTriangle(int[]arr,int[] sum,int index)
    {
        if(index == arr.length-1){
            if(index==1){
                System.out.println(sum[0]);
                return;
            }
            sumTriangle(sum, new int[index-1], 0);
        }
        else if(index<arr.length-1){
            sum[index]=arr[index]+arr[index+1];
            sumTriangle(arr, sum, index+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] sum = new int[arr.length-1];
        sumTriangle(arr,sum,0);
    }
}
