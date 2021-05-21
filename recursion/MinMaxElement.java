public class MinMaxElement {
    public static void minMax(int[] arr,int index,int min,int max){
        if(index == arr.length) {
            System.out.println("Min: "+min+" Max: "+max);
            return;
        }
        else minMax(arr, index+1,Math.min(arr[index],min), Math.max(arr[index], max));
    }
    public static void main(String[] args) {
        int[] arr = {10,0,-1,9,2,-5,13,-26};
        minMax(arr,0,arr[0],arr[0]);
    }
}
