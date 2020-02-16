package easy;

import java.awt.*;
import java.util.ArrayList;

public class isPalindrome {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }


    public static boolean isPalindrome(int x){
        int rev=0;
        int origin=Math.abs(x);
        while(x!=0){
            int mod=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&mod>7)){
                return  false;
            }
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&mod<-8)){
                return  false;
            }
            rev=rev*10+mod;
        }
        System.out.println(rev);
        return origin==rev;
    }

    public static  boolean isPalindrome2(ListNode head){
        ArrayList<Integer>  list= new ArrayList<>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        int front=0;
        int back=list.size()-1;
        while(front<back){
            if(!list.get(front).equals(list.get(back))){
                System.out.println(list.get(front)+" "+list.get(back));
                return  false;
            }
            front++;
            back--;
        }
            return  true;
    }
    public static  boolean isPalindromeInplace(ListNode head){

        if(head==null||head.next==null) return true;
        boolean result=true;
        //find the end of first half and reverse second half;
        ListNode firstEnd=endOfFirstHalf(head);
        System.out.println(firstEnd.val+" "+firstEnd.next.val);
        ListNode secondEndstart=reverseList(firstEnd);
        System.out.println( secondEndstart.val);
        ListNode p1=head;
        ListNode p2=secondEndstart;
        while(result&&p2!=null){
            if(p1.val!=secondEndstart.val){ result= false;}
            p1=p1.next;
            p2=p2.next;
        }
        firstEnd.next=endOfFirstHalf(secondEndstart);
        return  result;
    }

    public static ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;

        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static ListNode endOfFirstHalf(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            System.out.println(slow.val+" "+ slow.next.val);
        }

        return  slow;
    }

    public static void main(String[] args) {
        int test=-121;
       // System.out.println(isPalindrome(test));
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next =new ListNode(2);
         head.next.next=new ListNode(1);
        System.out.println(isPalindromeInplace(head));
    }

}
