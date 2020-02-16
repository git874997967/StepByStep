package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class getIntersectionNode {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

/*    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){

    }*/
    public static String[]  findRestaurant(String[] a,String[] b){
            int min=Integer.MAX_VALUE,sum=0;
            List<String> res=new LinkedList<>();
            HashMap<String,Integer> map=new HashMap<>();
            for (int i=0;i<a.length;i++){
                map.put(a[i],i);
            }
        for (int i = 0; i <b.length ; i++) {
                if(map.containsKey(b[i])){
                    // find it ;
                    sum=map.get(b[i])+i;
                    if(sum<min){   //update the result
                        res.clear();
                        res.add(b[i]);
                        min=sum;
                    }
                    if(sum==min){
                        res.add(b[i]);
                    }
                }
        }



        return res.toArray(new String[res.size()]);

    }



    public static void main(String[] args) {

    }



}
