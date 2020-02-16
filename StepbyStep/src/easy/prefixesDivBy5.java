package easy;

import java.util.List;

public class prefixesDivBy5 {
public static  boolean[] prefixesDivBy5(int[] A){
    boolean[] res=new boolean[A.length];
   int sum=0;
    for (int i = 0; i <A.length ; ++i) {


     //   sum=((sum<<1)|A[i]%5);
      //  result=sum<<5==0?true:false;
       // res[i]=result;
        sum = ((sum << 1) | A[i]) % 5;
        System.out.println((sum==0)+" "+sum);
        res[i] = (sum == 0);

    }

        return res;
}

    public static void main(String[] args) {
        int[] A={0,1,1};
        boolean[]  res=prefixesDivBy5(A);
        for(boolean r : res){
            System.out.println(r);
        }
       /* int[] B={0,1,1,1,1,1};
        boolean[] res2=prefixesDivBy5(B);
        for (boolean r:res2){
            System.out.println(r);
        }*/
    }
}
