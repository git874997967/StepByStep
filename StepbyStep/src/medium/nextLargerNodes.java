package medium;

import java.lang.reflect.Array;
import java.util.*;

public class nextLargerNodes {
        public static class ListNode{
            int val;
            ListNode next;
            ListNode(int x){
                this.val=x;
            }
        }
    public static int[] nextLargerNodes(ListNode head){
        List<Integer> result=new LinkedList<>();
        while(head!=null){
            result.add(getLarger(head));
            head=head.next;
        }

        return  result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int getLarger(ListNode head){
            ListNode cur=head;
            while(cur!=null){
                    if(cur.val>head.val) {
                        return cur.val;
                    }
                cur=cur.next;
            }

            return 0;
    }
    // use monotic stack
    public static int[]  nextLargerNodes2(ListNode head){
            Stack<Integer> stack=new Stack<>();
            List<Integer> list=new ArrayList<>();
            while(head!=null){
                list.add(head.val);
                head=head.next;
            }


            int size=list.size()-1;
            int[]res=new int[list.size()];
            while(size>=0){
                while(!stack.isEmpty()&&list.get(size)>stack.peek()){
                    stack.pop();
                }
                res[size]=stack.isEmpty()?0:stack.peek();
                stack.push(list.get(size));
                size--;
            }
            return  res;
    }
    public static int[]  nextLargeNodes2(ListNode head){
            Stack<Integer> stack=new Stack<>();
            List<Integer> list=new ArrayList<>();

            while(head!=null){
                list.add(head.val);
                head=head.next;
            }
             int size=list.size()-1;
            int[] res=new int[list.size()];
        for (int i = 0; i <=size ; i++) {
           while(!stack.isEmpty()&&list.get(i)>list.get(stack.peek())){
               res[stack.pop()]=list.get(i);
           }

           stack.push(i);

        }
        return  res;
    }



    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(7);
        head.next.next=new ListNode(5);
        head.next.next.next=new ListNode(1);
         head.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next.next=new ListNode(1);

        ListNode h2=new ListNode(2);
        h2.next=new  ListNode(1);
        h2.next.next=new ListNode(5);
        int[] res=nextLargeNodes2(h2);
        for (int i:res){
             System.out.println(i);
        }
    }
}
