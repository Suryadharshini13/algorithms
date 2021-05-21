public class BalancedParantheses {
    int c=0;

    public static void balancedParantheses(int n,String result,int left,int right) {
        if(n==0) {
            System.out.println(result);
            return;
        }
        if(left>0) {
            balancedParantheses(n-1, result+"(",left-1,right);
        }
        if(right>left) {
            balancedParantheses(n-1, result+")",left,right-1);
        }
    }
    public static void main(String[] args) {
        int n = 6;
        if(n%2==0) balancedParantheses(n,"",n/2,n/2);
        else System.out.println("Invalid Input");
    }
}
