package easy;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Stack;

public class intToString {
            public static  String intToString(int test){
            Stack<Integer> stack=new Stack<>();
                       while(test>0){
                           int mod=test%10;
                           test=test/10;
                           stack.push(mod);
                       }
                  StringBuffer sb=new StringBuffer();
                       for(int i: stack){
                           sb.append(i);
                       }

                    return  sb.toString();
            }
        public static int intReverse (int test){
           int rev=0;
           while(test!=0){
               int mod=test%10;
               test=test/10;
               if(rev>Integer.MAX_VALUE/10||(Integer.MAX_VALUE/10==rev&&mod>7)){
                   return 0;
               }
               if(rev<Integer.MIN_VALUE/10||(Integer.MIN_VALUE/10==rev&&mod<-8)){
                   return 0;
               }
               rev=rev*10+mod;
           }
            return  rev;

        }
    public static void main(String[] args) {
        int test=1534236469;
              // 2147483647;
       // System.out.println(intToString(test));
      //  System.out.println(Integer.MAX_VALUE);
        System.out.println(intReverse(test));

    }
}
