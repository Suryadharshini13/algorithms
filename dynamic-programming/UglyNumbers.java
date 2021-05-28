public class UglyNumbers {
    public static int uglyNumber(int n) {
        int t=1;
        if(n>1) {
            System.out.println(t);
            while(n>1) {
               ++t;
               int i = t;
                   while(i%2==0)
                       i=i/2;
                    while(i%3==0)
                        i=i/3;
                    while(i%5==0)
                        i=i/5;
                    if(i==1){
                        //System.out.println(t);
                        n--;
                    } 
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int n = 150;
        int res = uglyNumber(n);
        System.out.println(res);
    }
}
