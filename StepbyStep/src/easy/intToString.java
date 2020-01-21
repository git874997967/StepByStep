package easy;

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

    public static void main(String[] args) {
        int test=123456;
        System.out.println(intToString(test));
    }
}
