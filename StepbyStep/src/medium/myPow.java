package medium;

public class myPow {
        public  static  double myPow(double x,int n){
                long N=n;
                if(N<0){
                    n=-n;
                    x=1/x;
                }

                return  doPow(x,n);

        }
        public  static  double doPow(double x,int n)
        {

            if(n==0) return 1;
            double half=doPow(x,n/2);
            if(n%2==0){      ///   even number  pow(2,4) =(2*2)  *（2*2)
                return half* half;
            }
            else                    //   odd number  pow(2,5) =  pow(2,4)*2   = (2*2)  * (2*2)  *2   one more time
            {
                       return x* half*half;
            }
        }


    public static void main(String[] args) {
        double x=2.00;
        int n=10;
        double result1=myPow(x,n);
        System.out.println(result1);
        double x1=2.00;
        int n1=-2;
        double result2=myPow(x1,n1);
        System.out.println(result2);

        System.out.println(Math.pow(3.2,0));
    }



}
