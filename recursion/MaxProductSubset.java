public class MaxProductSubset {
    public static int maxSubset(int[] inArray,int index,int product){
        if(index<inArray.length) 
            return Math.max(maxSubset(inArray,index+1,product),maxSubset(inArray,index+1,inArray[index]*product));
       return product;
    }
    public static void main(String[] args) {
        int[] inputArray1 = {-6,4,-5,8,-10,0,8};
        int[] inputArray2 = {4,-8,0,8};
        System.out.println(maxSubset(inputArray1,0,1));
        System.out.println(maxSubset(inputArray2,0,1));
    }
}
