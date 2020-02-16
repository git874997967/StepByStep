package medium;

import java.util.Stack;

public class dailyTemperatures {

    public static int[] dailyTemperatures(int[] T){
        int[] res=new int[T.length];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i <T.length ; i++) {
            while(!stack.isEmpty()&&T[i]>T[stack.peek()]){
                // eg  74>73   and only 2 elements
                // we will update all the element from 74 to the one that first smaller than 74   coz we have the index stored
                //means we should calc the distance.
                int loc=stack.pop();
                res[loc]=i-loc;
            }

            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] T={73,74,75,71};
        int[] res=dailyTemperatures(T);
        for(int i:res){
            System.out.println(i);
        }


    }
}
